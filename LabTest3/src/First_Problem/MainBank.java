package First_Problem;

public class MainBank {

	public static void main(String[] args) {
		Bank_A BA = new Bank_A();
		BA.balance = 1000;
		BA.getBalance();
		
		Bank_B BB = new Bank_B();
		BB.balance = 1500;
		BB.getBalance();
		
		Bank_C BC = new Bank_C();
		BC.balance = 2000;
		BC.getBalance();
		
		
	}

}
