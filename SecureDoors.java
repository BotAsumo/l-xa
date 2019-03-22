package l�xa;

import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoors {
	public static void main(String[] args) {
		Scanner scanna = new Scanner(System.in);
		System.out.println("hur m�nga ska ut o in");
		int lines = scanna.nextInt();// du ska skriva en siffra som ska st� f�r hur m�nga det �r som g�r in och ut
		ArrayList<String> hus = new ArrayList<>(); 
		for (int i = 0; i < lines; i++) {
			String track = scanna.next();// track �r n�r entry eller exit
			String namn = scanna.next();	// namnet man skriver efter entry eller exit		
			if (track.equals("entry")) { // om det st�r entry f�re namnet
				System.out.print(namn + " entered");
				if (hus.contains(namn)) //om huset redan inneh�ller namnet och st�r entry igen
					System.out.println(" (ANOMALY)");
				else {
					hus.add(namn); //om huset inte inneh�ller namnet d� blir det ingen anomaly
					System.out.println();
				}
			} else {
				System.out.print(namn + " exited"); // om namnet finns i huset och exit namn st�r d� skrivs detta ut
				if (!hus.contains(namn)) // om huset inte inneh�ller namnet skrivs anomaly ut
					System.out.println(" (ANOMALY)");
				else {
					hus.remove(namn);
					System.out.println();
				}
			}
		}
		scanna.close();
	}
}