package hr.tvz.programiranje.java.fakultet.sortiranje;
import java.util.Comparator;

import hr.tvz.programiranje.java.fakultet.Kolegij;


	public class Sortiranje implements Comparator<Kolegij> {
		public int compare(Kolegij k1, Kolegij k2) {
			if( k1.getOcjena() > k2.getOcjena() ){
				return 1;
			}
			else if( k1.getOcjena()< k2.getOcjena() ){
				return -1;
			}
			else{
				return 0;
			}
	}
}
