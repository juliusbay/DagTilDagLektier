package Nedarvning;

import java.util.Scanner;

public class Skakbrikker {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Taarn taarn1 = new Taarn("Sort",1,2);
        Brik taarn2 = new Taarn("Sort",8,2);
    }
}


abstract class Brik {
    String farve;
    protected int positionX;
    protected int positionY;

    Brik(String farve, int x, int y) {
        inputCheck(x, y);
        this.farve = farve;
    }

    public void inputCheck(int x, int y) {
        if (0 < x && x <= 8 && 0 < y && y <= 8) {
            positionX = x;
            positionY = y;
        } else {
            System.out.println("Ugyldigt input, x og y sættes til 1.");
            positionX = 1;
            positionY = 1;
        }
    }

    abstract public boolean kanFlytteTil(int xNy, int yNy);
        /*if (0 < xNy && xNy <= 8 && 0 < yNy && yNy <= 8) {
            positionX = xNy;
            positionY = yNy;
            return true;
        } else {
            System.out.println("Ugyldigt input, positionen forbliver det samme.");
            return false;
        }*/

    /*public String toString() {
        return farve + " brik har position x = " + positionX + " og position y = " + positionY;*/
    }

class Taarn extends Brik{
    Taarn(String name, int positionX, int positionY){
        super (name, positionX, positionY);
    }

    public boolean kanFlytteTil(int xNy, int yNy) {
        if (xNy > 0 && yNy == 0 || xNy == 0 && yNy > 0){
            positionX = xNy;
            positionY = yNy;
            return true;
        }
        else {
            System.out.println("Ugyldigt input.");
            return false;
        }
    }
}

class Bonde extends Brik {
    Bonde(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    public boolean kanFlytteTil(int xNy, int yNy) { //Metoden mangler x-parameter i if statement.
        if (yNy == 1) {
            positionY = yNy; //positionY-yNy
            return true;
        } else {
            return false;
        }
    }
}

class Konge extends Brik {
    Konge(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    public boolean kanFlytteTil(int xNy, int yNy) {
        if (xNy == 1 && yNy == 0 || xNy == 0 && yNy == 1 || xNy == 1 && yNy == 1) {
            positionX = positionX-xNy;
            positionY = yNy;
            return true;
        } else {
            return false;
        }
    }
}


