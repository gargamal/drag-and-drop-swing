/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddrop.panel.classes;

import java.awt.datatransfer.DataFlavor;

/**
 *
 * @author Nabot
 */
public class DataFlavorBateau
{

  private static String mimeType = DataFlavor.javaJVMLocalObjectMimeType + ";class=" + Bateau.class.getName();
  private static DataFlavor bateauFlavor = null;

  public static DataFlavor getBateauFlavor()
  {
    try
    {
      bateauFlavor = new DataFlavor(mimeType);
    }
    catch (ClassNotFoundException ex)
    {
      System.err.println(ex.getMessage());
    }
    return bateauFlavor;
  }
}
