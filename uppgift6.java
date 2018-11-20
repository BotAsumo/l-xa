
package läxa;
import java.util.Scanner;
public class uppgift6 {
	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		
		int y = 0;
		System.out.println("skriv hur många baser");
		y = input.nextInt();
	     for(int i=0;i<y;i++) {
	         for(int j=0;j<y-i;j++) {
	        	 
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("x ");
	        }
	        System.out.println();  
	        input.close();
	    }
	}
}
