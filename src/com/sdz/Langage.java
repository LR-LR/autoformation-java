package com.sdz;

public enum Langage {
  // Objets directement construits
  JAVA("Langage JAVA", "Eclipse"), C("Langage C", "Code Block"), CPlus("Langage C++", "Visual Studio"),
  PHP("Langage PHP", "PS Pad");

  private String name = "";
  private String editor = "";

  Langage(String name, String editor) {
    this.name = name;
    this.editor = editor;
  }

  public void getEditor() {
    System.out.println("Éditeur : " + editor);
  }

  public String toString() {
    return name;
  }
}
