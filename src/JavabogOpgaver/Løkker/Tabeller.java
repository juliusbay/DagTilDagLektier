package JavabogOpgaver.Løkker;

public class Tabeller {
    public static void main(String[] args) {
        for (int tabel = 2; tabel <= 10; tabel++)
        {
            for (int n = 1; n <= 10; n++)
                System.out.println(tabel+"*"+n+"="+tabel*n);
        }
    }
}
