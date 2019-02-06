/***************************
* Molly Creighton and Keerthi Dasoju
* Lab 4 - Print Strings
* February 6, 2019
* CMSC 255-003
* This program prints out 2 strings in lexicographical order
***************************/

import java.util.Scanner;

public class PrintStrings
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
			String string1 = scnr.nextLine();
		
		System.out.println("Enter the second string: ");
			String string2 = scnr.nextLine();
		
		System.out.println();
		
		if (string1.compareTo(string2) <= 0) {
			System.out.println(string1 + " " + string2);
		}
		else {
			System.out.println(string2 + " " + string1);
		}
	}
}