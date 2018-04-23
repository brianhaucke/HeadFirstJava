package ChapterTwo;

public class Day{
    int dayNum;
    String dayName;
    String suffix;


    void determineSuffix(){
        if (dayNum == 1) {
            suffix = "st";
        } else if (dayNum == 2){
            suffix = "nd";
        } else if (dayNum == 3){
            suffix = "rd";
        } else {
            suffix = "th";
        }
    }

    void printDay(){
        System.out.println("Today is " + dayName + ". The " + dayNum + "" + suffix + " day of the week.");
    }
}
