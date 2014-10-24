import java.util.Scanner;

public class BetterFaveNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your favorite number: ");
        try {
            int faveNum = Integer.valueOf(scanner.nextLine());
            System.out.println("Actually, I think " + (faveNum + 1) + " is a better number.");
        } catch(NumberFormatException nfe) {
            System.out.println("Sorry, not a number");
            System.exit(1);
        }
    }
}

