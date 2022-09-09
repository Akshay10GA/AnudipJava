
public class RetunMethod {
	static int Addition(int a, int b) {
		return (a+b);
	}
	static int Substraction(int a, int b) {
		return (a-b);
	}
	static int Multiply(int a, int b) {
		return (a*b);
	}
	static int Division(int a, int b) {
		return (a/b);
	}
	static int Modulo(int a, int b) {
		return (a%b);
	
	}
	public static void main(String[] args) {
		int sum = Addition(50,60);
		int sub = Substraction(50,60);
		int mul = Multiply(50,60);
		int div = Division(100,60);
		int mod = Modulo(50,60);
		System.out.println("Addition is :"+ sum);
		System.out.println("Substaction is :"+ sub);
		System.out.println("Multiplication is :"+ mul);
		System.out.println("Division is :"+ div);
		System.out.println("Modulo is :"+ mod);
	}

}
