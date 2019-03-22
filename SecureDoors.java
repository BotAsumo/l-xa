package läxa;

import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoors {
	public static void main(String[] args) {
		Scanner scanna = new Scanner(System.in);
		System.out.println("hur många ska ut o in");
		int lines = scanna.nextInt();// du ska skriva en siffra som ska stå för hur många det är som går in och ut
		ArrayList<String> hus = new ArrayList<>(); 
		for (int i = 0; i < lines; i++) {
			String track = scanna.next();// track är när entry eller exit
			String namn = scanna.next();	// namnet man skriver efter entry eller exit		
			if (track.equals("entry")) { // om det står entry före namnet
				System.out.print(namn + " entered");
				if (hus.contains(namn)) //om huset redan innehåller namnet och står entry igen
					System.out.println(" (ANOMALY)");
				else {
					hus.add(namn); //om huset inte innehåller namnet då blir det ingen anomaly
					System.out.println();
				}
			} else {
				System.out.print(namn + " exited"); // om namnet finns i huset och exit namn står då skrivs detta ut
				if (!hus.contains(namn)) // om huset inte innehåller namnet skrivs anomaly ut
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