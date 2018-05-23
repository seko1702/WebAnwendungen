package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	
	public void writeTest() {		
		try {
			Connection conn = DatabaseCon.connect();
			
			Statement sta = conn.createStatement();
			String sql = "insert into Test values  (1,'Hans')";
			sta.executeUpdate(sql);
			System.out.print("yeah!");
		}
		catch(SQLException e) {
			 System.out.println(e.getMessage());
		}
	}
}
