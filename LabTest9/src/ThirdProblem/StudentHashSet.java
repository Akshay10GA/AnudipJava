package ThirdProblem;
import java.util.*;


public class StudentHashSet {
	
	static TreeSet<Student>sh;
	
	public static void fillHSet() {
		sh = new TreeSet<Student>(); 
		Student s1 = new Student(101,"Suraj","9552956768");
		Student s2 = new Student(102,"Samarth","9422565458");
		Student s3 = new Student(103,"Ishwar","8802645156");
		Student s4 = new Student(104,"Akshay","7499448041");
		Student s5 = new Student(105,"Raviraj","9552858589");
		
		sh.add(s1);
		sh.add(s2);
		sh.add(s3);
		sh.add(s4);
		sh.add(s5);
		
		System.out.println(sh.tailSet(s3));
		
		
		
	}
	
//	public static void printHSet() {
//		Collections.max(s1);
//	}

	public static void main(String[] args) {
		fillHSet();

	}

}
