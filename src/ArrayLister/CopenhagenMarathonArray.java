package ArrayLister;

import java.io.*;
import java.util.ArrayList;

public class CopenhagenMarathonArray {
    static void save(ArrayList<Deltager> l) throws IOException{
        for (Deltager d : l){
            FileWriter fil = new FileWriter("src//ArrayLister//"+d.navn+".txt");
            PrintWriter ud = new PrintWriter(fil);

            ud.println("Navn: "+d.navn);
            ud.println("Nummer: "+d.nummer);
            ud.println("Gruppe: "+d.gruppe);
            ud.close();
        }
    }

    public static void main(String[] args) throws IOException
    {
        FileReader fil = new FileReader("src//ArrayLister//Copenhagen Marathon.txt"); //FileReader bruges til at indlæse tekstfiler. Fil skal ligge i mappen.
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<Deltager> deltagerliste = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null) {
            String[] opdel = linje.split(",");
            Deltager d = new Deltager();
            d.navn = opdel[0];
            d.nummer = opdel[1];
            d.gruppe = opdel[2];
            deltagerliste.add(d);
            linje = ind.readLine();
        }
        for (Deltager d : deltagerliste){
            System.out.println(d);
        }
        save(deltagerliste);

    }
    }
    class Deltager {
    String navn;
    String nummer;
    String gruppe;
    }