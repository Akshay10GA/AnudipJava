package SecondProblem;

public class CountMain {

	public static void main(String[] args) {
		VowelsCounting vc = new VowelsCounting();
		
		try {
			System.out.println(vc.countVowels("Anudip Foundation"));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
