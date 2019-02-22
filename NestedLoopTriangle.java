/***********************************
* NestedLoopTriangle
************************************
*Lab #6, This program prints 2 '*' triangles
*___________________________________
*Kaleb Aurand && Molly Creighton
*February 22, 2019
*CMSC 255 Section 003
*___________________________________
*Algorithm:
*1. FOR (i = 0; i < 10; i++)
*	a. FOR (j = 0; j < (i*2)+1; j++)
*		i. Output "*"
*2. FOR (x = 0; x < 10; x++)
*	a. FOR (i = count; i > 0; i --)
*		i. Output " " 
*	b. FOR (j = 0; j <= (x*2); j++)
*		i. Output "*"
*	c. Decrement count
************************************/
import java.util.Scanner;
import java.lang.Math;

public class NestedLoopTriangle {
	public static void printHeading(){
		System.out.println();
		System.out.println("Kaleb Aurand && Molly Creighton");
		System.out.println("NestedLoopTriangle.java");
		System.out.println("Lab #6, This program prints 2 '*' triangles");
		System.out.println("February 22, 2019");
		System.out.println("CMSC 255 Section 003");
		System.out.println();
	}
	
	public static void main(String [] args) {
		printHeading();
		
		
		/*
		These nested for loops print a 90 degree triangle using '*'.
		The first loop maintains which line the '*' is being printed.
		The second loop prints j amount of '*'
		j is calculated by incrementing i times 2 so we always have
		at least 1 '*'
		*/
		int i, j;
		for(i = 0; i < 10; i++){
			for(j = 0; j < (i*2)+1; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		This set of nested for loops prints a equilateral triangle.
		The first loop controls what line each set of '*' needs to be printed on.
		Then we have two loops in parallel, one controlling the number of spaces,
		the other controlling the amount of '*' to print. 
		*/
		
		int x;
		int count = 9;
		for(x = 0; x < 10; x++){
			for(i = count; i > 0 ; i--){
				System.out.print(" ");
			}
			for(j = 0; j <= (x*2); j++){
				System.out.print("*");
			}
			count--;
			System.out.println();
		}
	}
}