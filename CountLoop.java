/******************************************
* Lab 6 - CountLoop
*******************************************
* This lab demonstrates a counting loop.
* The first loop gives you the sum of the
* integers between 1 and 100. The second
* loop is modified to ask for a user number
* and gives the sum between 1 and the user
* number. The next two loops do the same
* process, but utilize different syntax.
* -----------------------------------------
* Kaleb Aurand and Molly Creighton
* February 22, 2019
* CMSC 255-003
******************************************/

import java.util.Scanner;

public class CountLoop
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int i;
		int numOutput = 0;
		int userNum;

/******************************************
* The following section provides required info
* regarding the project, including the name of
* the creator, the name of the project, a brief
* description of the project, the version date,
* the class and section.
******************************************/

		System.out.println();
		System.out.println("*******************************************");
		System.out.println("* Lab 6 - CountLoop");
		System.out.println("*******************************************");
		System.out.println("* Kaleb Aurand and Molly Creighton");
		System.out.println("* February 22, 2019");
		System.out.println("* CMSC 255-003");
		System.out.println("* -----------------------------------------");
		System.out.println("* This lab demonstrates a counting loop.");
		System.out.println("* The first loop gives you the sum of the");
		System.out.println("* integers between 1 and 100. The second");
		System.out.println("* loop is modified to ask for a user number");
		System.out.println("* and gives the sum between 1 and the user");
		System.out.println("* number. The next two loops do the same");
		System.out.println("* process, but utilize different syntax.");
		System.out.println("*******************************************");
		System.out.println();

/******************************************
* The following section contains the original
* counting loop that outputs the sum between
* the numbers 1 and 100.
******************************************/
		
		for (i = 0; i <= 100; ++i) {
			numOutput = numOutput + i;
		}
		
		System.out.println("1 + 2 + 3 + ... + 100 = " + numOutput);
		
		System.out.println();

/******************************************
* The following section contains modified
* code of the original counting loop to ask
* a user for a number and then outputs the
* the sum between 1 and the user number.
* It also contains two more ways to write then
* syntax for the counting loop using a user
* number.
******************************************/

		System.out.print("Enter a number: ");
		userNum = scnr.nextInt();
		numOutput = 0;
		for (i = 0; i <= userNum; ++i) {
			numOutput = numOutput + i;
		}
		System.out.println("The sum of the integers up to the number you entered is = " + numOutput);
		
		System.out.println();

		System.out.print("Enter a number: ");
		userNum = scnr.nextInt();
		numOutput = 0;
		i = 0;
		while (i <= userNum) {
			numOutput = numOutput + i;
			i++;
		}
		
		System.out.println("The sum of the integers up to the number you entered is = " + numOutput);
		
		System.out.println();
		
		System.out.print("Enter a number: ");
		userNum = scnr.nextInt();
		numOutput = 0;
		i = 0;		
		do {
			numOutput = numOutput + i;
			i++;
		} while (i <= userNum);
		
		System.out.println("The sum of the integers up to the number you entered is = " + numOutput);
	}
}