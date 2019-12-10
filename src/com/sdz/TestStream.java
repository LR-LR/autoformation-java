package com.sdz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TestStream
 */
public class TestStream {
  public static void main(String[] args) {
    List<Personne> listP = Arrays.asList(new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
        new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
        new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
        new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
        new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
        new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
        new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON));

    // Utilisation basique des streams
    Stream<Personne> sp = listP.stream();
    sp.forEach(System.out::println);

    System.out.println("\nStreams avec filtre :");
    sp = listP.stream();
    sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);

    System.out.println("\nStreams avec filtre et map :");
    sp = listP.stream();
    sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).forEach(System.out::println);

    System.out.println("\nStreams avec filtre, map et reduce");
    sp = listP.stream();
    Double sum =
        sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).reduce(0.0d, (x, y) -> x + y);
    System.out.println(sum);

    System.out.println("\nStreams avec filtre, map et reduce (poids mini de 250)");
    sp = listP.stream();
    Optional<Double> sum2 =
        sp.filter(x -> x.getPoids() >= 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);
    if (sum2.isPresent())
      System.out.println(sum2.get());
    else
      System.out.println("Aucun agrégat de poids...");

    System.out.println("\nStreams avec filtre, map et count");
    sp = listP.stream();
    long count = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).count();
    System.out.println("Nombre d'éléments : " + count);

    System.out.println("\nStreams avec filtre, map et collect");
    sp = listP.stream();
    List<Double> ld =
        sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).collect(Collectors.toList());
    System.out.println(ld);


    // Utilisation des streams avec les fichiers
    System.out.println("\nStreams avec un fichier");
    String filename = "C:\\Users\\El-haire\\autoformation\\autoformation-java\\readme.md";
    try (Stream<String> sf = Files.lines(Paths.get(filename))) {
      sf.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
