package ArrayLister;

import java.io.*;
import java.util.ArrayList;

public class StudentList {
    static void save(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("src//ArrayLister//StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil); //Bruges ligesom sout, men den skriver det bare ned som linje i txt filen.

        for (String s:l) // Vi har defineret at ArrayListen indeholder Strings. For hver String i listen,
        {                // laver den en ny værdi af s. På denne måde kan vi splitte linjerne i et loop.
            ud.println(s); //Bruger ud.println, da den skal gemme det som fil i stedet for at skrive det i Java.
        }
        ud.close(); //Bruges til at tømme bufferen, så vi er sikre på, at alt kommer med.
}

    public static void main(String[] arg) throws IOException
    {
        FileReader fil = new FileReader("src//ArrayLister//StudentList.txt"); //FileReader bruges til at indlæse tekstfiler. Fil skal ligge i mappen.
        BufferedReader ind = new BufferedReader(fil); //BufferedReader bruges til at læse filen linje for linje.
        ArrayList<String> navneliste = new ArrayList<>();

        String linje = ind.readLine(); //Når der ikke er flere linjer at læse i filen, returnerer denne metode værdien null.
        while (linje != null)
        {
            String[] bidder = linje.split(","); // opdeler linjer fra tekstfil i bidder efter komma
            String fornavn = bidder[1]; //Hvert kommainterval pr. linje kaldes fra 0-x
            navneliste.add(fornavn); //Tilføjer navnet til en ArrayList hver gang, da det ellers ikke vil gemmes.
            linje = ind.readLine();
        }

        navneliste.sort(null); // Bruges til at sortere listen i rækkefølge efter ASCII-tabellen (bogstavets numeriske værdi).
        save(navneliste);
        }
    }
