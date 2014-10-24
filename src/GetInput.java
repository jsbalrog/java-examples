import java.util.Scanner;

public class GetInput {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = scanner.nextLine();

        System.out.println("Thanks for the name, " + username);
    }
}
