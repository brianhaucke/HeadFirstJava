package ChapterFive;

public class Casting {
    public static void main(String[] args) {


    long myFutureInt = 42;

    //int x = myFutureInt; -> Won't compile because a long could contain a val larger than an int could store

    //use CASTING to make it work
    int x = (int)myFutureInt;
    System.out.println("myFutureInt is: " + x);

    long myFutureShort = 40002;
    short myShort = (short)myFutureShort;
    System.out.println("This is what happens when you convert a larger primitive to a smaller: " + myShort);

    }

}
