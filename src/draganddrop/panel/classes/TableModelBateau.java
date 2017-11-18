/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddrop.panel.classes;

import java.util.List;

/**
 *
 * @author Nabot
 */
public class TableModelBateau extends TableModeListBateau
{

  public TableModelBateau(List<Bateau> bateaux)
  {
    super(bateaux);
  }

  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex)
  {
    if (aValue instanceof Bateau)
    {
      Bateau bateau = (Bateau) aValue;

      add(rowIndex, bateau);
    }
  }

  private void add(int rowIndex, Bateau bateau)
  {
    model.add(rowIndex, bateau);

    fireTableRowsInserted(rowIndex, rowIndex);
  }
}
