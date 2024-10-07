package ArrayLister;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordCount {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src/ArrayLists/WordCount.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> ordliste = new ArrayList<>();
        int i = 0;

        String linje = ind.readLine();
        while (linje != null)
        {
            String[] split = linje.split(" "); //Definerer at hvert ord skal splittes ved mellemrum.

            for (String ord:split) { //Vi går direkte til læsning af elementerne, da vi ikke skal splitte efter et interval.
                ordliste.add(ord); //Tilføjer elementerne til listen her.
            }

            linje = ind.readLine();
        }

        for (String word:ordliste)
        {
            if (word.compareToIgnoreCase("Money") == 0){
                i++;
            }
        }
        System.out.println("Sangen indeholder "+ordliste.size()+" ord.");
        System.out.println("Ordet Money fremgår "+i+" antal gange");
    }
}
