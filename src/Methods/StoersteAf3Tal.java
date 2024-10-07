package Methods;

public class StoersteAf3Tal {
    static int max(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int m = max(max(10, 7), 9); // Den udregner først max(10,7) og vælger den største - denne tildeles a. Derefter fordeler den det på b
        System.out.println("Max = "+m);
    }
}
