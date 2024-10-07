package diceGame;

public class OneHundred {
    Player p1 = new Player("Julius");
    Player p2 = new Player("Wish Julius");
    Player p3 = new Player("Gustav");

    void play() {
        System.out.println(p1 + "\t" + p2 + "\t\t"+ p3);
        while (p1.sum < 100 && p2.sum < 100 && p3.sum < 100) {
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println(p1.sum + "\t\t" + p2.sum + "\t\t\t\t" + p3.sum);
        }
        if (p1.sum > p2.sum && p1.sum > p3.sum) {
            System.out.println("Tillykke " + p1.name + " du har vundet på " + p1.i + " ture!");
        }
        if (p2.sum > p1.sum && p2.sum > p3.sum) {
            System.out.println("Tillykke " + p2.name + " du har vundet på " + p2.i + " ture!");
        }
        if (p3.sum > p1.sum && p3.sum > p2.sum) {
            System.out.println("Tillykke " + p3.name + " du har vundet på " + p3.i + " ture!");
        }
    }

    public static void main(String[] args) {
        OneHundred game = new OneHundred();
        game.play();
    }
}