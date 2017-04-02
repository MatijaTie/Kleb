package hr.tvz.programiranje.java.glavna;
import hr.tvz.programiranje.java.iznimke.PremaliBrojException;
import hr.tvz.programiranje.java.iznimke.PrevelikiBrojException;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Glavna {
	private static final Logger logger = LoggerFactory.getLogger(Glavna.class);
	private static int trazeniBroj = 0;
	public static void provjeri(int broj) throws PremaliBrojException,PrevelikiBrojException{
		if(broj < trazeniBroj){
			logger.info("Unesen je premali broj");
			throw new PremaliBrojException("Unjeli ste premali broj!");
		}
		else if(broj > trazeniBroj){
			logger.info("Unesen je preveliki broj");
			throw new PrevelikiBrojException("Unjeli ste preveliki broj!");		
		}
		else{}
	}
	
	public static void main(String[] args) {
		logger.info("Korisnik je pokrenuo aplikaciju");
		// TODO Auto-generated method stub
		Random rand = new Random();
		trazeniBroj = rand.nextInt(100) + 1;
		logger.debug("Generiran je random broj :"+ trazeniBroj);
		
		while(true){
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite neki broj:");
			int broj = unos.nextInt();
			try{
				provjeri(broj);
			}
			catch(PrevelikiBrojException exception){
				//System.out.println("Trazeni broj je "+ trazeniBroj); //provjera
				//System.out.println("Vas broj je "+ broj);			   //provjera
				System.out.println("Unjeli ste preveliki broj");
			}
			catch(PremaliBrojException exception){
				//System.out.println("Trazeni broj je "+ trazeniBroj); //provjera
				//System.out.println("Vas broj je "+ broj);			   //provjera
				System.out.println("Unjeli ste premali broj!");
			}
			
			if(broj==trazeniBroj){
				logger.info("Pogodjen je broj");
				System.out.println("Bravo pogodili ste broj " + trazeniBroj);
				logger.info("Kraj");
				break;
			}
		}
	}

}


