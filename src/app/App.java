package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char mode, reponse;
        double temperature, conversion;

        System.out.println("CONVERTISSEUR DÉGRES CELSIUS ET DEGRÉS FAHRENHEIT");
        System.out.println("------------------------------------------------");

        do {
            do {
                System.out.println("Choisissez le mode de conversion :");
                System.out.println("1 - Convertisseur °C - °F");
                System.out.println("2 - Convertisseur °F - °C");

                mode = sc.nextLine().charAt(0);

                if (mode != '1' && mode != '2')
                    System.out.println("Mode inconnu, veuillez réitérer votre choix.");

            } while (mode != '1' && mode != '2');

            System.out.println("Température à convertir :");
            temperature = sc.nextDouble();
            sc.nextLine();

            if (mode == '1') { // °C to °F
                conversion = arrondi(((9.0 / 5.0) * temperature) + 32.0, 2);
                System.out.println(temperature + "°C correspond à : " + conversion + "°F");
            } else { // °F to °C
                conversion = arrondi(((temperature - 32) * 5) / 9, 2);
                System.out.println(temperature + "°F correspond à : " + conversion + "°C");
            }

            do {
                System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N' && reponse != 'o' && reponse != 'n');

        } while (reponse == 'O' || reponse == 'o');

        System.out.println("Au revoir !");
    }

    public static double arrondi(double A, int B) {
        return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
