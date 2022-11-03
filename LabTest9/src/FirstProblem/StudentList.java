package FirstProblem;
import java.util.*;
public class StudentList {
	public static ArrayList <Student> list1;
	public static void fillList() {
		list1 = new ArrayList <Student>();
		Student s1 = new Student(1,"Suraj","9552956768");
		Student s2 = new Student(2,"Samarth","9422565458");
		Student s3 = new Student(3,"Ishwar","8802645156");
		
		list1.add(s2);
		list1.add(s1);
		list1.add(s3);
		
		Collections.sort(list1,new IDComparator());
		System.out.println("After sorting by ID : ");
		for(Student c:list1) {
			System.out.println(c);
		}
		System.out.println();
		Collections.sort(list1,new nameComparator());
		System.out.println("After sorting by Name : ");
		for(Student c:list1) {
			System.out.println(c);
		}
	}
	
//	public static void printList() {
//		Collections.sort(list1,new IDComparator());
//	}

	public static void main(String[] args) {
		fillList();
	}


}
