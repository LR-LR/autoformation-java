package com.sdz;

import java.lang.reflect.*;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    Class<?> c = String.class;
    // La fameuse méthode finale dont e vous parlais dans le chapitre sur l'héritage
    // Cette méthode vient de la classe Object

    // Interfaces
    Class<?>[] faces = c.getInterfaces();
    System.out.println("Il y a " + faces.length + " interfaces implémentés dans la classe " + c.getName());
    for (Class<?> class1 : faces) {
      System.out.println(class1);
    }

    // Méthodes
    Method[] m = c.getMethods();
    System.out.println("\n\nIl y a " + m.length + " méthodes implémentés dans la classe");
    for (Method method : m) {
      System.out.println(method);

      Class<?>[] p = method.getParameterTypes();
      for (Class<?> param : p) {
        System.out.println(param.getName());
      }

      System.out.println("----------------------------------\n");
    }

    // Champs
    Field[] f = c.getDeclaredFields();
    System.out.println("\n\nIl y a " + f.length + " champs dans cette classe");
    for (Field field : f) {
      System.out.println(field.getName());
    }

    // Constructeurs
    Constructor[] construc = c.getConstructors();
    System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
    for (Constructor constructor : construc) {
      System.out.println(constructor.getName());

      Class<?>[] param = constructor.getParameterTypes();
      for (Class<?> params : param) {
        System.out.println(params);
      }
      System.out.println("-----------------------------\n");
    }
  }
}
