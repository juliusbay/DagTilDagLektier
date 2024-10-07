package JavabogOpgaver;

public class Variabler {
    public static void main(String[] args) {
        int længde = 8; //Opgave 2.2.8 - 1
        int bredde = 10;
        int areal = længde * bredde;
        System.out.println(areal);

        //Opgave 2.2.8 - 2
        int x = 7;
        int y = 3*x*x+6*x+9;
        System.out.println(y);

        //Opgave 2.2.8 - 3
        double dollar = 100;
        double kurs = 0.95;
        double euro = dollar*kurs;
        System.out.println("100 dollars er lig med "+euro+ " EUR.");

        //Opgave 2.2.8 - 4
        double tal1 = Math.random();
        double tal2 = Math.random();
        double tal3 = Math.random();
        System.out.println(tal1+" + "+tal2+" + "+tal3); //3 tilfældige tal

        double sum = tal1+tal2+tal3;
        System.out.println(sum); //Summen

        double snit = (tal1+tal2+tal3)/3;
        System.out.println(snit); //Gennemsnit

    }
}
