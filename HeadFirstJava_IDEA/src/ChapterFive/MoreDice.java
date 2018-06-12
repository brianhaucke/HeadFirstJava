package ChapterFive;

public class MoreDice {
    public int enhancedRollDice() {
        int[] myDie = new int[]{1, 2, 3, 4, 5, 6};
        int myRoll = myDie[(int) (Math.random() * 6)];
        System.out.println("My Roll: " + myRoll);
        return myRoll;

    }


    public void determineYahtzee(int v, int w, int x, int y, int z) {

        boolean yahtzee = (v == w && w == x && x == y && y == z);

        boolean fourOfAKind = (((v == w) && (v == x) && (v == y)
                || ((v == w) && (v == x) && (v == z))
                || ((v == w) && (v == y) && (v == z))
                || ((v == x) && (v == y) && (v == z))
                || ((w == x) && (x == y) && (y == z))));

        boolean straight = (((v != w) && (v != x) && (v != y) && (v != z))
                && ((w != x) && (w != y) && (w != z))
                && ((x != y) && (x != z))
                && ((y != z)));

        boolean threeOfAKind =
                (((v == w) && (v == x)
                        || ((v == w) && (v == y)
                        || ((v == w) && (v == z)
                        || ((v == y) && (v == z)
                        || ((v == y) && (v == x)
                        || ((w == x)) && (w == z)
                        || ((w == x)) && (x == y)
                        || (x == y) && (y == z)
                        || (w == y) && (y == z)))))));

        boolean fullHouse =
                (((v == w) && (v == x) && (v != y) && (v != z)) && (y == z)
                        || ((v == w) && (v == y) && (v != x) && (v != z)) && (x == z)
                        || ((v == w) && (v == z) && (v != x) && (v != y)) && (x == y)
                        || ((v == y) && (v == z) && (v != w) && (v != x)) && (w == x)
                        || ((v == y) && (v == x) && (v != w) && (v != z)) && (w == z)
                        || ((v == x) && (x == z)) && (w == y))
                        || ((v == w) && (x == y) && (y == z))
                        || ((v == z) && (w == x) && (x == y));

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
        } else if (straight) {
            System.out.println("You got a Straight");
        } else if (threeOfAKind) {
            if (fullHouse) {
                System.out.println("Full House!");
            } else {
                System.out.println("Three of a Kind!");
            }
        } else if (twoPair) {
            System.out.println("You got two Pair!");
        } else if (pair) {
            System.out.println("You got a Pair!");
        }


    }
}


