package in.legato;
/*4. Write an algorithm and Java Program for accepting two numbers, 
 	 divide the first number by second and display their quotient.

Step 1: Take input of two numbers.
Step 2: Divide the first number by second number.
Step 3: Display the quotient. 
*/

import java.util.Scanner;
public class DivideTwoNumbers{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two values");
		int numberOne=scanner.nextInt();
		int numberTwo=scanner.nextInt();
		System.out.println("Quotient: "+numberOne/numberTwo);
	}
}
