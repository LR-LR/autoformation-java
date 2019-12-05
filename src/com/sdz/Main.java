package com.sdz;

import java.lang.reflect.*;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    String nom = Paire.class.getName();
    try {
      // On crée un objet class
      Class<?> cl = Class.forName(nom);
      // Nouvelle instance de la calsse Paire
      Object o = cl.newInstance();

      // On crée les paramètres du constructeur
      Class<?>[] types = new Class[] { String.class, String.class };
      // On récupère le constructeur avec les deux paramètres
      Constructor<?> ct = cl.getConstructor(types);

      // On instancie l'objet avec le constucteur surchargé !
      Object o2 = ct.newInstance(new String[] { "valeur 1 ", "valeur 2" });

      // On va chercher la méthode toString(), elle n'a aucun paramètre
      Method m = cl.getMethod("toString", null);

      // La méthode invoke exécute la méthode sur l'objet passé en paramètre
      // Pas de paramètre, donc null en deuxième paramètre de la méthode invoke
      System.out.println("---------------------------------------------");
      System.out.println("Méthode " + m.getName() + " sur o2: " + m.invoke(o2, null));
      System.out.println("Méthode " + m.getName() + " sur o: " + m.invoke(o, null));
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
