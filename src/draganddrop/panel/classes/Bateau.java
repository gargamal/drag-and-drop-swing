/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddrop.panel.classes;

/**
 *
 * @author Nabot
 */
public class Bateau
{

  private String nomBateau;
  private String nomDuCapitaine;
  private int ageDuCapitaine;

  public Bateau(String nomDuCapitaine, int ageDuCapitaine, String nomBateau)
  {
    this.nomDuCapitaine = nomDuCapitaine;
    this.ageDuCapitaine = ageDuCapitaine;
    this.nomBateau = nomBateau;
  }

  public String getNomBateau()
  {
    return nomBateau;
  }

  public String getNomDuCapitaine()
  {
    return nomDuCapitaine;
  }

  public int getAgeDuCapitaine()
  {
    return ageDuCapitaine;
  }
}
