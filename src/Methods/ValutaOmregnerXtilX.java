package Methods;

import java.util.Scanner;

public class ValutaOmregnerXtilX {
    static Scanner scanner = new Scanner(System.in);

    static double sek(double beloeb){
            double res = 0;
            double sekdkk = 0.66;
            double seknok = 1.05;
            double sekeur = 0.09;
            double sekisk = 13.4;

            System.out.println("Hvilken valuta ønsker du at konvertere til?");
            System.out.println("Tast 1 for DKK");
            System.out.println("Tast 2 for NOK");
            System.out.println("Tast 3 for EUR");
            System.out.println("Tast 4 for ISK");
            int valuta1 = scanner.nextInt();

            switch (valuta1){
                case 1: res = beloeb * sekdkk; break;
                case 2: res = beloeb * seknok; break;
                case 3: res = beloeb * sekeur; break;
                case 4: res = beloeb * sekisk; break;
            }
            System.out.println("Beløb til udbetaling: "+res);
            return res;
    }

    static double dkk(double beloeb){
        double res = 0;
        double dkksek = 1.53;
        double dkknok = 1.60;
        double dkkeuro = 0.13;
        double dkkisk = 20.41;

        System.out.println("Hvilken valuta ønsker du at konvertere til?");
        System.out.println("Tast 1 for SEK");
        System.out.println("Tast 2 for NOK");
        System.out.println("Tast 3 for EUR");
        System.out.println("Tast 4 for ISK");
        int valuta1 = scanner.nextInt();

        switch (valuta1){
            case 1: res = beloeb * dkksek; break;
            case 2: res = beloeb * dkknok; break;
            case 3: res = beloeb * dkkeuro; break;
            case 4: res = beloeb * dkkisk; break;
        }
        System.out.println("Beløb til udbetaling: "+res);
        return res;
    }

    static double nok(double beloeb){
        double res = 0;
        double nokdkk = 0.63;
        double noksek = 0.96;
        double nokeuro = 0.08;
        double nokisk = 12.82;

        System.out.println("Hvilken valuta ønsker du at konvertere til?");
        System.out.println("Tast 1 for DKK");
        System.out.println("Tast 2 for SEK");
        System.out.println("Tast 3 for EUR");
        System.out.println("Tast 4 for ISK");
        int valuta1 = scanner.nextInt();

        switch (valuta1){
            case 1: res = beloeb * nokdkk; break;
            case 2: res = beloeb * noksek; break;
            case 3: res = beloeb * nokeuro; break;
            case 4: res = beloeb * nokisk; break;
        }
        System.out.println("Beløb til udbetaling: "+res);
        return res;
    }

    static double eur(double beloeb) {
        double res = 0;
        double eurdkk = 7.46;
        double eursek = 11.38;
        double eurnok = 11.86;
        double eurisk = 152.29;

        System.out.println("Hvilken valuta ønsker du at konvertere til?");
        System.out.println("Tast 1 for DKK");
        System.out.println("Tast 2 for SEK");
        System.out.println("Tast 3 for NOK");
        System.out.println("Tast 4 for ISK");
        int valuta1 = scanner.nextInt();

        switch (valuta1) {
            case 1:
                res = beloeb * eurdkk;
                break;
            case 2:
                res = beloeb * eursek;
                break;
            case 3:
                res = beloeb * eurnok;
                break;
            case 4:
                res = beloeb * eurisk;
                break;
        }
        System.out.println("Beløb til udbetaling: " + res);
        return res;
    }

    static double isk(double beloeb){
        double res = 0;
        double iskdkk = 0.05;
        double isksek = 0.08;
        double isknok = 0.08;
        double iskeur = 0.01;

        System.out.println("Hvilken valuta ønsker du at konvertere til?");
        System.out.println("Tast 1 for DKK");
        System.out.println("Tast 2 for SEK");
        System.out.println("Tast 3 for NOK");
        System.out.println("Tast 4 for EUR");
        int valuta1 = scanner.nextInt();

        switch (valuta1) {
            case 1:
                res = beloeb * iskdkk;
                break;
            case 2:
                res = beloeb * isksek;
                break;
            case 3:
                res = beloeb * isknok;
                break;
            case 4:
                res = beloeb * iskeur;
                break;
        }
        System.out.println("Beløb til udbetaling: " + res);
        return res;
    }
    
    public static void main(String[] args) {
        double beloeb = 0;
        while (true) {
            System.out.println("Velkommen til hæveautomaten.");
            System.out.println("Hvilken valuta ønsker du at konvertere fra? (Tast 0 for at afslutte)");
            System.out.println("Tast 1 for DKK");
            System.out.println("Tast 2 for SEK");
            System.out.println("Tast 3 for NOK");
            System.out.println("Tast 4 for EUR");
            System.out.println("Tast 5 for ISK");
            int valuta = scanner.nextInt();
            if (valuta == 0)
                break;

            switch (valuta) {
                case 1:
                    System.out.println("Hvor mange penge ønsker du at veksle?");
                    beloeb = scanner.nextInt();
                    dkk(beloeb);
                    break;

                case 2:
                    System.out.println("Hvor mange penge ønsker du at veksle?");
                    beloeb = scanner.nextDouble();
                    sek(beloeb);
                    break;

                case 3:
                    System.out.println("Hvor mange penge ønsker du at veksle?");
                    beloeb = scanner.nextDouble();
                    nok(beloeb);
                    break;

                case 4:
                    System.out.println("Hvor mange penge ønsker du at veksle?");
                    beloeb = scanner.nextDouble();
                    eur(beloeb);
                    break;

                case 5:
                    System.out.println("Hvor mange penge ønsker du at veksle?");
                    beloeb = scanner.nextDouble();
                    isk(beloeb);
                    break;
            }
        } // while-loop slut

        System.out.println("Tak for besøget.");
    }
}
