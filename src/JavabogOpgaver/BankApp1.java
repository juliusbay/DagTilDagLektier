package JavabogOpgaver;

public class BankApp1 {
    public static void main(String[]arg ){
        String navn = "Julius Axelsen";
        double saldo = 1000.25;
        int kontonr = 69;
        System.out.println("Kontonummer: "+kontonr+" har en saldo på: "+saldo+" DKK, og den tilhører "+navn+".");

        saldo = saldo + 100; //100kr indsat på konto
        System.out.println("Kontonummer: "+kontonr+" har en saldo på: "+saldo+" DKK, efter indsætning af 100 DKK, og den tilhører "+navn+".");

        saldo = saldo*1.05; //5% rentetilskrivning
        System.out.println("Kontonummer: "+kontonr+" har en saldo på: "+saldo+" DKK, efter 5% rentetilskrivning, og den tilhører "+navn+".");
    }
}
