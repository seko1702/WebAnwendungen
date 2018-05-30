 package model;

import java.util.Date;

public abstract class Vertrag {
	
	int id;
	String bezeichnung;
	Partei partei1;
	Partei partei2;
	Date datum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public Partei getPartei1() {
		return partei1;
	}
	public void setPartei1(Partei partei1) {
		this.partei1 = partei1;
	}
	public Partei getPartei2() {
		return partei2;
	}
	public void setPartei2(Partei partei2) {
		this.partei2 = partei2;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}

}
