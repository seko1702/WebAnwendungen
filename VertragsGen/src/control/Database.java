package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.KfzKaufvertrag;

public class Database {

	public void yo() {
		String x = "(null, test, test,test" + booleanConv(true) + "," + booleanConv(false);
		System.out.println(x);
	}

	public void writeTest() {
		try {
			Connection conn = DatabaseCon.connect();

			Statement sta = conn.createStatement();
			String sql = "insert into Test values  (1,'Hans')";
			sta.executeUpdate(sql);
			System.out.print("yeah!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void writeKfzKaufvertrag(KfzKaufvertrag vertrag) {
		
		try {
			Connection conn = DatabaseCon.connect();
			Statement sta = conn.createStatement();
			
			String sql1 = "insert into KfzKaufvertrag values (null, null, null, null,"+booleanConv(vertrag.isAlleinigesEigentum())+
					","+booleanConv(vertrag.isAustauschmotor())+","+vertrag.getAustauschmotorLaufleistung()+","+booleanConv(vertrag.isUnfallschaden())+
					","+booleanConv(vertrag.isUmmeldungUnverzueglich())+
					","+booleanConv(vertrag.isFahrzeugAbgemeldet())+","+booleanConv(vertrag.isFahrzeugschein())+
					","+booleanConv(vertrag.isFahrzeugbrief())+","+booleanConv(vertrag.isStillegungsBescheinigung())+","+booleanConv(vertrag.isUntersuchungsbericht())+
					","+vertrag.getAnzahlSchluessel()+","+vertrag.getKaufpreis()+","+vertrag.getAnzahlung()+")";
			
			
			
			sta.executeUpdate(sql1);
			
			System.out.println("Boom chaka laka");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
    public void writeUnfallschaeden(KfzKaufvertrag vertrag) {
    	
    	Connection conn = DatabaseCon.connect();
    	try {
			Statement sta = conn.createStatement();
			String sql2 = "insert into Unfallschaeden values (null, "
					+ "(SELECT seq FROM sqlite_sequence WHERE name = KfzKaufvertrag),"+vertrag.getBezeichnung()+")";
			sta.executeUpdate(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    }

	public int booleanConv(boolean bool) {

		if (bool == true)
			return 1;
		else
			return 0;

	}

	// public KfzKaufvertrag readKfzKaufvertrag(int ID) {
	//
	// Statement sta;
	// try {
	// Connection conn = DatabaseCon.connect();
	// sta = conn.createStatement();
	// String sql = "SELECT * FROM KfzKaufvertrag WHERE id ="+ID+"";
	// ResultSet rs = sta.executeQuery(sql);
	// rs.next();
	// } catch (SQLException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	//
	//
	//
	//
	//
	// }

}
