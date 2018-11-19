package läxa;

import java.util.Scanner;
public class uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    double tal = 1;
		double produkt = 1;
		double count = 0;
		
		System.out.println("skriv nummer");
		
		while (produkt <= 100000 ) {
			tal = input.nextDouble();
			produkt = produkt * tal;
			count = count + 1;
			if (count >= 10) {
				
				
				
				break;
			}
			
		}
		System.out.println(produkt);
	}

}
