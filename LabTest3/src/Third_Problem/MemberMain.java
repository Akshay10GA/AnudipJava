package Third_Problem;

public class MemberMain {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.setName("Akshay");
		em.setAge(24);
		em.setMobNo("7276977215");
		em.Salary = "30000";
		em.setSpecialization("Testing");
		
		System.out.println("Employee Details :");
		System.out.println("Name : "+em.getName());
		System.out.println("Age : "+em.getAge());
		System.out.println("Mobile Number : "+em.getMobNo());
		em.printSalary();
		System.out.println("Specialization : "+em.getSpecialization());
		
		Manager mn = new Manager();
		mn.setName("Pranay");
		mn.setAge(26);
		mn.setMobNo("9764826451");
		mn.Salary = "70000";
		mn.setDepartment("Hiring and Staffing");
		
		System.out.println();
		System.out.println("Manager Details :");
		System.out.println("Name : "+mn.getName());
		System.out.println("Age : "+mn.getAge());
		System.out.println("Mobile Number : "+mn.getMobNo());
		mn.printSalary();
		System.out.println("Department : "+mn.getDepartment());
		
		
		
		

	}

}
