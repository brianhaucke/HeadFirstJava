package ChapterTwo;

public class Day{
    int dayNum;
    String dayName;
    String suffix;
    String[] dayArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


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

    void determineDay(){
        if (dayNum == 1){
            dayName = dayArray[0];
            determineSuffix();
        } else if (dayNum == 2) {
            dayName = dayArray[1];
            determineSuffix();
        } else if (dayNum == 3) {
            dayName = dayArray[2];
            determineSuffix();
        } else if (dayNum == 4) {
            dayName = dayArray[3];
            determineSuffix();
        } else if (dayNum == 5) {
            dayName = dayArray[4];
            determineSuffix();
        } else if (dayNum == 6) {
            dayName = dayArray[5];
            determineSuffix();
        } else if (dayNum == 7){
            dayName = dayArray[6];
            determineSuffix();
        }
    }

    void printDay(){
            if (dayNum >= 1 && dayNum <=7) {
                determineDay();
                System.out.println("Today is " + dayName + ". The " + dayNum + "" + suffix + " day of the week.");
            } else {
                System.out.println("Error: " + dayNum + " is an invalid day number.");
            }
        }
    }

