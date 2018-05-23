package control;

public class Main {

	public static void main(String[] args) {
		DatabaseCon.connect();
		Database db = new Database();
		db.writeTest();
	}

}
