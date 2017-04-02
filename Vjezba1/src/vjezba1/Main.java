package vjezba1;
import java.util.*;


public class Main {
	
			
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite ime i prezime voza�a: ");
		String ime_vozaca = input.next();
		String prezime_vozaca = input.next();
		//System.out.println(ime_vozaca + " " + prezime_vozaca);
	
		System.out.println("Unesite te�inu vozila voza�a (u kg): ");
		int tezinaVozila = input.nextInt();
		//System.out.print(tezinaVozila);
		
		System.out.println("Ime i prezime pekara: ");
		String ime_pekara = input.next();
		String prezime_pekara = input.next();
		
		System.out.println("Unesite duljinu radnog staza pekara (u godinama): ") ;
		int staz = input.nextInt();
		
		Vozac prviVozac = new Vozac(ime_vozaca, prezime_vozaca, tezinaVozila);
		System.out.println("Vozac "+prviVozac.getIme()+" "+prviVozac.getPrezime()+" ima pla�u "+prviVozac.izracunajPlacu()+"KN");
		
		Pekar prviPekar = new Pekar(ime_pekara, prezime_pekara, staz);
		System.out.println("Pekar "+prviPekar.getIme()+" "+prviPekar.getPrezime()+" ima pla�u "+prviPekar.izracunajPlacu()+"KN");

	}

}
