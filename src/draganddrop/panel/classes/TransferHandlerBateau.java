/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddrop.panel.classes;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.TransferHandler;
import javax.swing.table.TableModel;

/**
 *
 * @author Nabot
 */
public class TransferHandlerBateau extends TransferHandler
{
  public boolean canImport(JComponent cp, DataFlavor[] df)
  {
    return hasBateauFlavor(df);
  }
  
  public boolean importData(JComponent cp, Transferable df)
  {
    if (hasBateauFlavor(df.getTransferDataFlavors()))
    {
      JTable jtable = (JTable) cp;
      
      try
      {
        Bateau bateau = (Bateau) df.getTransferData(DataFlavorBateau.getBateauFlavor());
        TableModel tableModel = jtable.getModel();
        if (tableModel instanceof TableModelBateau)
        {
          ((TableModelBateau) tableModel).setValueAt(bateau, jtable.getDropLocation().getRow(), 0);
        }
        return true;
      }
      catch (UnsupportedFlavorException | IOException ex)
      {
        System.err.println(ex.getMessage());
      }
    }
    return false;
  }

  private boolean hasBateauFlavor(DataFlavor[] flavors)
  {
    // cas normalement impossible :
    if (DataFlavorBateau.getBateauFlavor() == null)
    {
      return false;
    }

    for (int i = 0; i < flavors.length; i++)
    {
      if (DataFlavorBateau.getBateauFlavor().equals(flavors[i]))
      {
        return true;
      }
    }
    return false;
  }

  protected Transferable createTransferable(JComponent cp)
  {
    JTable jtable = (JTable) cp;
    TableModeListBateau model = (TableModeListBateau) jtable.getModel();
    return new TransferableBateau((Bateau) model.getLine(jtable.getSelectedRow()));
  }

  public int getSourceActions(JComponent cp)
  {
    return COPY;
  }
}
