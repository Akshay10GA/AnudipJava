package Third_Problem;

public class Member {
	String Name;
	int Age;
	String MobNo;
	String Address;
	String Salary;
	
	Member() {
		super();
	}
	
	void printSalary(){
		System.out.println("Salary : "+Salary);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getMobNo() {
		return MobNo;
	}

	public void setMobNo(String mobNo) {
		MobNo = mobNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


}
