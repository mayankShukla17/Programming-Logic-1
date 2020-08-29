package Programming_Logic_1;
/*8.Write an algorithm and Java Program for accepting two numbers 
 	and display the highest number among two.

Algorithm
Step 1: Take input of two numbers.
Step 2: Check if the first number is greater than second number or not.
Step 3: If the first number is greater then Display First number.
Step 4: Else Display Second number. 
*/

import java.util.*;
public class ProgramEight{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstNumber=scanner.nextInt();
		int secondNumber=scanner.nextInt();
		if(firstNumber>secondNumber)
			System.out.println(firstNumber+" is greater.");
		else
			System.out.println(secondNumber+" is greater.");
	}
}