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
			String track = scanna.next();
			String namn = scanna.next();			
			if (track.equals("entry")) {
				System.out.print(namn + " entered");
				if (hus.contains(namn))
					System.out.println(" (ANOMALY)");
				else {
					hus.add(namn);
					System.out.println();
				}
			} else {
				System.out.print(namn + " exited");
				if (!hus.contains(namn))
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