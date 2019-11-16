package app;

/**
 * Capitale
 */
public class Capitale extends Ville {

  private String monument;

  public Capitale() {
    super();
    this.monument = "aucun";
  }

  public Capitale(String nomVille, int nbreHabitants, String nomPays, String monument) {
    super(nomVille, nbreHabitants, nomPays);
    this.monument = monument;
  }

  /* GETTERS & SETTERS */
  public String getMonument() {
    return this.monument;
  }

  public Capitale setMonument(String monument) {
    this.monument = monument;
    return this;
  }

  /* METHODS */
  public String toString() {
    String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";

    return str;
  }
}
