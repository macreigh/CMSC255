/**************************************************************
* This is a pre-written program for CMSC255-003 Lab 3.
* The assignment is to add block comment about what the displayed value will be after performing the math function.
* This is also to practice adding block comment for our final project at the end of the semester.
***************************************************************/

public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println((a + b) / c);   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     * The value displayed is 3
     ***********************************************************/
    System.out.println(a + b / c);       
	
	/**********************************************************
	 * '++a' will increment a by 1 and then display
	 * The value of 'a' is 3, so 3 plus 1 is 4
	 * The value displayed is 4
     ***********************************************************/
    System.out.println(++a);       
    
	/**********************************************************
	 * '--a' will decrement by 1 and then display
	 * The value of 'a' is 4 from the previous command, so 4 minus 1 is 3
	 * The value displayed is 3
     ***********************************************************/
	System.out.println(--a);
    
	/**********************************************************
	 * 'a++' will display the value of a and then increment by 1
	 * The value of 'a' from the previous command is 3
	 * The new incremented value, 4, is never displayed, but still held as 'a'
	 * The value displayed is 3
     ***********************************************************/
	System.out.println(a++);       
    
	/**********************************************************
	 * 'a--' will display the value of a and then decrement by 1
	 * The value of 'a' from the previous command is 4
	 * The new decremented value, 3, is never displayed, but still held as 'a'
	 * The value displayed is 4
     ***********************************************************/
	System.out.println(a--);

	/**********************************************************
	 * The value of 'a' is added to 1
	 * 3 + 1 is 4
	 * The value displayed is 4
     ***********************************************************/
	System.out.println(a + 1);        

	/**********************************************************
	 * The % operater divides and displays the remainder
	 * 'd' (value of 17) is divided by'c' (value of 5)
	 * 17 / 5 is 3 remainder 2
	 * The value displayed is 2
     ***********************************************************/
	System.out.println(d % c);       
    
	/**********************************************************
	 * The / operator divides and displays the integer result
	 * 17 / 5 is 3 remainder 2, or 3.4
	 * The value displayed is 3
     ***********************************************************/
	System.out.println(d / c);       
    
	/**********************************************************
	 * % operator will return the remainder
	 * 17 / 4 is 4 remainder 1, or 4.25
	 * The value displayed is 1
     ***********************************************************/
	System.out.println(d % b);       
    
	/**********************************************************
	 * / operator will return the integer result
	 * 17 / 4 is 4 remainder 1, or 4.25
	 * The value displayed is 4
     ***********************************************************/
	System.out.println(d / b);       

	/**********************************************************
	 * Division has higher precedence, so 3 is divided by 17 with result 0
	 * The result is then added to d -> 17 + 0 with sum 17
	 * The sum 17 is then added to b -> 17 + 4 with sum 21
	 * The value dislayed is 21
     ***********************************************************/
	System.out.println(d + a / d + b);       
    
	/**********************************************************
	 * Parenthesis takes precedence
	 * 17 + 3 with sum 20 and 17 + 4 with sum 21
	 * 20 will then be divided by 21 with result 0
	 * The value displayed is 0
     ***********************************************************/
	System.out.println((d + a) / (d + b));       

	/**********************************************************
	 * The Math.sqrt method will take the square root of b
	 * The square root of 4 is 2
	 * Math.sqrt returns a double value
	 * The value displayed is 2.0
     ***********************************************************/
	System.out.println(Math.sqrt(b));       
    
	/**********************************************************
	 * Math.pow will raise a to the b power
	 * 3 raised to the power of 4 is 3 * 3 * 3 * 3
	 * Math.pow returns a double value
	 * The value displayed is 81
     ***********************************************************/
	System.out.println(Math.pow(a, b));       
    
	/**********************************************************
	 * Math.abs will return the absolute value of a number
	 * The absolute value of -a will be a -> | -3 | is +3
	 * The value displayed is 3
     ***********************************************************/
	System.out.println(Math.abs(-a));
    
	/**********************************************************
	 * Math.max will return the greater of the two values
	 * b = 4 is greater than a = 3
	 * The value displayed is 4
     ***********************************************************/
	System.out.println(Math.max(a, b));    
  } 
} 
