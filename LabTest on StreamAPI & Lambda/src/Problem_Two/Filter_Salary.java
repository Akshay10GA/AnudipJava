package Problem_Two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Problem_One.Employee;

public class Filter_Salary {

	public static void main(String[] args) {
		ArrayList<Employee>epr = new ArrayList<>();
		Employee e1 = new Employee("Akshay",24,"Testing",45000);
		Employee e2 = new Employee("Suraj",22,"Development",50000);
		Employee e3 = new Employee("Samarth",19,"Game Development",30000);
		Employee e4 = new Employee("Ishwar",18,"Intern",8000);
		Employee e5 = new Employee("Raviraj",27,"Testing",40000);
		Employee e6 = new Employee("Pratik",23,"HR",30000);
		
		epr.add(e1);
		epr.add(e2);
		epr.add(e3);
		epr.add(e4);
		epr.add(e5);
		epr.add(e6);
		
		List<Employee>li = epr.stream().filter(a -> a.getSalary()>10000).collect(Collectors.toList());
		int count = 0;
		for(Employee a:li) {
			count++;
			System.out.println(a);
		}
		System.out.println();
		System.out.println("Employees having salary more than 10000 are : "+count);
//		int count = 0;
//		for(Employee a:epr) {
//			if(a.getSalary()>10000) {
//				count++;
//				System.out.println(a.getName());
//			}
//		}
//		System.out.println("Employees having salary more than 10000 are : "+count);

	}

}
