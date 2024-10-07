package Nedarvning;

import java.util.ArrayList;

public class Figurer {
    public static void main(String[] args) {
        ArrayList<Figur> list = new ArrayList<>();
        list.add(new Rektangel (3,7));
        list.add(new Punkt ());
        list.add(new Cirkel(3));
        list.add(new Cirkel(10));
        list.add(new Linje(4));
        for (Figur f:list){
            System.out.print(f);
            System.out.println("\t Areal = "+f.beregnAreal()+". Omkreds = "+f.beregnOmkreds());
        }
    }
}

abstract class Figur{
    abstract double beregnAreal(); // Har ikke {} bagefter, da den er abstract. Metoden skal også defineres som abstract.
    abstract double beregnOmkreds();
}

class Punkt extends Figur{
    double beregnAreal(){
        return 0;
    }

    double beregnOmkreds(){
        return 0;
    }

    public String toString(){
        return "Punktet har ikke nogle mål.";
    }
}

class Linje extends Figur{
    double laengde;

    Linje (double laengde){
        this.laengde = laengde;
    }

    double beregnAreal(){
        return 0;
    }

    double beregnOmkreds(){
        return 2*laengde;
    }

    public String toString(){
        return "Linje l = "+laengde+".";
    }
}

class Cirkel extends Figur{
    double radius;

    Cirkel(double radius){
        this.radius = radius;
    }

    double beregnAreal(){
        return Math.PI*Math.pow(radius, 2);
    }

    double beregnOmkreds() {
        return 2*Math.PI*radius;
    }

    public String toString(){
        return "Cirkel r = "+radius+".";
    }
}

class Rektangel extends Figur{
    double hoejde;
    double bredde;

    Rektangel(double hoejde, double bredde){
        this.hoejde = hoejde;
        this.bredde = bredde;
    }

    double beregnAreal(){
        return hoejde*bredde;
    }

    double beregnOmkreds(){
        return hoejde*2+bredde*2;
    }

    public String toString(){
        return "Rektangel ("+hoejde+", "+bredde+").";
    }
}
