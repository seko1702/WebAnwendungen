package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.JuristischePartei;
import model.NatuerlichePartei;

public class Database {
	
	//Speichert eine Natuerliche Partei in die Datenbank 
	public static void writeNatuerlichePartei(NatuerlichePartei np) {
		
		String strasse = np.getStrasse();
		int hausnummer = np.getHausnummer();
		String hausnummerZusatz = np.getHausnummerZusatz();
		int plz = np.getPlz();
		String ort = np.getOrt();
		int telnummer = np.getTelnummer();
		String name = np.getName();
		String vorname = np.getVorname();
		String personalausweisNr = np.getPersonalausweisNr();
		String ausstellungsbehoerde = np.getAusstellungsbehoerde();
		String ausstellungsdatum = np.getAusstellungsdatum();
		String geburtsdatum = np.getGeburtsdatum();
	
		try {
			Connection conn = DatabaseCon.connect(); //conn Objekt global machen? 
			Statement sta = conn.createStatement();
			
			String query = "insert into Partei values (null, 'NatürlichePartei', '"+ strasse +"',"+ hausnummer +", '"+ hausnummerZusatz +"',"+ plz +", '"+ ort +"', "+ telnummer +", null , null , '"+ name +"', '"+ vorname +"', '"+ personalausweisNr +"', '"+ ausstellungsbehoerde +"', '"+ ausstellungsdatum +"', '"+ geburtsdatum +"');";
			sta.executeUpdate(query);
			System.out.println("upload succeeded!");
			conn.close();
		}
		catch(SQLException e) {
			 System.out.println(e.getMessage());
		}
	}
	
	//Liest eine Natuerliche Partei aus der Datenbank
	public static NatuerlichePartei readNatuerlichePartei(int id) {
		
		try {
			Connection conn = DatabaseCon.connect();
			Statement sta = conn.createStatement();
			
			String query = "select * from Partei where Partei_ID="+ id;
			ResultSet rs = sta.executeQuery(query);
			
			NatuerlichePartei np = new NatuerlichePartei();
			
			np.setId(id);
			np.setStrasse(rs.getString("strasse"));
			np.setHausnummer(rs.getInt("hausnummer"));
			np.setHausnummerZusatz(rs.getString("hausnummerZusatz"));
			np.setPlz(rs.getInt("plz"));
			np.setOrt(rs.getString("ort"));
			np.setTelnummer(rs.getInt("telefonnummer"));
			np.setName(rs.getString("name"));
			np.setVorname(rs.getString("vorname"));
			np.setPersonalausweisNr(rs.getString("personalausweisNr"));
			np.setAusstellungsbehoerde(rs.getString("austellungsbehoerde"));
			np.setAusstellungsdatum(rs.getString("austellungsdatum"));
			np.setGeburtsdatum(rs.getString("geburtsdatum"));
			
			System.out.println("download succeeded!");
			conn.close();
			
			return np;
		}
		catch(SQLException e) {
			 System.out.println(e.getMessage());
			 return null;
		}
	}
	
	//Speichert eine Juristische Partei in die Datenbank 
public void writeJuristischePartei(JuristischePartei jp) {
		
		String strasse = jp.getStrasse();
		int hausnummer = jp.getHausnummer();
		String hausnummerZusatz = jp.getHausnummerZusatz();
		int plz = jp.getPlz();
		String ort = jp.getOrt();
		int telnummer = jp.getTelnummer(); 
		String firmenname = jp.getFirmenname();
		String handelsregister = jp.getHandelsregister();
	
		try {
			Connection conn = DatabaseCon.connect();
			Statement sta = conn.createStatement();
			
			
			String query = "insert into Partei values (null, 'JuristischePartei', '"+ strasse +"',"+ hausnummer +", '"+ hausnummerZusatz +"',"+ plz +", '"+ ort +"', "+ telnummer +", '"+ firmenname +"', '"+ handelsregister +"',null,null,null,null,null,null)" ;
			sta.executeUpdate(query);
			System.out.println("upload succeeded!");
			conn.close();
		}
		catch(SQLException e) {
			 System.out.println(e.getMessage());
		}
	}

	//Liest eine Juristische Partei aus der Datenbank
	public JuristischePartei readJuristischePartei(int id) {
		
		try {
			Connection conn = DatabaseCon.connect();
			Statement sta = conn.createStatement();
			
			String query = "select  ";
			ResultSet rs = sta.executeQuery(query);
			
			JuristischePartei jp = new JuristischePartei();
			
			jp.setId(id);
			jp.setStrasse(rs.getString("strasse"));
			jp.setHausnummer(rs.getInt("hausnummer"));
			jp.setHausnummerZusatz(rs.getString("hausnummerZusatz"));
			jp.setPlz(rs.getInt("plz"));
			jp.setOrt(rs.getString("ort"));
			jp.setTelnummer(rs.getInt("telefonnummer"));	
			jp.setFirmenname(rs.getString("firmenname"));
			jp.setHandelsregister(rs.getString("handelsregister"));
			
			System.out.println("download succeeded!");
			conn.close();
			
			return jp;
		}
		catch(SQLException e) {
			 System.out.println(e.getMessage());
			 return null;
		}
	}
	
	//Löscht eine Partei aus der Datenbank
	public static void deletePartei(int id) {
		try {
			Connection conn = DatabaseCon.connect();
			Statement sta = conn.createStatement();
			
			String query = "delete from Partei where Partei_ID="+ id;
			sta.executeUpdate(query);
			
			System.out.println("Partei deleted");
			conn.close();
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
