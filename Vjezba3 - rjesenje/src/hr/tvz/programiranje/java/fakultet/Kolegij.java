package hr.tvz.programiranje.java.fakultet;

public class Kolegij {
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Integer getECTS() {
		return ECTS;
	}
	public void setECTS(Integer eCTS) {
		ECTS = eCTS;
	}
	public Integer getOcjena() {
		return ocjena;
	}
	public void setOcjena(Integer ocjena) {
		this.ocjena = ocjena;
	}
	
	private String naziv;
	private Integer ECTS;
	private Integer ocjena;
	
	public Kolegij(String naziv, Integer ECTS, Integer ocjena){
		this.naziv = naziv;
		this.ECTS = ECTS;
		this.ocjena = ocjena;
	}
	
}
