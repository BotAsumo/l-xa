package läxa;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int tal = 1;
		int summa = 0;
		System.out.println("type some numbers man");
		while (tal!=0) {
			tal = input.nextInt();
			summa = summa + tal;
			}
		System.out.println(summa);
		input.close();
	}

}
