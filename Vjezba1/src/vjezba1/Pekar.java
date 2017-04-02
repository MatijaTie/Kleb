package vjezba1;

public class Pekar extends Osoba {
	private int staz;

	public Pekar(String ime, String prezime, int staz) {
		super(ime, prezime);
		this.staz = staz;
		// TODO Auto-generated constructor stub
	}

	@Override
	double izracunajPlacu() {
		return staz * 35.5;
	}
	
	

}
