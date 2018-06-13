package ChapterFive;

public class MoreDice {
    public int enhancedRollDice() {
        int[] myDie = new int[]{1, 2, 3, 4, 5, 6};
        int myRoll = myDie[(int) (Math.random() * 6)];
        System.out.println("My Roll: " + myRoll);
        return myRoll;

    }


    void determineYahtzee(int v, int w, int x, int y, int z) {

        /* Booleans v1, v2, w1, etc. used to determine a Straight */
        boolean v1 = (v == 1 || v == 2 || v == 3 || v == 4 || v == 5);
        boolean v2 = (v == 2 || v == 3 || v == 4 || v == 5 || v == 6);

        boolean w1 = (w == 1 || w == 2 || w == 3 || w == 4 || w == 5);
        boolean w2 = (w == 2 || w == 3 || w == 4 || w == 5 || w == 6);

        boolean x1 = (x == 1 || x == 2 || x == 3 || x == 4 || x == 5);
        boolean x2 = (x == 2 || x == 3 || x == 4 || x == 5 || x == 6);

        boolean y1 = (y == 1 || y == 2 || y == 3 || y == 4 || y == 5);
        boolean y2 = (y == 2 || y == 3 || y == 4 || y == 5 || y == 6);

        boolean z1 = (z == 1 || z == 2 || z == 3 || z == 4 || z == 5);
        boolean z2 = (z == 2 || z == 3 || z == 4 || z == 5 || z == 6);

        boolean yahtzee = (v == w && w == x && x == y && y == z);

        boolean fourOfAKind = (((v == w) && (v == x) && (v == y)
                || ((v == w) && (v == x) && (v == z))
                || ((v == w) && (v == y) && (v == z))
                || ((v == x) && (v == y) && (v == z))
                || ((w == x) && (x == y) && (y == z))));

        boolean straight = (v1 && w1 && x1 && y1 && z1) || (v2 && w2 && x2 && y2 && z2);

        boolean threeOfAKind =
                (((v == w) && (v == x)
                        || (v == w) && (v == y)
                        || (v == w) && (v == z)
                        || (v == y) && (v == z)
                        || (v == y) && (v == x)
                        || (w == x) && (w == z)
                        || (w == x) && (x == y)
                        || (x == y) && (y == z)
                        || (w == y) && (y == z)
                        || (v == x) && (x == z)));

        boolean fullHouse =
                (((v == w) && (v == x) && (v != y) && (v != z)) && (y == z)
                        || ((v == w) && (v == y) && (v != x) && (v != z)) && (x == z)
                        || ((v == w) && (v == z) && (v != x) && (v != y)) && (x == y)
                        || ((v == y) && (v == z) && (v != w) && (v != x)) && (w == x)
                        || ((v == y) && (v == x) && (v != w) && (v != z)) && (w == z)
                        || ((v == x) && (x == z)) && (w == y))
                        || ((v == w) && (x == y) && (y == z))
                        || ((v == z) && (w == x) && (x == y))
                        || ((v == y) && (w == x) && (x == z));

        boolean twoPair =
                (v == w) && ((x == y) || (x == z))
                        || (v == x) && ((w == y) || (w == z))
                        || (v == y) && ((w == x) || (w == z))
                        || (v == z) && ((w == x) || (y == x))
                        || (w == z) && (x == y)
                        || (v == z) && (w == y)
                        || (v == x) && (y == z)
                        || (w == y) && (x == z)
                        || (w == z) && (y == z)
                        || (v == y) && (x == z)
                        || (v == w) && (y == z)
                        || (w == x) && (y == z);

        boolean pair =
                (v == w) || (v == x) || (v == y) || (v == z) || (w == x) || (w == y) || (w == z)
                        || (x == y) || (x == z) || (y == z);


        if (yahtzee) {
            System.out.println("Yahtzee!");
        } else if (fourOfAKind) {
            System.out.println("Four of a Kind!");
        } else if (threeOfAKind) {
            if (fullHouse) {
                System.out.println("Full House!");
            } else {
                System.out.println("Three of a Kind!");
            }
        } else if (twoPair) {
            System.out.println("You got TWO Pair!");
        } else if (pair) {
            System.out.println("You got a Pair!");
        } else if (straight) {
            System.out.println("You got a Straight!");
        } else {
            System.out.println("You got Nothing!");
        }


    }
}


