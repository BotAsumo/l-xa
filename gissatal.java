package l�xa;

import java.util.Scanner;

public class gissatal
{
  public static void main(String args[])
  {
   Scanner keyboard = new Scanner(System.in);

   int a = 1 + (int) (Math.random() * 99),
       guess, 
       count = 0;

   System.out.println("Gissa en siffra mellan 0 till 100?");

   while((guess = keyboard.nextInt()) != a){
     if (guess > a)
     {  
       System.out.println("l�gre!");
     }
     else
     {
       System.out.println("h�gre!");
     }
     count++;
   }

   System.out.println("R�tt.   Du gissade med "+ count +" f�rs�k!");
  }

}