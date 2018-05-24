package model;

import java.util.Date;

public class NatuerlichePartei extends Partei{

	private String name;
	private String vorname;
	private String personalausweisNr;
	private String ausstellungsbehörde;
	private Date  ausstellungsdatum;
	private Date Geburtsdatum;
	
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
	public String getAusstellungsbehörde() {
		return ausstellungsbehörde;
	}
	public void setAusstellungsbehörde(String ausstellungsbehörde) {
		this.ausstellungsbehörde = ausstellungsbehörde;
	}
	public Date getAusstellungsdatum() {
		return ausstellungsdatum;
	}
	public void setAusstellungsdatum(Date ausstellungsdatum) {
		this.ausstellungsdatum = ausstellungsdatum;
	}
	public Date getGeburtsdatum() {
		return Geburtsdatum;
	}
	public void setGeburtsdatum(Date geburtsdatum) {
		Geburtsdatum = geburtsdatum;
	}
	
	
}
