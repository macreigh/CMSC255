/***************************
* Molly Creighton and Keerthi Dasoju
* Lab 4 - Middle String
* February 6, 2019
* CMSC 255-003
* This program prints out 3 strings in lexicographical order
*
* Test Plan:
* If str1 = abcd, str2 = pqrs, str3 = wxyz
*	str1 < str2, str2 < str3 => str1 str2 str3
*
* If str1 = abcd, str2 = wxyz, str3 = pqrs
*	str1 < str2, str2 > str3, str1 < str3 => str1 str3 str2
*
* If str1 = pqrs, str2 = abcd, str3 = wxyz
*	str1 > str2, str2 < str3, str1 < str3 => str2 str1 str3
*
* If str1 = wxyz, str2 = abcd, str3 = pqrs
*	str1 > str2, str2 < str3, str1 > str3 => str2 str3 str1
*
* If str1 = pqrs, str2 = wxyz, str3 = abcd
*	str1 > str3, str1 < str2, str3 < str2 => str3 str1 str2
*
* If str1 = wxyz, str2 = pqrs, str3 = abcd
*	str1 > str2, str2 > str3, str1 > str3 = str3 str2 str1
***************************/

import java.util.Scanner;

public class MiddleString
{
	public static void main(String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str1 = scnr.nextLine();
		System.out.print("Enter a second string: ");
		String str2 = scnr.nextLine();
		System.out.print("Enter a third string: ");
		String str3 = scnr.nextLine();
		
		if ((str1.compareTo(str2) <= 0) && (str2.compareTo(str3) <= 0)) {
			System.out.println(str1 + " " + str2 + " " + str3);
		}	
			else if ((str1.compareTo(str2) <= 0) && (str2.compareTo(str3) >= 0) && (str1.compareTo(str3) <= 0)) {
				System.out.println(str1 + " " + str3 + " " + str2);
			}
			else if ((str1.compareTo(str2) >= 0) && (str2.compareTo(str3) <= 0) && (str1.compareTo(str3) <= 0)){
				System.out.println(str2 + " " + str1 + " " + str3);
			}
			else if ((str1.compareTo(str2) >= 0) && (str2.compareTo(str3) <= 0) && (str1.compareTo(str3) >= 0)) {
				System.out.println(str2 + " " + str3 + " " + str1);
			}
			else if ((str1.compareTo(str3) >= 0) && (str1.compareTo(str2) <= 0) && (str3.compareTo(str2) <= 0)) {
				System.out.println(str3 + " " + str1 + " " + str2);
			}
		else {
			System.out.println(str3 + " " + str2 + " " + str1);
		}
	}
}