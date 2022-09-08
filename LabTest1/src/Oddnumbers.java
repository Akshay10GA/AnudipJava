
public class Oddnumbers {

	public static void main(String[] args) {
		System.out.print("Odd numbers from 1 to 20 are : ");
		for(int i = 1;i<=20;i++) {
			if (i%2 == 0) {
				continue;
			}else {
				System.out.print(i+" ");
			}
			
		}
	}

}
