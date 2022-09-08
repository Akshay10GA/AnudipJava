
public class Switchcase {

	public static void main(String[] args) {
		char ch = '+';
		int a = 20;
		int b = 10;
		
		switch(ch) {
		case '+' : System.out.print("Addition : "+(a+b));
					break;
		case '-' : System.out.print("Substraction : "+(a-b));
					break;
		case '*' : System.out.print("multiplication : "+(a*b));
					break;
		case '/' : System.out.print("Division : "+(a/b));
					break;
		case '%' : System.out.print("Modulo : "+(a%b));
					break;
		default : System.out.print("Invalid value of ch");
		}

	}

}
