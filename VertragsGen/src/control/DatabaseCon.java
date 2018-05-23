package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCon {

	 public static Connection connect() {
	        Connection conn = null;
	        try {
	            // db parameters
	            String url = "jdbc:sqlite:C:/Users/Benji/Documents/PSE Projekt/VertragsGen.sqlite";
	            // create a connection to the database
	            conn = DriverManager.getConnection(url);
	            
	            System.out.println("Connection to SQLite has been established.");
	            
	            return conn;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            return conn;
	            
	        } /*finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }*/
	    }
	
}
