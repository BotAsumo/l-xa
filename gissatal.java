package l�xa;

import java.util.Scanner;

public class gissaTal {
	public static void main(String args[]) {
		boolean omstart = true;
		while (omstart) { // en while loop f�r om man vill spela igen
			
		
		int max = 0;
		int min = 0;
		int guess = 0, count = 0, countMax = 0;
		String b�rja;
		System.out.println(
				"V�lj en niv� \n \nNiv� 1: l�tt. Du har 10 gissningar, maxtal 50 \nNiv� 2: mellan. du har 10 gissnigar, maxtal �r 100 \nNiv� 3: Sv�r. du har 16 gissningar, maxtal �r 200");
		// H�r har jag skrivit s� att man kan veta vad man har f�r niv�, hur m�nga
		// gissningar och mellan vilka tal
		Scanner input = new Scanner(System.in);

		int niv�er = input.nextInt();

		while (niv�er != 1 && niv�er != 2 && niv�er != 3) {
			System.out.println("Du m�ste v�lja en av niv�erna");
			// En loop f�r att man inte ska kunna skriva �ver 3. och om man skriver �ver 3
			// d� skrivs det som �r under loopen ut.
			niv�er = input.nextInt();

		}
		// detta �r en switch case f�r de olika niv�erna
		switch (niv�er) {
		case 1: // niv� 1 l�tt
			countMax = 10; // max gissningar
			min = 0;
			max = 50;
			break;
		case 2: // niv� 2 mellan
			countMax = 10; // max gissningar
			min = 0;
			max = 100;
			break;
		case 3: // niv� 3 sv�r
			countMax = 16; // max gissningar
			min = 0;
			max = 200;
			break;
		}
		System.out.println("Du valde niv� " + niv�er + ", du har " + countMax + " gissningar, mellan talen " + min
				+ " och " + max);
		// detta s�ger hur m�nga gissningar och mellan vilka tal f�r din valda niv�

		int a = 1 + (int) (Math.random() * max);
		while ((guess = input.nextInt()) != a) {
			if (guess > max) {
				System.out.println("Talet �r under " + max); // om gissningen �r �ver h�gsta m�jliga
			} else if (guess < min) { // om gissningen �r l�gre �n 0
				System.out.println("Talet �r h�gre �n 0");
			} else if (guess > a) {
				System.out.println("l�gre!"); // detta skrivs ut om din gissning �r f�r l�g
			} else {
				System.out.println("h�gre!"); // detta skrivs ut om din gissning �r f�r h�g
			}
			count++;
			if (count >= countMax) {
				System.out.println("Bra f�rs�kt men du gissade tyv�rr inte r�tt, talet var " + a);
				break;
			}
		}
		if (guess == a) {
			System.out.println("R�tt, bra jobbat!. Du gissade med " + count + " f�rs�k!");
		}
		System.out.println("\n");
        System.out.println("Vill du spela igen? \nSvara 'nej' om du inte vill starta om. Skriv 'ja' om du vill starta om.");
        input.nextLine(); // detta finns f�r att kunna skriva ja eller nej f�r att starta om
        b�rja = input.nextLine();
        if (b�rja.equals("nej")) { // om man skriver nej d� startas det inte om
            omstart = false;
            System.out.println("Tack f�r spelandet!");
        }
	}
	}
}
	