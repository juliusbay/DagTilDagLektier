package JavabogOpgaver.Løkker;

import java.util.Scanner;

public class GaetEtTal {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int tal = (int) (Math.random()*100+1);
        int taeller = 0;
        int gaet = 0;

        System.out.println("Gæt et tal mellem 1-100");
        while (gaet != tal) // Brugte originalt for-loop, men det er bedre i situationer, hvor man ved, hvor mange gange loopet kører.
        {
            gaet = tastatur.nextInt(); // Rykket ind i loopet, sådan så man kan blive ved med at gætte.
            taeller = taeller + 1;
            if (gaet > tal)
                System.out.println("Lavere");

            if (gaet < tal)
                System.out.println("Højere");

            if (gaet == tal) // man kan også tilføje et else statement ovenover og fjerne (gaet == tal), da der ikke er flere udfald.
                System.out.println("Korrekt! Du har brugt "+taeller+" forsøg.");
        }
    }
}
