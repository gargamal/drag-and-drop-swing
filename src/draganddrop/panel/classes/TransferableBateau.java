/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddrop.panel.classes;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 *
 * @author Nabot
 */
class TransferableBateau implements Transferable
{

  private Bateau bateau;

  public TransferableBateau(Bateau bateau)
  {
    this.bateau = bateau;
  }

  public DataFlavor[] getTransferDataFlavors()
  {
    return new DataFlavor[]
            {
              DataFlavorBateau.getBateauFlavor()
            };
  }

  public boolean isDataFlavorSupported(DataFlavor df)
  {
    return (df.equals(DataFlavorBateau.getBateauFlavor()));
  }

  public Object getTransferData(DataFlavor df) throws UnsupportedFlavorException, IOException
  {
    if (df == null)
    {
      throw new IOException();
    }
    if (df.equals(DataFlavorBateau.getBateauFlavor()))
    {
      return bateau;
    }
    else
    {
      throw new UnsupportedFlavorException(df);
    }
  }
}
