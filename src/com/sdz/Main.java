package com.sdz;

// Packages a importer afin d'utiliser l'objet File
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // Nous déclarons nos objets en dehors du bloc try/catch
    ObjectInputStream ois;
    ObjectOutputStream oos;

    try {
      oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));

      // Nous allons écrire chaque objet Game dans le fichier
      oos.writeObject(new Game("Assasins Creed", "Aventure", 45.69));
      oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
      oos.writeObject(new Game("Tetris", "Stratégie", 2.50));

      // Fermeture du flux
      oos.close();

      // On récupère maintenant les données !
      ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));

      try {
        System.out.println("Affichage des jeux :");
        System.out.println("***************************\n");
        System.out.println(((Game) ois.readObject()).toString());
        System.out.println(((Game) ois.readObject()).toString());
        System.out.println(((Game) ois.readObject()).toString());
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }

      ois.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
