package ChapterFive;

import java.util.Scanner;

public class DynamicDice {

//    Scanner in = new Scanner(System.in);
    int numberOfSides;

    int roll(){
        int x = (int)(Math.random() * numberOfSides + 1);
        return x;
    }
    public void determineYahtzee(int x, int y, int z){
        if (x == y && y == z){
            System.out.println("Yahtzee!");
        } else {
            System.out.println("Not Yahtzee");
        }
    }
}
