import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WordShuffle {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
	    List<String> wordList = new ArrayList<String>();
		while(true) {
			System.out.print("Enter a word: ");
			String word = scanner.nextLine();
			if (!word.equals("")) {
				wordList.add(word);
			} else {
				if(wordList.size() < 1) {
					System.out.println("No words entered");
					System.exit(0);
				}
			    Collections.shuffle(wordList, new Random());
				System.out.println("Your words are: " + wordList);
				System.exit(0);
			}
		}
	}
}

