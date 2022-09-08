
public class GreatestUsingIf {

	public static void main(String[] args) {
		int greatest = 0;
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b) {
			if(a>c) {
				greatest = a;
			}else {
				greatest = c;
			}
		}else if(b>c) {
			greatest = b;
		}else {
			greatest = c;
		}
		System.out.println("Greatest number is "+greatest);

	}

}
