/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author aleortiz
 */
public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Albums album = new Albums();
    private int albumID;
    
    public ReadRecord (int fiendID) {
    
       Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.albumID = albumID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void doRead(){
    
        try {
            String query = "Select * FROM albums WHERE albumID = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt (1, albumID);
            
        this.results = ps.executeQuery();
        
            this.results.next();
            
            album.setAlbumID(this.results.getInt("albumID"));
            album.setAlbumName(this.results.getString("albumName"));
            album.setArtistName(this.results.getString("artistName"));
            album.setYearOfRelease(this.results.getInt("yearOfRelease"));
            album.setGenre(this.results.getString("genre"));
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public Albums getAlbum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
