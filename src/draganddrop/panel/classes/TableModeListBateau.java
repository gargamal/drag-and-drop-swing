/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddrop.panel.classes;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nabot
 */
public class TableModeListBateau extends AbstractTableModel
{

  protected ModelBateau model;

  public TableModeListBateau(List<Bateau> bateaux)
  {
    model = new ModelBateau(bateaux);
  }

  @Override
  public int getRowCount()
  {
    return model.getSize();
  }

  @Override
  public int getColumnCount()
  {
    return 3;
  }

  @Override
  public String getColumnName(int column)
  {
    String columnName = "";

    switch (column)
    {
      case 0:
        columnName = "nom du bateau";
        break;
      case 1:
        columnName = "nom du capitaine";
        break;
      case 2:
        columnName = "age du capitaine";
        break;
    }

    return columnName;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    Object valueAt = null;
    Bateau bateau = model.get(rowIndex);

    switch (columnIndex)
    {
      case 0:
        valueAt = bateau.getNomBateau();
        break;
      case 1:
        valueAt = bateau.getNomDuCapitaine();
        break;
      case 2:
        valueAt = bateau.getAgeDuCapitaine();
        break;
    }

    return valueAt;
  }

  public Bateau getLine(int rowIndex)
  {
    return model.get(rowIndex);
  }
  
  public int getSize()
  {
    return model.getSize();
  }
}
