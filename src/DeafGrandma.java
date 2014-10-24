import java.util.Scanner;

public class DeafGrandma {

	public static void main(String[] args) {
		System.out.println("HI, SONNY!");

		while(true) {
			Scanner scanner = new Scanner(System.in);
			String response = scanner.nextLine();

			// START put program logic here ---------------
			// Before we begin:
			// 1. To compare strings, we need to compare values, not object references.
			// Therefore, you use the String method string1.equals(string2).
			// 2. To stop a program from executing, use System.exit(0).
			// 3. To get a random year since 1930, use
			// "1930 + Math.round(Math.random() * 20)"
			if(response.equals("BYE")) {
				System.out.println("BYE, SWEETIE!");
				System.exit(0);
			}

			
			if(!response.equals(response.toUpperCase())) {
				System.out.println("HUH?! SPEAK UP, SONNY!!");
			} else {
				long randYear = 1930 + Math.round(Math.random() * 20);
				System.out.println("NO, NOT SINCE " + randYear);
			}
			// END put program logic here -----------------
		}
	}

}

