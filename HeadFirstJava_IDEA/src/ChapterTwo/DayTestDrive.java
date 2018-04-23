package ChapterTwo;

public class DayTestDrive {
    public static void main(String[] args) {

        int x = 1;
        while (x < 8) {
            Day day = new Day();
            day.dayNum = x;
            day.printDay();
            x += 1;


        }

    }
}
