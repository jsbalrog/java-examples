import java.util.Scanner;


public class FavoriteNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your favorite number: ");

        int faveNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Actually, I think " + (faveNum + 1) + " is a better number.");
	}
}

