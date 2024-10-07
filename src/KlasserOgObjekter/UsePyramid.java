package KlasserOgObjekter;

public class UsePyramid {
    public static void main(String[] args) {
        Pyramide p1 = new Pyramide(4,0);
        Pyramide p2 = new Pyramide(5,5);
        Pyramide p3 = new Pyramide(6,6);

        /*p1.inputCheck(4, -1);
        p2.inputCheck(3.7, 9.8);
        p3.inputCheck(500, 3.5);*/

        System.out.println("Pyramide 1 har en volumen på: "+p1.volumen());
        System.out.println("Pyramide 2 har en volumen på: "+p2.volumen());
        System.out.println("Pyramide 3 har en volumen på: "+p3.volumen());
        System.out.println(p1); //Hvordan det ser ud med toString
        System.out.println(p2);
        System.out.println(p3);
    }
}

class Pyramide {
    private double længde;
    private double højde;

    Pyramide(double l, double h){         //Dette er en konstruktør til pyramiden. Den er defineret i inputcheck-metoden.
        inputCheck(l, h);
    }

    public void inputCheck(double l, double h){
        if (l > 0 && h > 0) {
            længde = l;
            højde = h;
        }
            else
            {
            System.out.println("Ugyldige mål, alle mål sættes til standard.");
            længde = 1;
            højde = 1;
            }
        }

    public double volumen(){
        double volumen = længde * højde / 4;
        return volumen;
        }

    public String toString(){
        return "Pyramiden har en volumen på "+højde+" * "+længde+" / "+4+" = "+volumen();
    }
}
