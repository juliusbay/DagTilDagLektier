package Nedarvning;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class BankApp3 {
    public static void main(String[] args) {
        ArrayList<Account> konti = new ArrayList<>();
        ArrayList<Millionaerkonto> lotto = new ArrayList<>();

        Indlaan i1 = new Indlaan("Jill", 3);
        i1.deposit(100);
        i1.withdraw(50);
        i1.printTransactions();
        i1.withdraw(100);

        //_______________________________________

        Hoejrente h2 = new Hoejrente("Joe", 10, 100000, LocalDate.of(2024, 12, 24));
        h2.printTransactions();
        h2.deposit(100);
        h2.withdraw(100);

        //_______________________________________

        Kredit k3 = new Kredit("Alberte", 2.5, 10000);
        k3.deposit(1000);
        k3.withdraw(11100);
        k3.printTransactions();

        konti.add(i1);
        konti.add(h2);
        konti.add(k3);

        /*for (Account a : konti){ // 'a' henviser til alle konti, der er tilføjet til ArrayListen.
            a.annualInterest(); // Rentetilskrivning på alle konti
            a.deposit(100); //100 kr. indsættes på alle konti der tillader det
            a.printTransactions();*/

        Millionaerkonto m3 = new Millionaerkonto("Jack", 2);
        Millionaerkonto m4 = new Millionaerkonto("Mibmub", 1);
        Millionaerkonto m6 = new Millionaerkonto("Alberte", 3);
        m4.lottoVinder();


        //_______________________________________

        Boerneopsparing b5 = new Boerneopsparing("Alberte", 4, 10000, LocalDate.of(2006, 01, 29));
        b5.printTransactions();
        b5.withdraw(100);
        b5.printTransactions();
    }
}


class Account{
    private int accountNo;
    protected String name;
    protected double balance;         // Indestående i kr.
    protected double interestRate;    // Rentesats i %
    protected ArrayList<Transaction> transactions = new ArrayList<>();
    private static int noOfAccounts = 0; //Static betyder at det alle objekterne følger samme variabel.


    Account(String na, double rate){
        noOfAccounts++; //Bliver talt 1 op for hver gang man opretter et objekt via konstruktøren.
        accountNo = noOfAccounts;
        name = na;
        balance = 0;
        interestRate = rate;
    }

    public void deposit(double amount){
        balance = balance + amount;
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

class Indlaan extends Account {

    Indlaan(String name, double rate) {
        super(name, rate); //Henviser til "over"-klassens constructor-variabler.
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Der er ikke penge nok på kontoen til at hæve " + amount + " kr.");
            System.out.println();
        } else {
            super.withdraw(amount); // Henviser til overklassens withdraw-metode.
        }
    }
}

class Hoejrente extends Account {
    LocalDate releaseDate;

    Hoejrente(String name, double rate, double balance, LocalDate releaseDate) {
        super(name, rate);
        this.balance = balance - balance;
        this.releaseDate = releaseDate;
        super.deposit(balance);
    }

    public void deposit(double amount) {
        System.out.println("Du kan ikke indsætte yderligere penge.");
        System.out.println();
    }

    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        if (today.isBefore(releaseDate)) { //Bruges til at sammenligne datoer.
            System.out.println("Du kan ikke hæve pengene før d. 24/12/2024");
            System.out.println();
        } else {
            super.withdraw(amount);
        }
    }
}

class Kredit extends Account {
    public double creditMax;

    Kredit(String name, double rate, double creditMax) {
        super(name, rate);
        this.creditMax = creditMax;
    }

    @Override
    public void withdraw(double amount) {
        double maxAmount = balance + creditMax;
        if (amount > balance + creditMax) {
            System.out.println("Du har forsøgt at hæve " + amount + ", men du kan desværre ikke hæve mere end det tilladte beløb på " + maxAmount + ".");
        } else {
            super.withdraw(amount);
        }
    }

    public void newCreditMax(double newMax) {
        this.creditMax = newMax;
    }
}

class Millionaerkonto extends Account{
    Millionaerkonto (String name, int lottonummer){
    super (name, lottonummer);
    }

    @Override
    public void annualInterest() {
        System.out.println("Vi tilfører desværre ikke renter på denne type konto.");
    }

    public void lottoVinder(){ //Skal denne være static?
        Random r = new Random();
        int vinderTal = r.nextInt(2)+1;
        System.out.println("Tillykke til lottonummer "+vinderTal+"! Du har vundet en million kroner.");
        System.out.println();
    }
}

class Boerneopsparing extends Account{
    LocalDate dateOfBirth;
    LocalDate releaseDate;
    LocalDate expirationDate;

    Boerneopsparing(String name, double rate, double balance, LocalDate dateOfBirth){
        super(name, rate);
        this.balance = balance;
        this.dateOfBirth = dateOfBirth;
        expirationDate = dateOfBirth.plusYears(18);
    }

    public void withdraw(double amount){
        if (LocalDate.now().isBefore(expirationDate)){
            System.out.println("Du kan desværre ikke hæve pengene, før du er fyldt 18.");
        }
        else{
            super.withdraw(amount);
        }
    }
}