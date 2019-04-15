/***********************************
* Final Project Milestone 2
************************************
*This program will ask the user to input their birth year.
*It then returns their zodiac sign according to the Chinese New Year.
*___________________________________
*Kaleb Aurand, Ashley Beasley, Molly Creighton, Natalie Murphy
*March 21, 2019
*CMSC 255 Section 003
************************************/
import java.util.Scanner;
 
public class ChineseZodiac{
  	public static void main(String [] args) {
        	
        	Scanner scan = new Scanner(System.in);
        	char again;
        	int year;
        	int sign;
        	
        	String[] zodiac = {"Monkey","Rooster","Dog","Boar","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Ram"};
        	
        	do {
              	System.out.println("What year were you born in?");
              	year = scan.nextInt();
              	
              	while(!(year > 999 && year < 10000)) {
              	  	System.out.println("Input failed. please try again");
                    	year = scan.nextInt();
              	}
              	sign = year % 12;
              	
        	  	System.out.println("According to the Chinese New Year, your zodiac sign is the " + zodiac[sign]);
              	System.out.println("Would you like to check another? 'y' or 'n'");
              	
              	again = scan.next().charAt(0);
              	while(again != 'n' && again != 'y'){
              	  	System.out.println("Input failed. Would you like to check another? 'y' or 'n'");
                    	again = scan.next().charAt(0);
              	}
  	
        	} while(again == 'y');
        	System.out.print("Goodbye.");
  	}
}
