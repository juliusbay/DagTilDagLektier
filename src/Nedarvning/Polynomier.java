public class Polynomier {
    public static void main(String[] args) {
        Polynomium f1 = new Foerstegradspolynomium(3);
        System.out.println(f1);
        Polynomium f2 = new Andengradspolynomium(4);
        System.out.println(f2);

    }
}

abstract class Polynomium{
    double f;
    double x;

    Polynomium(){
    }
}

class Foerstegradspolynomium extends Polynomium{
    int a = 3;
    int b = 2;

    Foerstegradspolynomium(double x){
        f = a * x + b;
        this.x = x;
    }

    public String toString(){
        return "f("+x+") = "+a+" * "+x+" + "+b+ " = "+f;
    }
}

class Andengradspolynomium extends Polynomium{
    int a = 2;
    int b = 1;
    int c = 3;

    Andengradspolynomium(double x){
        f = a * Math.pow(x, 2) + b * x + c;
        this.x = x;
    }

    public String toString(){
        return "f("+x+") = "+a+" * "+x+"^2 + "+b+" * "+x+" + "+c+" = "+f;
    }

}