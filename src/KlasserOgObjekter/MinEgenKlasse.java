package KlasserOgObjekter;

public class MinEgenKlasse {
    public static void main(String[] args) {
    Appelsin a1 = new Appelsin(1, 4);
    Appelsin a2 = new Appelsin(2, 10);
        System.out.println(a1);
        System.out.println(a2);
    }
}

class Appelsin{
    int nummer;
    double radius;
    double pi;
    double rumfang;

    Appelsin (int n, double r){
        nummer = n;
        radius = r;
        pi = 3.14159265359;
        rumfang = 4*pi*(Math.pow(radius, 3))/3;
    }

    public String toString(){
        return "Appelsin nr "+nummer+" har en radius på "+radius+" og et rumfang på "+rumfang;
    }
}