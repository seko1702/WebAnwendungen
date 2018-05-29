package model;

public class JuristischePartei extends Partei{
	
	private int id;
	private String firmenname;
	private String handelsregister;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirmenname() {
		return firmenname;
	}
	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}
	public String getHandelsregister() {
		return handelsregister;
	}
	public void setHandelsregister(String handelsregister) {
		this.handelsregister = handelsregister;
	}
	
}
