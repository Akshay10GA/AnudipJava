package SecondProblem;
import java.util.*;

import FirstProblem.StudentList;
import ThirdProblem.Student;

public class StudentTree {
	static TreeSet<Student> ts; 
	public static void fillSet() {
		ts = new TreeSet<>(); 
		Student s1 = new Student(1,"Suraj","9552956768");
		Student s2 = new Student(2,"Samarth","9422565458");
		Student s3 = new Student(3,"Ishwar","8802645156");
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.print("Size : ");
		System.out.println(ts.size());
		System.out.print("First Element : ");
		System.out.println(ts.pollFirst());
		System.out.print("Last Elemnet : ");
		System.out.println(ts.pollLast());
			
		
	}
	public static void main(String[]args) {
		fillSet();
	}
}
