package ArrayLister;

import java.io.*;
import java.util.ArrayList;

public class StudentList2 {
    static void save(ArrayList<Student> l) throws IOException {
        FileWriter fil = new FileWriter("src//ArrayLister//StudentListSortedByNameAndID.txt");
        PrintWriter ud = new PrintWriter(fil); //Bruges ligesom sout, men den skriver det bare ned som linje i txt filen.

        for (Student s:l) // Vi har defineret at ArrayListen indeholder Strings. For hver String i listen,
        {                // laver den en ny værdi af s. På denne måde kan vi splitte linjerne i et loop.
            ud.println(s); //Bruger ud.println, da den skal gemme det som fil i stedet for at skrive det i Java.
        }
        ud.close(); //Bruges til at tømme bufferen, så vi er sikre på, at alt kommer med.
}

    public static void main(String[] arg) throws IOException
    {
        FileReader fil = new FileReader("src//ArrayLister//StudentList.txt"); //FileReader bruges til at indlæse tekstfiler. Fil skal ligge i mappen.
        BufferedReader ind = new BufferedReader(fil); //BufferedReader bruges til at læse filen linje for linje.
        ArrayList<Student> liste = new ArrayList<>(); //Kaldes Student, da vi henter fra den nye klasse.

        String linje = ind.readLine(); //Når der ikke er flere linjer at læse i filen, returnerer denne metode værdien null.
        while (linje != null)
        {
            String[] bidder = linje.split(","); // opdeler linjer fra tekstfil i bidder efter komma
            Student s = new Student();
            s.name = bidder[1]; //Henviser til klasse-variablerne fra Student
            s.surname = bidder[2];
            s.iD = bidder[0].substring(0,8);
            liste.add(s); //Tilføjer navnet til en ArrayList hver gang, da det ellers ikke vil gemmes.
            linje = ind.readLine();
        }

        liste.sort(null); // Bruges til at sortere listen i rækkefølge efter ASCII-tabellen (bogstavets numeriske værdi).
        for (Student e:liste){
            System.out.println(e);
        }

        save(liste);
        }
    }

    //Ny klasse til at inkludere flere informationer i samme ArrayList
    class Student implements Comparable<Student>  { //dette viser, at vi skal sammenligne Students med hinanden.
    String name;
    String surname;
    String iD;

    public String toString(){ //Her definerer vi hvordan systemet skal printe studenten. toString er metoden til at printe.
        return iD+": "+name+" "+surname;
    }

        @Override
        public int compareTo(Student o) { //Sammenligner et Student-objekt med et andet Student-objekt (kaldes o)
            return iD.compareTo(o.iD); //Viser at vi skal sammenligne variabel s ID med variabel o ID.
        }
    }