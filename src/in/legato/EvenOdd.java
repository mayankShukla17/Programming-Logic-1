package in.legato;
/*7. Write an algorithm and Java Program for accepting a number and display the whether it is odd or even.

Algorithm
Step 1: Take input of a number.
Step 2: Check if the number is divisible by 2 or not.
Step 3: If the number is divisible by 2 then Display Even.
Step 4: Else Display Odd. 
*/

import java.util.*;
public class EvenOdd{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value");
		int number=scanner.nextInt();
		if(number%2==0)
			System.out.println("Even Number");
		else 
			System.out.println("Odd Number");
	}
}