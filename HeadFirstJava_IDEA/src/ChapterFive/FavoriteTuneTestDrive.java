package ChapterFive;

public class FavoriteTuneTestDrive {
    public static void main(String[] args) {
        FavoriteTune tune = new FavoriteTune();
        tune.setBandName("Modest Mouse");
        tune.setAlbumName("Good News for People Who Love Bad News");
        tune.setSongName("");

        System.out.println("My favorite band is: " + tune.getBandName());
        System.out.println("My favorite album is: " + tune.getAlbumName());
        System.out.println("My favorite song is: " + tune.getSongName());
    }
}
