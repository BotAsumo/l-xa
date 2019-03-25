package läxa;

import java.util.Scanner;

public class gissaTal {
	public static void main(String args[]) {
		int max = 0;
		int min = 0;
		int guess = 0, count = 0, countMax = 0;
		System.out.println(
				"Välj en nivå \n \nNivå 1: lätt. Du har 10 gissningar, maxtal 50 \nNivå 2: mellan. du har 10 gissnigar, maxtal är 100 \nNivå 3: Svår. du har 16 gissningar, maxtal är 200");
		// Här har jag skrivit så att man kan veta vad man har för nivå, hur många
		// gissningar och mellan vilka tal
		Scanner input = new Scanner(System.in);

		int nivåer = input.nextInt();

		while (nivåer != 1 && nivåer != 2 && nivåer != 3) {
			System.out.println("Du måste välja en av nivåerna");
			// En loop för att man inte ska kunna skriva över 3. och om man skriver över 3
			// då skrivs det som är under loopen ut.
			nivåer = input.nextInt();

		}
		// detta är en switch case för de olika nivåerna
		switch (nivåer) {
		case 1: // nivå 1 lätt
			countMax = 10; // max gissningar
			min = 0;
			max = 50;
			break;
		case 2: // nivå 2 mellan
			countMax = 10; // max gissningar
			min = 0;
			max = 100;
			break;
		case 3: // nivå 3 svår
			countMax = 16; // max gissningar
			min = 0;
			max = 200;
			break;
		}
		System.out.println("Du valde nivå " + nivåer + ", du har " + countMax + " gissningar, mellan talen " + min
				+ " och " + max);
		// detta säger hur många gissningar och mellan vilka tal för din valda nivå

		int a = 1 + (int) (Math.random() * max);
		while ((guess = input.nextInt()) != a) {
			if (guess > max) {
				System.out.println("Talet är under " + max); // om gissningen är över högsta möjliga
			} else if (guess < min) { // om gissningen är lägre än 0
				System.out.println("Talet är högre än 0");
			} else if (guess > a) {
				System.out.println("lägre!"); // detta skrivs ut om din gissning är för låg
			} else {
				System.out.println("högre!"); // detta skrivs ut om din gissning är för hög
			}
			count++;
			if (count >= countMax) {
				System.out.println("Bra försökt men du gissade tyvärr inte rätt, talet var " + a);
				break;
			}
		}
		if (guess == a) {
			System.out.println("Rätt, bra jobbat!. Du gissade med " + count + " försök!");
		}
	}

}