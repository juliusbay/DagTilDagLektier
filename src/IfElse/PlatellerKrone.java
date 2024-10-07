package IfElse;

import java.util.Random;

public class PlatellerKrone {
    public static void main(String[] args) {
        Random gen = new Random();   //Random er en variabel, new Random er en metode
        int tal = gen.nextInt(2);   // Brug gen.nextInt() til random tal - parentes henviser til antal udfald (0 til 1) 
        System.out.println(tal);

        if (tal > 0.5)
        {
            System.out.println("Krone");
            System.out.println("Tillykke med kronen");
        }
        else
        {
            System.out.println("Plat");
            System.out.println("Tillykke du er plat");
        }
    } // Blokparentes til hvis du skal lave flere statements
}