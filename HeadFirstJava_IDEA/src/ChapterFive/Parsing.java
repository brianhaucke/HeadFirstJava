package ChapterFive;

public class Parsing {

    String myString = "57";
    int myInt = Integer.parseInt(myString);

    Integer thisInt = 58;
    String thisString = (thisInt.toString());


    public static void main(String[] args) {
        Parsing myParse = new Parsing();
        System.out.println(myParse.myInt);
        System.out.println(myParse.thisString);
    }
}
