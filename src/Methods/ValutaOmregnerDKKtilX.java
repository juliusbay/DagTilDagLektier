package Methods;

import java.util.Scanner;

public class ValutaOmregnerDKKtilX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sek = 1.53;
        double nok = 1.60;
        double fieuro = 7.46;
        double isk = 20.41;

        System.out.println("Velkommen til vekselautomaten.");
        System.out.println("Her kan du veksle fra danske kroner til svenske, norske, finske eller islandske kroner.");
        double kroner = -1;

        while (true) //Kan bruges til at lave infinite-loop indtil brugeren selv afslutter.
        {
            System.out.print("Indtast beløb i DKK, du vil veksle. (Tast 0 for at afslutte)");
            kroner = scanner.nextDouble();
            if (kroner == 0)
                break;


            System.out.println("Hvilken valuta vil du veksle til?");
            System.out.println("Tast 1 for svenske kroner.");
            System.out.println("Tast 2 for norske kroner.");
            System.out.println("Tast 3 for finske euro.");
            System.out.println("Tast 4 for islandske kroner.");
            int valuta = scanner.nextInt();

            switch (valuta)
            {
                case 1:
                    kroner = kroner * sek;
                    break;
                case 2:
                    kroner = kroner * nok;
                    break;
                case 3:
                    kroner = kroner * fieuro;
                    break;
                case 4:
                    kroner = kroner * isk;
                    break;
                default:
                    System.out.println("Ugyldigt input, prøv igen.");
                    continue;
            }
            System.out.println("Til udbetaling: "+kroner);
        }
        System.out.println("Hæveautomaten lukkes.");

    }
}
