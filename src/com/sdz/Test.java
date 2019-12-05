package com.sdz;

import com.sdz.comportement.*;

/**
 * Test
 */
class Test {
  public static void main(String[] args) {
    Personnage[] tPers = { new Guerrier(), new Civil(), new Medecin() };

    for (int i = 0; i < tPers.length; i++) {
      System.out.println("\nInstance de " + tPers[i].getClass().getName());
      System.out.println("*****************************************");
      tPers[i].combattre();
      tPers[i].seDeplacer();
      tPers[i].soigner();
    }

    System.out.println("\n*****************************************");
    Personnage pers = new Guerrier();
    pers.soigner();
    pers.setSoin(new Operation());
    pers.soigner();

    // Utilisation classe anonyme
    pers.setSoin(new Soin() {
      public void soigner() {
        System.out.println("Je soigne avec une classe anonyme !");
      }
    });

    pers.soigner();

    // Sans utilisation des lambdas
    // Dialoguer d = new Dialoguer() {
    // public void parler(String question) {
    // System.out.println("Tu as dis : " + question);
    // }
    // };

    // Avec utilisation des lambdas
    Dialoguer d = (s) -> System.out.println("Tu as dis : " + s);
    d.parler("Bonjour !");
  }
}
