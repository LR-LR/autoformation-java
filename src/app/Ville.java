package app;

import java.util.Objects;

public class Ville {

  public static int nbreInstances = 0;
  protected static int nbreInstancesBis = 0;

  protected String nomVille;
  protected String nomPays;
  protected int nbreHabitants;
  protected char categorie;

  public Ville() {
    nbreInstances++;
    nbreInstancesBis++;
    this.nomVille = "Inconnu";
    this.nomPays = "Inconnu";
    this.nbreHabitants = 0;
    this.setCategorie();
  }

  public Ville(String nomVille, int nbreHabitants, String nomPays) {
    nbreInstances++;
    nbreInstancesBis++;
    this.nomVille = nomVille;
    this.nomPays = nomPays;
    this.nbreHabitants = nbreHabitants;
    this.setCategorie();
  }

  public String getNomVille() {
    return this.nomVille;
  }

  public Ville setNomVille(String nomVille) {
    this.nomVille = nomVille;
    return this;
  }

  public String getNomPays() {
    return this.nomPays;
  }

  public Ville setNomPays(String nomPays) {
    this.nomPays = nomPays;
    return this;
  }

  public int getNbreHabitants() {
    return this.nbreHabitants;
  }

  public Ville setNbreHabitants(int nbreHabitants) {
    this.nbreHabitants = nbreHabitants;
    this.setCategorie();
    return this;
  }

  public char getCategorie() {
    return this.categorie;
  }

  // Définit la catégorie de la ville
  private void setCategorie() {

    int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
    char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

    int i = 0;
    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
      i++;

    this.categorie = categories[i];
  }

  public static int getNbreInstancesBis() {
    return nbreInstancesBis;
  }

  // Retourne la description de la ville
  public String toString() {
    return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
        + " habitant(s) => elle est donc de catégorie : " + this.categorie;
  }

  // Retourne une chaîne de caractères selon le résultat de la comparaison
  public String comparer(Ville v1) {
    String str = new String();

    if (v1.getNbreHabitants() > this.nbreHabitants)
      str = v1.getNomVille() + " est une ville plus peuplée que " + this.nomVille;

    else
      str = this.nomVille + " est une ville plus peuplée que " + v1.getNomVille();

    return str;
  }

  /** EQUALS & HASHCODE */
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Ville)) {
      return false;
    }
    Ville ville = (Ville) o;
    return Objects.equals(nomVille, ville.nomVille) && Objects.equals(nomPays, ville.nomPays)
        && nbreHabitants == ville.nbreHabitants && categorie == ville.categorie;
  }

  public int hashCode() {
    return Objects.hash(nomVille, nomPays, nbreHabitants, categorie);
  }

}
