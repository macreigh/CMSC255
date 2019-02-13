/****************************************
* Colin Coon and Molly Creighton
* Lab 5 - Phone Selection
* February 13. 2019
* CMSC 255-003
* _______________________________________
* This program tells a user what number
* corresponds to a letter entered on
* the telephone.
****************************************/
import java.util.Scanner;

public class PhoneSelection {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		/*********************
		* This section is where the variables are declared.
		*********************/
		
		int userNum;
		char letterInput;
		boolean tryAgain = true;
		String userInput;
		
		System.out.println();
		
		/********************
		* This section asks for the user input.
		********************/
		
		System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone: ");

		/********************
		* This section takes the user input and
		* converts any lower case letter into an
		* upper case letter.
		********************/
		
		letterInput = scnr.next().charAt(0);
		letterInput = Character.toUpperCase(letterInput);
		
		System.out.println();

		/********************
		* This section holds all of the conditions
		* that a user could potentially input and
		* gives back the appropriate corresponding
		* number, or error message.
		********************/

		if (letterInput == 'A' || letterInput == 'B' || letterInput == 'C') {
			System.out.println("The digit 2 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'D' || letterInput == 'E' || letterInput == 'F') {
			System.out.println("The digit 3 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'G' || letterInput == 'H' || letterInput == 'I') {
			System.out.println("The digit 4 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'J' || letterInput == 'K' || letterInput == 'L') {
			System.out.println("The digit 5 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'M' || letterInput == 'N' || letterInput == 'O') {
			System.out.println("The digit 6 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'P' || letterInput == 'Q' || letterInput == 'R' || letterInput == 'S') {
			System.out.println("The digit 7 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'T' || letterInput == 'U' || letterInput == 'V') {
			System.out.println("The digit 8 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else if (letterInput == 'W' || letterInput == 'X' || letterInput == 'Y' || letterInput == 'Z') {
			System.out.println("The digit 9 corresponds to the letter " + letterInput + " on the telephone.");
		}
		else {
			System.out.println("You have entered an invalid entry.");
		}
	}
}