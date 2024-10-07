package JavabogOpgaver;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Opgave 1 2.3.3 Alder2
        Random gen = new Random();
        int alder = gen.nextInt(80)+1;
        System.out.println(alder);

        if (alder <= 18) System.out.println("Du er ikke myndig"); // Lav dobbelt && hvis flere betingelser
        else
            if (alder >= 65) System.out.println("Du er pensionist");
            else
                if (alder >= 18) System.out.println("Du er myndig");

        // Opgave 2 2.3.3 Vekselprogram
        Scanner tastatur = new Scanner(System.in); //Brug evt. JOptionPaneshowInputDialog med en String = JOption
        System.out.println("Skriv antal dollars herunder123");
        double dollar = tastatur.nextDouble(); // brug dollar = Double.parseDouble(String)
        double kurs = 0.95;
        double euro = dollar*kurs;

        String dollars = JOptionPane.showInputDialog("Tast dollars her");
        double euros = Double.parseDouble(dollars);
        System.out.println(dollars);


        if (euro >= 0.5) System.out.println(euro*1.02);
            else System.out.println(euro);

        // Opgave 3 2.3.3 Porto-beregning
        Scanner tastatur2 = new Scanner(System.in);
        System.out.println("Skriv vægt i gram på brev herunder");
        int weight = tastatur2.nextInt();
        double porto1 = 1.05;
        double porto2 = 1.10;

        if (weight > 100) System.out.println(weight*porto2); // Lav dobbelt && hvis flere betingelser
        else System.out.println(weight*porto1);

        // Opgave 4 2.3.3
        Scanner tastatur3 = new Scanner(System.in);
        System.out.println("Skriv 3 tilfældige tal");
        int a, b, c;
        a = tastatur3.nextInt();
        b = tastatur3.nextInt();
        c = tastatur3.nextInt();

        if (a > b) System.out.println(a + " er større end "+b); // Lav dobbelt && hvis flere betingelser
        else System.out.println(b + " er større end "+a);
        if (c < b) System.out.println(c + " er mindre end "+b);
        else System.out.println(c + " er større end " +b);
        if (c > a) System.out.println(c + " er større end "+a);
        else System.out.println(a+ " er større end "+c);

    }
}
