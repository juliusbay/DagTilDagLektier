package SwitchJOption;

import javax.swing.*;
import java.util.Random;

public class DicemannSwitch {
    public static void main(String[] args) {
        Random gen = new Random();
        int terning = gen.nextInt(6)+1;
        String activity = ""; //Skal have tom værdi uanset for at definere tekst

        switch (terning)
        { //Husk start Tuborg-parentes

            case 1:
                activity = "Dans";
                break;
            case 2:
                activity ="Hop";
                break;
            case 3:
                activity = "Gå";
            case 4:
                activity = "BoogieWoogie";
                break;
            case 5:
                activity ="Breakdance";
                break;
            case 6:
                activity = "Spis pizza";
        }
        JOptionPane.showMessageDialog(null, activity);
    }
}
