package com.sdz;

/**
 * Personne
 */
public class Personne {
  public Double taille = 0.0d;
  public Double poids = 0.0d;
  public String nom = "";
  public String prenom = "";
  public Couleur yeux = Couleur.INCONNU;

  public Personne() {
  }

  public Personne(double taille, double poids, String nom, String prenom, Couleur yeux) {
    super();
    this.taille = taille;
    this.poids = poids;
    this.nom = nom;
    this.prenom = prenom;
    this.yeux = yeux;
  }

  public String toString() {
    String s = "Je m'appelle " + nom + " " + prenom;
    s += ", je pèse " + poids + " kg";
    s += ", et je mesure " + taille + " cm.";
    return s;
  }


  public Double getTaille() {
    return this.taille;
  }

  public void setTaille(Double taille) {
    this.taille = taille;
  }

  public Double getPoids() {
    return this.poids;
  }

  public void setPoids(Double poids) {
    this.poids = poids;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Couleur getYeux() {
    return this.yeux;
  }

  public void setYeux(Couleur yeux) {
    this.yeux = yeux;
  }
}
