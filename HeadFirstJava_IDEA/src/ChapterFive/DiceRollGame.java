package ChapterFive;


public class DiceRollGame {
    public static void main(String[] args) {

        MoreDice moreDice = new MoreDice();
        int[] f = new int[5];
        for (int x = 0; x < 5; x++) {
            f[x] = moreDice.enhancedRollDice();
            System.out.println("Die #" + (x + 1));
        }
        moreDice.determineYahtzee(f[0], f[1], f[2], f[3], f[4]);





    }


}

