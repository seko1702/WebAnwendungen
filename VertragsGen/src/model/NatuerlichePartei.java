package model;

public class NatuerlichePartei extends Partei{

	private int id;
	private String name;
	private String vorname;
	private String personalausweisNr;
	private String ausstellungsbehoerde;
	private String ausstellungsdatum;
	private String geburtsdatum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getPersonalausweisNr() {
		return personalausweisNr;
	}
	public void setPersonalausweisNr(String personalausweisNr) {
		this.personalausweisNr = personalausweisNr;
	}
	public String getAusstellungsbehoerde() {
		return ausstellungsbehoerde;
	}
	public void setAusstellungsbehoerde(String ausstellungsbehoerde) {
		this.ausstellungsbehoerde = ausstellungsbehoerde;
	}
	public String getAusstellungsdatum() {
		return ausstellungsdatum;
	}
	public void setAusstellungsdatum(String ausstellungsdatum) {
		this.ausstellungsdatum = ausstellungsdatum;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	
}
