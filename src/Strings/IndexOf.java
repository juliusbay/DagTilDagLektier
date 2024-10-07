package Strings;

public class IndexOf {
    public static void main(String[] args) {
        String s = "Måske du skulle overveje det, bare måske.";
        System.out.println("Det første mellemrum ligger efter " +s.indexOf(" ")+ " placeringer (starter fra 0).");

        String s1 = s.replace("Måske", "");
        System.out.println(s1);

        String s2 = "Hej";
    }
}
