package com.sdz;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {

    // Liste de voiture
    List<Voiture> listVoiture = new ArrayList<Voiture>();
    listVoiture.add(new Voiture());
    listVoiture.add(new Voiture());

    List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
    listVoitureSP.add(new VoitureSansPermis());
    listVoitureSP.add(new VoitureSansPermis());

    affiche(listVoiture);
    affiche(listVoitureSP);
  }

  // Avec cette méthode, on accepte aussi bien les collections de Voiture que les
  // collection de VoitureSansPermis
  static void affiche(List<? extends Voiture> list) {

    for (Voiture v : list)
      System.out.print(v.toString());
  }
}
