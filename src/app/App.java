package app;

public class App {
    public static void main(String[] args) throws Exception {
        char reponse = 'O';

        System.out.println("CONVERTISSEUR DÉGRES CELSIUS ET DEGRÉS FAHRENHEIT");
        System.out.println("------------------------------------------------");

        do {
            System.out.println("Choisissez le mode de conversion :");
            System.out.println("1 - Convertisseur °C - °F");
            System.out.println("2 - Convertisseur °F - °C");
            int mode;
        } while (reponse == 'O');
    }
}
