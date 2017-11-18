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
public class ModelBateau
{

  private List<Bateau> bateaux;

  public ModelBateau(List<Bateau> bateaux)
  {
    this.bateaux = bateaux;
  }

  public int getSize()
  {
    return bateaux.size();
  }
  
  public Bateau get(int index)
  {
    return bateaux.get(index);
  }
  
  public void add(int index, Bateau bateau)
  {
    bateaux.add(index, bateau);
  }
  
  public void remove(int index)
  {
    bateaux.remove(index);
  }
  
  public void remove(Bateau bateau)
  {
    bateaux.remove(bateau);
  }
  
  public boolean contains(Bateau bateau)
  {
    return bateaux.contains(bateau);
  }
}
