package hr.tvz.programiranje.java.fakultet;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if( s1.getbrojBodova() > s2.getbrojBodova() ){
			return 1;
		}
		else if( s1.getbrojBodova() < s2.getbrojBodova() ){
			return -1;
		}
		else{
			return 0;
		}
	}

}
