package KlasserOgObjekter;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PokerApp {
    public static void main(String[] args) {
        Player Julius = new Player("Julius");
        Player Morten = new Player("Morten");

        Julius.makeDeck();
        Julius.dealHand();
        Morten.makeDeck();
        Morten.dealHand();
        }
    }

class Player {
    String name;
    ArrayList<Card> hand = new ArrayList<>();
    ArrayList<Card> deck = new ArrayList<>();

    Player(String name){
        this.name = name;
    }

    public void makeDeck(){ //Burde nok være sin egen static metode udenfor klassen.
        String hjerter = "Hjerter";
        String spar = "Spar";
        String ruder = "Ruder";
        String klør = "Klør";

        for (int rank = 1; rank <= 13; rank++) {
            deck.add(new Card(hjerter, rank));
        }

        for (int rank = 1; rank <= 13; rank++) {
            deck.add(new Card(spar, rank));
        }

        for (int rank = 1; rank <= 13; rank++) {
            deck.add(new Card(ruder, rank));
        }

        for (int rank = 1; rank <= 13; rank++) {
            deck.add(new Card(klør, rank));
        }
    }

    public void dealHand(){ //dealtCard lavet for at fjerne kortet efter tilføjelse. ThreadLocalRandom til at vælge tilfældigt kort.
        System.out.println(toString()); //Printer navn på spiller.
            for (int i = 1; i <= 5; i++){
                Card dealtCard = deck.remove(ThreadLocalRandom.current().nextInt(0,deck.size())); // Går fra 0 til 51
                hand.add(dealtCard);
                System.out.println("Kort "+i+": "+dealtCard);
        }
        System.out.println(); //Tilføjer mellemrum mellem hænder
    }

    public String toString(){
        return name;
    }
}

class Card{
    int rank;
    String suit;

    Card(String suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String toString(){
        return suit+" "+rank;
    }
}
