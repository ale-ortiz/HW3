package model;


public class Albums {
    
    private int albumID;
    private String albumName;
    private String artistName;
    private int yearOfRelease;
    private String genre;

    public Albums() {
        this.albumID = 0;
        this.albumName = "";
        this.artistName = "";
        this.yearOfRelease = 0;
        this.genre = "";
    }

    public Albums(int albumID, String albumName, String artistName, int yearOfRelease, String genre) {
        this.albumID = albumID;
        this.albumName = albumName;
        this.artistName = artistName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }
    
     public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
       @Override
    public String toString() {
        return "Albums{" + "albumID=" + albumID + ", albumName=" + albumName + ", artistName=" + artistName + ", yearOfRelease=" + yearOfRelease + ", genre=" + genre + '}';
    }

    public void setAlbumName(Albums album) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
