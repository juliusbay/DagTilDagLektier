package JavabogOpgaver.Løkker;

public class LaegSammenTil20 {
    public static void main(String[] args) {
       for (int n=0; n <= 20; n++)
       {
           int sum = 0;
           int taeller = 0;
           for (int i = 0; i <= n; i++)
           {
               taeller = taeller + 1;
               sum = sum + taeller;
           }
           System.out.println(sum);
       }
    }
}
