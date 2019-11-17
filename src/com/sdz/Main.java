package com.sdz;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    try {
      System.out.println(" =>" + (1 / 0));
    } catch (ClassCastException e) {
      e.printStackTrace();
    } finally {
      System.out.println("action faite systématiquement");
    }
  }
}
