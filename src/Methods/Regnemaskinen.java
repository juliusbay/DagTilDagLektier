package Methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskinen {
        static Scanner scanner = new Scanner(System.in); //Hvis man lægger den udenfor metoderne, kan den bruges i alle metoder.

    static double readDouble (String prompt){
        //Nedenstående er try-catch-metode til at fange evt. fejl, der kan ske. F.eks. hvis man taster et bogstav i en double.
        double n = 0;
        boolean ok=false;
        while (!ok) {
            try {
                System.out.println(prompt);
                n = scanner.nextDouble();
                ok = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Ugyldigt input, prøv igen");
                scanner.nextLine(); //Giver mulighed for at brugeren kan taste noget nyt igen. a skal ikke redefineres.
            }
        }
        return n;
    } //metode til at verificere indtastning af tal

    public static void main(String[] args) {
        double a=0 ; double b=0 ; double res = 0;
        char op;

        while (true)
        {
            System.out.println();
            System.out.println("Velkommen til regnemaskinen.");
            System.out.println(" + for addition");
            System.out.println(" - for subtraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for at afslutte");

            System.out.println("Indtast en operator: ");
            op = scanner.next().charAt(0); //Sat til 0, da den kun skal tage første tegn indtastet.
            if (op == 'q') break;

            if (op != '+' && op !='-' && op != '*' && op != '/'){ //Bruges i stedet for "default" case.
                System.out.println("Ugyldigt input, prøv igen");
                continue;}

            a = readDouble("Indtast første tal: ");

            b = readDouble("Indtast andet tal: ");

            switch (op)
            {
                case '+': res = a + b; break;
                case '-': res = a - b; break;
                case '*': res = a * b; break;
                case '/':
                    if (a == 0 || b == 0)
                    {
                        System.out.println("Ugyldigt input, prøv igen");
                        continue;
                    }
                    res = a / b; break;
            }

            System.out.println("Resultat er: "+a+op+b+"="+res);

        }
        System.out.println("Tak for at bruge regnemaskinen.");
    }
}
