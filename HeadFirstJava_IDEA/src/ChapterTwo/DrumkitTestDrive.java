package ChapterTwo;

public class DrumkitTestDrive {
    public static void main (String [] args) {
        Drumkit d = new Drumkit();

        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
    }// end main
}// end class
