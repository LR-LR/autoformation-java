package com.sdz;

import java.io.File;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Création de l'objet file
    File f = new File("test.txt");
    System.out.println("Chemin absolu : " + f.getAbsolutePath());
    System.out.println("Nom : " + f.getName());
    System.out.println("Existe ? : " + f.exists());
    System.out.println("Repertoire ? : " + f.isDirectory());
    System.out.println("Fichier ? : " + f.isFile());

    System.out.println("Affichage des lecteurs à la racine du PC : ");
    for (File file : f.listRoots()) {
      System.out.println(file.getAbsolutePath());
      try {
        int i = 1;
        // On parcour la liste des fichiers et repertoires
        for (File nom : file.listFiles()) {
          System.out.println("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));

          if ((i % 4) == 0) {
            System.out.println("\n");
          }
          i++;
        }
        System.out.println("\n");
      } catch (NullPointerException e) {
        // L'instruction peut générer une NullPointerException
        // S'il n'y a pas de fichier
      }
    }
  }
}
