package hr.tvz.programiranje.java.fakultet;

public class Student {
	 private String ime;
	 private String prezime;
	 private Long maticniBroj;
	 private Integer brojBodova;
	 
	 public Student(String ime, String prezime, Long maticniBroj, Integer brojBodova){
		 this.ime = ime;
		 this.prezime = prezime;
		 this.maticniBroj = maticniBroj;
		 this.brojBodova = brojBodova;
	 }
	 
	 public Integer getbrojBodova(){
		 return brojBodova;
	 }
	 public String getIme(){
		 return ime;
	 }
	 public String getPrezime(){
		 return prezime;
	 }
	 public Long getMaticniBroj(){
		 return maticniBroj;
	 }
	 public Integer getBrojBodova(){
		 return brojBodova;
	 }
}
