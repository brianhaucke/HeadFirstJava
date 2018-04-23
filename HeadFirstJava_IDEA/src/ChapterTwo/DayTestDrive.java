package ChapterTwo;

public class DayTestDrive {
    public static void main(String[] args) {
        Day one = new Day();
        one.dayNum = 1;
        one.dayName = "Monday";
        one.determineSuffix();

        Day two = new Day();
        two.dayNum = 2;
        two.dayName = "Tuesday";
        two.determineSuffix();

        Day three = new Day();
        three.dayNum = 3;
        three.dayName = "Wednesday";
        three.determineSuffix();

        Day four = new Day();
        four.dayNum = 4;
        four.dayName = "Thursday";
        four.determineSuffix();

        Day five = new Day();
        five.dayNum = 5;
        five.dayName = "Friday";
        five.determineSuffix();

        Day six = new Day();
        six.dayNum = 6;
        six.dayName = "Saturday";
        six.determineSuffix();
        
        Day seven = new Day();
        seven.dayNum = 7;
        seven.dayName = "Sunday";
        seven.determineSuffix();

        one.printDay();
        two.printDay();
        three.printDay();
        four.printDay();
        five.printDay();
        six.printDay();
        seven.printDay();


    }
}
