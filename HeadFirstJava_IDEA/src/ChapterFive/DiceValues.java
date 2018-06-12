package ChapterFive;

public class DiceValues {
    public static void main(String[] args) {
        int [] values = {1,2,3,4,5,6};
        int [] numOfRolls = {1,2,3};

        for (int x=1; x <= 3; x++){
            System.out.println((int)(Math.random()* values.length + 1));
        }
        for (int x : numOfRolls){
            System.out.println("Enhanced: " + (int)(Math.random()* values.length + 1));

        }
    }
}
