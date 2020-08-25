/*4. Write an algorithm and Java Program for accepting two numbers, divide the first number by second and display their quotient.

Step 1: Take input of two numbers.
Step 2: Divide the first number by second number.
Step 3: Display the quotient. 
*/

import java.util.Scanner;
public class Program4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Quotient: "+a/b);
	}
}
