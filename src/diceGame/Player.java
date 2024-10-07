package diceGame;

public class Player {
    Cup cup = new Cup();
    String name;
    int sum = 0;
    int i = 0;

    Player(String name){
        this.name = name;
    }

    void turn(){
        cup.roll();
        sum+=cup.getSum(); // sum = sum + cup.getSum
        i++;
    }

    public String toString(){
        return name;
    }



    public static void main(String[] args) {
        Player p1 = new Player("Julius");

        while (p1.sum < 100) {
            p1.turn();
            System.out.println(p1.sum);
        }
    }
}
