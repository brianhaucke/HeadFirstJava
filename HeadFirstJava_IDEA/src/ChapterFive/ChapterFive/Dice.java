package ChapterFive;

public class Dice {

    public int roll(){
        int x = (int)(Math.random() * 6 + 1);
        return x;
    }
//    public void determineYahtzee(int x, int y, int z){
//
//        if (x == y && y == z){
//            System.out.println("Yahtzee!");
//        } else {
//            System.out.println("Not Yahtzee");
//        }
//    }
public void determineYahtzee(int v, int w, int x, int y, int z){

    if (v == w && w == x && x == y && y == z){
        System.out.println("Yahtzee!");
    } else {
        System.out.println("Not Yahtzee");
    }
}


}
