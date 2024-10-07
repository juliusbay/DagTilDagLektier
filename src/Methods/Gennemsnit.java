package Methods;

public class Gennemsnit { //HVAD GØR RETURN?
    static void gennemsnit (double tal1, double tal2, double tal3, double tal4)
    {
        double resultat = (tal1 + tal2 + tal3 + tal4) / 4;
        System.out.println(resultat);
    }

    static double gennemsnit2 (double tal5, double tal6, double tal7, double tal8)
    {
        double resultat2 = (tal5 + tal6 + tal7 + tal8)/4;
        return resultat2;
    }

    public static void main(String[] args) {
        System.out.print("Gennemsnittet er ");gennemsnit(3, 4, 5, 6); //Uden return

        //Med return
        double snit = gennemsnit2(3, 4, 5, 6);
        System.out.println("Gennemsnittet er "+snit);
    }
    }
