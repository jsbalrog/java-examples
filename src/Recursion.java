import java.util.Scanner;

public class Recursion {
    boolean val = false;

    public static void main(String[] args) {
		Recursion r = new Recursion();
        boolean answer = r.ask("Do you like the Beatles?");
        System.out.println("Answer was " + answer);
    }

    public boolean ask(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String reply = scanner.nextLine();
        if (reply.equals("yes")) {
            val = true;
        } else if (reply.equals("no")) {
            val = false;
        } else {
            System.out.println("Please answer yes or no");
            ask(question);
        }
        return val;
    }
}

