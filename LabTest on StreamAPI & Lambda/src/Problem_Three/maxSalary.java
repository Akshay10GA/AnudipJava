package Problem_Three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Problem_One.Employee;

public class maxSalary {

	public static void main(String[] args) {
		ArrayList<Employee>emp = new ArrayList<>();
		Employee e1 = new Employee("Akshay",24,"Testing",45000);
		Employee e2 = new Employee("Suraj",22,"Development",50000);
		Employee e3 = new Employee("Samarth",19,"Game Development",30000);
		Employee e4 = new Employee("Ishwar",18,"Intern",8000);
		Employee e5 = new Employee("Raviraj",27,"Testing",40000);
		Employee e6 = new Employee("Pratik",23,"HR",30000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		int b = 0;
		int max = 0;
		for(Employee a:emp) {
			if(a.getSalary()>b) {
				b = a.getSalary();
				max = b;
			}
		}
		final int maximum = max;
		List<Employee>li = emp.stream().filter(a -> a.getSalary()==maximum).collect(Collectors.toList());
		System.out.println(li);

	}

}
