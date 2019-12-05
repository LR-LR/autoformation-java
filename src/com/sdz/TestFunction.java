package com.sdz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Main
 */
public class TestFunction {
  public static void main(String[] args) {

    List<Personne> lPersonne = Arrays.asList(new Personne(10, "toto"), new Personne(20, "titi"),
        new Personne(30, "tata"), new Personne(40, "tutu"));

    Function<Personne, String> f1 = (Personne p) -> p.getNom();
    Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
    System.out.println(transformToListString(lPersonne, f1));
  }
}
