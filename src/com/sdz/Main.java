package com.sdz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    // On déclare nos objets en dehors du try/catch
    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
      // On instancie nos objets :
      // fjs va lire le fichier
      // fos va écrire dans le nouveau
      fis = new FileInputStream(new File("test.txt"));
      fos = new FileOutputStream(new File("test2.txt"));

      // On crée un tableau de byte pour indiquer le nombre de bytes lu à chaque tour
      // de boucle
      byte[] buf = new byte[0];

      // On crée une variable de type int pour y affecter le résultat de la lecture
      // Vaut -1 quand c'est fini
      int n = 0;

      // Tant que l'affectation dans la variable est posible, on boucle
      // Lorsque la lecture du fichier est terminée l'affectation n'est plus possible
      // On sort de la boucle
      while ((n = fis.read(buf)) >= 0) {
        // On écrit dans notre deuxième fichier avec l'objet adéquat
        fos.write(buf);
        // On affiche ce qu'a lu notre boucle au format byte et au format char
        for (byte bit : buf) {
          System.out.println("\t" + bit + "(" + (char) bit + ")");
        }
        System.out.println("");
        // Nous réinitialisons le buffer à vide
        // au cas où les derniers byte lus ne soient pas un multiple de 8
        // Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de
        // doublon en fin de fichier

        buf = new byte[8];
      }

      System.out.println("Copie terminée !");

    } catch (FileNotFoundException e) {
      // Cette exception est levée si l'objet FileInputStream ne trouve aucun fichier
      e.printStackTrace();
    } catch (IOException e) {
      // Celle-ci se produit lors d'une erreur d'écrire ou de lectuer
      e.printStackTrace();
    } finally {
      // On ferme nos flux de données dans un bloc finally pour s'assurer que ces
      // instructions seront exécutées dans tous les cas même si une exception est
      // levée !
      try {
        if (fis != null)
          fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

      try {
        if (fos != null)
          fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
