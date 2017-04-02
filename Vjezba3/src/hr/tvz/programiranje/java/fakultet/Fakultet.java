package hr.tvz.programiranje.java.fakultet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Fakultet {
	
	
	
	public static void main(String[] args) {
		//Liste
		//Lista jednostavnog tipa
		System.out.println("Liste:");
		List<String> prvaLista = new ArrayList<String>();
		prvaLista.add("prvi");
		prvaLista.add("drugi");
		prvaLista.add("treci");
		
		//posebna for petlja za ArrayList
		for(String pozicija : prvaLista){
			System.out.println(pozicija);
		}
		//Lista s objektima
		List<Proba> objektLista = new ArrayList<Proba>();
		Proba p1 = new Proba("aa","bbb");
		Proba p2 = new Proba("cc","ddd");
		Proba p3 = new Proba("ee","fff");
		objektLista.add(p1);
		objektLista.add(p2);
		objektLista.add(p3);

		for(Proba obj : objektLista){
			System.out.println(obj.ime + " " + obj.prezime);
		}
		
		//Setovi
		System.out.println("Setovi:");
		Set<String> prviSet = new HashSet<String>();
		prviSet.add("1");
		prviSet.add("2");
		prviSet.add("3");
		prviSet.add("1");
		prviSet.add("2");
		
		for(String pozicija : prviSet){
			System.out.println(pozicija);
		}
		
		Set<Proba> objSet = new HashSet<Proba>();
		Proba p4 = new Proba("aa","ggg");
		Proba p5 = new Proba("cc","ddd");
		objSet.add(p1);
		objSet.add(p2);
		objSet.add(p3);
		objSet.add(p4);
		objSet.add(p5);
		
		for(Proba obj : objSet){
			System.out.println(obj.ime + " " + obj.prezime);
		}
		
		//Mape
		System.out.println("Mape:");
		Map<Long, String> novaMapa = new HashMap<Long, String>();
		novaMapa.put(new Long("123456789"), "ivica");
		novaMapa.put(new Long("789137893"), "klara");
		novaMapa.put(new Long("038932123"), "marin");
		System.out.println(novaMapa.get(new Long("123456789")));
		
		
		Map<Proba, String> objMapa = new HashMap<Proba, String>();
		objMapa.put(p1, "p11");
		objMapa.put(p2, "p22");
		objMapa.put(p3, "p33");
		System.out.println(objMapa.get(p1));
		
		Set<Proba> setKljuceva = objMapa.keySet();
		for(Proba kljuc : setKljuceva){
			System.out.println(kljuc.ime + " " + kljuc.prezime );
		}
	
		
		//Sortovi
		Student st1 = new Student("Pero","Periæ",new Long(1),35);
		Student st2 = new Student("Ivo","Iviæ",new Long(2),110);
		Student st3 = new Student("Jerko","Jerkiæ",new Long(3),
		29);
		Student st4 = new Student("Josip","Krešiæ",new Long(4),2);
		
		Set<Student> sortiraniSet = new TreeSet<Student>(new StudentComparator());
		sortiraniSet.add(st1);
		sortiraniSet.add(st2);
		sortiraniSet.add(st3);
		sortiraniSet.add(st4);
		for (Student st : sortiraniSet) {
		 System.out.println(st.getIme() + " " + st.getPrezime() + " " + st.getBrojBodova());
		}
		
		
		
	}

}
