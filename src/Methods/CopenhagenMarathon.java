package Methods;

public class CopenhagenMarathon {
    public static void info(String navn, int tal, String bogstav)
    {
        System.out.println("Dear "+navn+".");
        System.out.println("We are very happy to receive your registration.");
        System.out.println("Your registration number is "+tal+".");
        System.out.println("You start in group "+bogstav+".");
        System.out.println("Please check in 10 minutes before start.");
        System.out.println("");
    }

    public static void main(String[] args) {
    info("Peter Adams", 1556, "D");
    info("Omar Farooq", 1699, "D");
    info("Lotte Nybo", 843, "B");
    }
}
