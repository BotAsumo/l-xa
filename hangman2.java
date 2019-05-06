package läxa;
import java.util.Scanner;

public class hangman2 {
							//ord man ska gissa på
	private static String[] ord = {"touch", "lift", "primary", "promise", "promise", "estimate" };
				//tar ett random ord
	private static String word = ord[(int) (Math.random() * ord.length)];
	//byter ut bokstäver mot *
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 7 && asterisk.contains("*")) { //while loop för att kunna skriva in gissningar
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) { // en for loop som checkar om man har gissat rätt eller fel
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) { // om man har gissat alla bokstäver
			System.out.println("Correct! You win! The word was " + word);
		}
	}

}
