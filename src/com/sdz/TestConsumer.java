package com.sdz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * TestConsumer
 */
public class TestConsumer {

  public static void main(String[] args) {
    List<Personne> lPersonne = Arrays.asList(new Personne(10, "toto"), new Personne(20, "titi"),
        new Personne(30, "tata"), new Personne(40, "tutu"));


    Consumer<Personne> consumer = (Personne p) -> p.setAge(p.getAge() + 13);
    System.out.print("[");
    for (int i = 0; i < lPersonne.size(); i++) {
      System.out.print(
          "#Nom : " + lPersonne.get(i).getNom() + " - âge : " + lPersonne.get(i).getAge() + "#, ");
    }
    System.out.println("]");
    System.out.print("[");
    for (Personne pers : lPersonne) {
      consumer.accept(pers);
      System.out.print("#Nom : " + pers.getNom() + " - âge : " + pers.getAge() + "#, ");
    }
    System.out.println("]");
  }
}
