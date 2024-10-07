package Methods;

public class Invitation {
    static void invitation(String navn)
    {
        System.out.println("Kære "+navn+ ",");
        System.out.println("Vil du komme til min fødselsdag?");
        System.out.println("Fredag d. 13/9-2024");
        System.out.println("Kærlig hilsen Julius.");
        System.out.println();
    }

    public static void main(String[] args) {
        invitation("Birgitte");
        invitation("Bjørn");
        invitation("Adam");
    }
}
