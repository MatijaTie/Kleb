package vjezba1;

public class Vozac extends Osoba {
	private int tezinaVozila;

	public Vozac(String ime, String prezime, int tezinaVozila) {
		super(ime, prezime);
		this.tezinaVozila = tezinaVozila;
		// TODO Auto-generated constructor stub
	}

	@Override
	double izracunajPlacu() {
		return tezinaVozila * 50.5;
	}
	
}
