package IfElse;

import java.util.Random;

public class Dicemann {
    public static void main(String[] args) {
        Random gen = new Random();
        int terning = gen.nextInt(6) + 1;
        System.out.println(terning);
        String activity = "";

        if (terning == 1) {
            activity = "Breakfast";
            } else
            if (terning == 2) {
            activity = "Study";
            } else
            if (terning == 3) {
            activity = "Talk to mom";
            } else
            if (terning == 4) {
            activity = "Dance";
            } else
            if (terning == 5) {
            activity = "Party";
            } else
            if (terning == 6) {
            activity = "BoogieWoogie";
        }

            System.out.println(activity);
    }
}
