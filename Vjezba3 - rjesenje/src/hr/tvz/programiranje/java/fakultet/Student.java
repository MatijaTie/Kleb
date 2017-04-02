package hr.tvz.programiranje.java.fakultet;

import java.util.ArrayList;
import java.util.List;

public class Student< T extends Kolegij> {
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJMBAG() {
		return JMBAG;
	}
	public void setJMBAG(String jMBAG) {
		JMBAG = jMBAG;
	}
	public List<T> getListaKolegija(){
		return listaKolegija;
	}
	
	private String ime;
	private String prezime;
	private String JMBAG;
	
	private List<T> listaKolegija;
	
	public Student(String ime, String prezime, String JMBAG){
		this.ime = ime;
		this.prezime = prezime;
		this.JMBAG = JMBAG;
		this.listaKolegija = new ArrayList<T>();
	}
}
