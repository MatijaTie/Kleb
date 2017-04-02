package hr.tvz.programiranje.java.fakultet.glavna;

import java.util.Collections;
import java.util.Scanner;

import hr.tvz.programiranje.java.fakultet.Kolegij;
import hr.tvz.programiranje.java.fakultet.Student;
import hr.tvz.programiranje.java.fakultet.sortiranje.Sortiranje;

public class Glavna {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Unesi podatke za studenta:ime(String) prezime(String) JBMAG(String)");
	String ime = input.nextLine();
	String prezime = input.nextLine();
	String JMBAG = input.nextLine();
	
	Student<Kolegij> s1 = new Student<Kolegij>(ime, prezime, JMBAG);
	System.out.println(s1.getIme() + " " + s1.getPrezime() + " " + s1.getJMBAG());
	
	//Unosi se string+enter+int+enter+int+enter
	for(int i = 0; i < 3; i++){
		System.out.println("Unesite podatke o "+ (i+1) + " kolegiju:naziv(String) ects(Integer) ocjena(Integer)");
		String naziv = input.next();
		Integer ects = input.nextInt();
		Integer ocjena = input.nextInt();
		s1.getListaKolegija().add(new Kolegij(naziv, ects, ocjena));
	}
	
	//ispis
	System.out.println("Ispis:");
	for(int i = 0; i < s1.getListaKolegija().size(); i++ ){
		System.out.println(s1.getListaKolegija().get(i).getNaziv() +
					" ECTS: " + s1.getListaKolegija().get(i).getECTS() +
					" Ocjena: " + s1.getListaKolegija().get(i).getOcjena());
	}
	System.out.println("Ispis s specificnom for petljom:");
	//drugaciji ispis 
	for(Kolegij kolegij : s1.getListaKolegija()){
		System.out.println(kolegij.getNaziv() + " " + kolegij.getECTS() + " " + kolegij.getOcjena());
	}
	
	//Sort
	Collections.sort(s1.getListaKolegija(), new Sortiranje());
	
	//sortirani ispis
	System.out.println("Slozeno po ocjenama:");
	for(int i = 0; i < s1.getListaKolegija().size(); i++ ){
		System.out.println(s1.getListaKolegija().get(i).getNaziv() +
					" " + s1.getListaKolegija().get(i).getECTS() +
					" " + s1.getListaKolegija().get(i).getOcjena());
		}
	
	input.close();
	}
}
