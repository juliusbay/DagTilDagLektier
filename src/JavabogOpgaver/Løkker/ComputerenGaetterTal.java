package JavabogOpgaver.Løkker;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerenGaetterTal {
            public static void main(String[] args) {
                Scanner tastatur = new Scanner(System.in);
                Random gen = new Random();

                System.out.println("Skriv et tal mellem 1-100");
                int tal = (int) tastatur.nextInt();
                int taeller = 0; // Til at tælle antal forsøg
                int gaet = 0;
                int upper = 100; //Øvre limit til at afgrænse søgning hver gang
                int lower = 1; //Nedre limit til at afgrænse søgning hver gang

                System.out.println("Gæt et tal mellem 1-100");
                gaet = gen.nextInt(100)+1;

                while (gaet != tal)
                {
                    taeller = taeller + 1;
                    System.out.println(gaet);

                    if (gaet > tal){
                        System.out.println("Lavere");
                        upper = gaet - 1;}


                    if (gaet < tal){
                        System.out.println("Højere");
                        lower = gaet + 1;}

                    gaet = ThreadLocalRandom.current().nextInt(lower, upper+1);
                    //God til at generere tilfældige tal mellem to parametre.

                }
                if (gaet == tal)
                    System.out.println(gaet+" er korrekt! Du har brugt "+taeller+" forsøg.");
            }
        }
