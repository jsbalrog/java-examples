import java.io.*;

public class Pre5Input {

   public static void main (String[] args) {

      //  open up standard input
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String userName = null;

      //  read the username from the command-line; need to use try/catch with the
      //  readLine() method
      System.out.print("Enter your name: ");
      try {
         userName = br.readLine();
      } catch (IOException ioe) {
         System.out.println("IO error trying to read your name!");
         System.exit(1);
      }
      System.out.println("Thanks for the name, " + userName);
   }

}  // end of Pre5Input class
