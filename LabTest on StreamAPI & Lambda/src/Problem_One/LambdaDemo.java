package Problem_One;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaDemo {

	public static void main(String[] args) {
		ArrayList<Employee>ar = new ArrayList<>();
		Employee e1 = new Employee("Akshay",24,"Testing",45000);
		Employee e2 = new Employee("Suraj",22,"Development",50000);
		Employee e3 = new Employee("Samarth",19,"Game Development",30000);
		Employee e4 = new Employee("Ishwar",18,"Intern",12000);
		Employee e5 = new Employee("Raviraj",27,"Testing",40000);
		Employee e6 = new Employee("Pratik",23,"HR",30000);
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
		ar.add(e5);
		ar.add(e6);
		
		Collections.sort(ar, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println("Ascending order => " + ar);

	}

}
