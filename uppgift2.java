package l�xa;

import java.util.Scanner;
public class uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String ord = "bow";
		String slut = "avslutat";
				System.out.println("skriv meningar och sedan skriv EXIT n�r du �r klar");
				while (!ord.equals ("EXIT")) {
					ord = input.nextLine();
					
				if (ord.equals("EXIT")) {	
				
				System.out.println(slut);
				}
	

}
	}
}
		
