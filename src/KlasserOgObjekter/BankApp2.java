package KlasserOgObjekter;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) { //Static henviser til, at vi ikke skal bruge et objekt for at køre metoden.
        Account a1 = new Account("Julius", 2.5);
        /*a1.accountNo = 1; // Alt dette skriver vi i konstruktøren/constructoren (parentesen ud for Account).
        a1.name = "Julius";
        a1.balance = 0;
        a1.interestRate = 2.5;*/

        a1.deposit(200);
        a1.deposit(500);
        a1.annualInterest(); // Påførsel af renter
        a1.withdraw(600);


        Account a2 = new Account("Rasmus", 2.5);
        a2.withdraw(100);

        a1.printTransactions();
        a2.printTransactions();
    }
}

class Account{
    private int accountNo;
    private String name;
    private double balance;         // Indestående i kr.
    private double interestRate;    // Rentesats i %
    private ArrayList<Transaction> transactions = new ArrayList<>();
    static int noOfAccounts = 0; //Static betyder at det alle objekterne følger samme variabel.


    Account(String na, double rate){
        noOfAccounts++; //Bliver talt 1 op for hver gang man opretter et objekt via konstruktøren.
        accountNo = noOfAccounts;
        name = na;
        balance = 0;
        interestRate = rate;
    }

    public void deposit(double amount){
        balance = balance + amount;
        // Transaction t = new Transaction("Indsæt", amount, balance); - vi behøver ikke definere denne.
        transactions.add(new Transaction("Indsat", amount, balance)); //Tilføjer hvert metodekald til transactions-listen.
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        transactions.add(new Transaction("Hævet", amount, balance)); //Tilføjer hvert metodekald til transactions-listen.
    }

    public void annualInterest(){
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        transactions.add(new Transaction("Renter", interest, balance));
    }

    public void printTransactions(){
        System.out.println(this); // Printer toString-metoden for klassens objekt.
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t:transactions) //Variablen t henviser til klassens objekt.
        System.out.println(t);
        System.out.println();
    }

    public void newName(String nytNavn){
        name = nytNavn;
    }

    public String toString(){
        return "Kontonr "+accountNo+": "+name+" "+balance+" kr.";
    }
}

class Transaction{
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance){
        this.text = text; // Hvis man skriver this."variabel" kalder man på klassens/objektets/instansens variabel.
        date = LocalDate.now();
        this.amount = amount; // Man kunne også skrive pAmount (hvor p står for parameter).
        this.newBalance = newBalance;
    }
    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }
}