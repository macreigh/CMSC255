/*
****************************************
CMSC 255 Section 003
Lab 3 - Declaring variables
****************************************
*/
public class VariableDefinitions {
	public static void main(String[] args)
	{
		
		double itemPrice = 32.32;				//initial delcaration of itemPrice
		boolean stopFlag = false;				//initial declaration of stopFlag
		char letterValue = 'a';					//initial declaration of letterA
		short classRoomNum = 207;				//initial declaration of classRoomNum
		
		final float DINNER_PRICE = 30.0F;			//declaration of DINNER_PRICE constant
		final long LONG_NUM = 990123456789L;			//declaration of LONG_NUM constant
		final byte NUM_PETS = 0;				//declaration of NUM_PETS constant
		final int SMALLER_NUM = 177609;				//declaration of SMALLER_NUM constant
		
		
		System.out.println();
		System.out.println("Keerthi Dasoju and Molly Creighton");
		System.out.println("CMSC 255-003 Lab 3");
		
		
			System.out.println();
			System.out.println();
		
		
		itemPrice = 1847.29;					//modified value of itemPrice
		System.out.println("The itemPrice variable has a value of $" + itemPrice);
		System.out.println();
		
		stopFlag = true;					//modified value of stopFlag
		System.out.println("The stopFlag variable has a value of " + stopFlag);
		System.out.println();
		
		letterValue = 'K';					//modified value of letterValue
		System.out.println("The letterA variable has a value of " + letterValue);
		System.out.println();
		
		classRoomNum = 4221;					//modified value of classRoomNum
		System.out.println("The classRoomNum variable has a value of " + classRoomNum);
		System.out.println();
		
		
			System.out.println();
		
		
		//DINNER_PRICE = 50.0F;					//attempted modification of constant
		System.out.println("The DINNER_PRICE constant has a value of $" + DINNER_PRICE);
		System.out.println();
		
		//LONG_NUM = 1234567890123456L;				//attempted modification of constant
		System.out.println("The LONG_NUM constant has a vale of " + LONG_NUM);
		System.out.println();
		
		//NUM_PETS = 4;						//attempted modification of constant
		System.out.println("The NUM_PETS constant has a value of " + NUM_PETS);
		System.out.println();
		
		//SMALLER_NUM = 24599;					//attempted modification of constant
		System.out.println("The SMALLER_NUM constant has a value of " + SMALLER_NUM);
		System.out.println();
		
	}
}
