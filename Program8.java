/*8.Write an algorithm and Java Program for accepting two numbers and display the highest number among two.

Algorithm
Step 1: Take input of two numbers.
Step 2: Check if the first number is greater than second number or not.
Step 3: If the first number is greater then Display Fisrt number.
Step 4: Else Display Second number. 
*/

import java.util.*;
public class Program8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a+" is greater.");
		else
			System.out.println(b+" is greater.");
	}
}