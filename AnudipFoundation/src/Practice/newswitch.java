package Practice;

public class newswitch {

	public static void main(String[] args) {
		String month = "Feb";
		int year = 2024;
		switch(month) {
		case "Jan","Mar","May","Jul","Aug","Oct","Dec" -> System.out.println("No. of days in "+ month +" are 31.");
		case "Apr","Jun","Sept","Nov" -> System.out.println("No. of days in "+ month +" are 30.");
		case "Feb" -> {
						if(year%4 == 0)
							System.out.println("Leap year and No. of days in "+ month +" are 29.");
						else
							System.out.println("No. of days in "+ month +" are 28.");
					}
		default -> System.out.println("Invalid Value");
		}

	}

}
