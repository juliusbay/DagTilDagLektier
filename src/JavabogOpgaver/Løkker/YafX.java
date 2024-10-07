package JavabogOpgaver.Løkker;

public class YafX {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 10)
        {
            System.out.println("y ="+3+"*"+x+"*"+x+"+"+6+"*"+x+"+"+9+"="+(3*x*x+6*x+9));
            x=x+1;
        }

        x = 0;
        while (x <= 100)
        {
            System.out.println("y(2) ="+3+"*"+x+"*"+x+"+"+6+"*"+x+"+"+9+"="+(3*x*x+6*x+9));
            x=x+10;
        }
    }
}
