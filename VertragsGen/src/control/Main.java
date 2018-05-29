package control;

import model.NatuerlichePartei;

public class Main {

	public static void main(String[] args) {
		
		NatuerlichePartei np = new NatuerlichePartei();
		np.setStrasse("s");
		np.setHausnummer(1);
		np.setHausnummerZusatz("1a");
		np.setOrt("Berlin");
		np.setTelnummer(1234);
		np.setName("Hans");
		np.setVorname("sad");

		Database.writeNatuerlichePartei(np);
		//np = Database.readNatuerlichePartei(3);
		System.out.println(np.getStrasse());
	}
}
