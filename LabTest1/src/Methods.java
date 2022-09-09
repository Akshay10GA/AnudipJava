
public class Methods {
	static void add(int n1,int n2) {
		System.out.print("Addition : ");
		System.out.println(n1+" + "+n2+" = "+ (n1+n2));
	}
	static void sub(int n1,int n2) {
		System.out.print("Substraction : ");
		System.out.println(n1+" - "+n2+" = "+ (n1-n2));
	}
	static void multiply(int n1,int n2) {
		System.out.print("Multiplication : ");
		System.out.println(n1+" x "+n2+" = "+ (n1*n2));
	}
	static void division(int n1,int n2) {
		System.out.print("Division : ");
		System.out.println(n1+" / "+n2+" = "+ (n1/n2));
	}

	public static void main(String[] args) {
		int n1 = 50;
		int n2 = 40;
		add(n1,n2);
		sub(n1,n2);
		multiply(n1,n2);
		division(n1,n2);

	}

}
