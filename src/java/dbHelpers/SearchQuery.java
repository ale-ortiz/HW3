package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Albums;


public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doSearch (String albumName){
        
        try {
            String query = "SELECT * FROM albums WHERE UPPER(albumName) LIKE ? ORDER BY albumID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + albumName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLTable(){
    String table = "";
    table += "<table border=1>";
    
        try {
            while (this.results.next()){
                
                Albums album = new Albums();
                album.setAlbumID(this.results.getInt("albumID"));
                album.setAlbumName(this.results.getString("albumName"));
                album.setArtistName(this.results.getString("artistName"));
                album.setYearOfRelease(this.results.getInt("yearOfRelease"));
                album.setGenre(this.results.getString("genre"));
                
                table += "<tr>";
                table += "<td>";
                table += album.getAlbumID();
                table += "</td>";
                
                table += "<td>";
                table += album.getAlbumName();
                table += "</td>";
                
                table += "<td>";
                table += album.getArtistName();
                table += "</td>";
                
                table += "<td>";
                table += album.getYearOfRelease();
                table += "</td>";
                
                table += "<td>";
                table += album.getGenre();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?albumID=" + album.getAlbumID() + "> Update </a>" + "<a href=delete?albumID=" + album.getAlbumID() + "> Delete </a>";
                table += "</td>";
                table += "</tr>";
                
            }   } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    table += "</table>";
    
    return table;
}

    public void doUpdate(String albumName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
