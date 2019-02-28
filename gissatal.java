package läxa;

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
       System.out.println("lägre!");
     }
     else
     {
       System.out.println("högre!");
     }
     count++;
   }

   System.out.println("Rätt.   Du gissade med "+ count +" försök!");
  }

}