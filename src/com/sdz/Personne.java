package com.sdz;

/**
 * Personne
 */
public class Personne {

  int age;
  String nom;

  Personne() {
  }

  Personne(int age, String name) {
    this.age = age;
    this.nom = name;
  }

  public String toString() {
    return this.nom + " a " + this.age + " ans.";
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


}
