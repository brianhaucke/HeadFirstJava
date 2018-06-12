package ChapterFive;


class FavoriteTune {
    private String BandName;
    private String SongName;
    private String AlbumName;
    private String nothing = "No name given.";

    String getBandName(){
        return BandName;
    }
    void setBandName(String s){
        if (s.length() > 0){
        BandName = s;
        } else {
            System.out.println("Please enter a band name");
            BandName = nothing;

        }
    }

    String getAlbumName(){
        return AlbumName;
    }
    void setAlbumName(String s){
        if (s.length() > 0){
            AlbumName = s;
        } else {
            System.out.println("Please enter an Album Name");
            AlbumName = nothing;
        }
    }


    String getSongName(){
        return SongName;
    }
    void setSongName(String s){
        if (s.length() > 0){
        SongName = s;
        } else {
            System.out.println("Please enter a Song Name");
            SongName = nothing;
        }
    }






}
