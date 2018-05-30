package control;

import model.Fahrzeug;
import model.KfzKaufvertrag;
import model.NatuerlichePartei;

public class Main {

	public static void main(String[] args) {

		Database db = new Database();
		
		String x = "Tst, Test, Test,"+db.booleanConv(true)+","+db.booleanConv(false);
		
		
		
		System.out.println(x);
		NatuerlichePartei p1 = new NatuerlichePartei();
		NatuerlichePartei p2 = new NatuerlichePartei();
		Fahrzeug f1 = new Fahrzeug();
		
		KfzKaufvertrag kv = new KfzKaufvertrag();
		
		kv.setAlleinigesEigentum(true);
		kv.setKaufpreis(30000);
		kv.setAnzahlSchluessel(3);
		kv.setBezeichnung("Rechter Kotflügel");
		
//		db.writeKfzKaufvertrag(kv);
		db.writeUnfallschaeden(kv);
		
		
	}

}
