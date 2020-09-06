package Programming_Logic_1;
import java.util.*;
public class ProblemOne{
	// Write a logic to find whether number is palindrome or not.
	/*	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		int reverse=0,temp=number;
		while(number!=0){
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if(reverse==temp)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	 */

	// Create a function to accept the number from user
	public int input(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		return number;
	}
	// Create a function to check whether given input is valid integer
	public static void isInteger(int number){
		try {
			int num=number;
			System.out.println("Integer value");
		}
		catch(NumberFormatException e) {
			System.out.println("Input is not a valid integer");
		}
	}
	// Create a function check the number entered by user whether it is positive integer or not
	public static boolean isPositiveInteger(int number){
		if(number>0)
			return true;
		else
			return false;
	}
	// Create a function to check the number is palindrome or not.
	public static boolean isPalindrome(int number){
		int reverse=0,temp=number;
		while(number!=0){
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		return reverse==temp;
	}
	// Create a function to display the output
	public void output(int number){
		isInteger(number);
		if(isPositiveInteger(number))
			System.out.println("Number is Positive Integer");
		else
			System.out.println("Number is not a Positive integer");

		if(isPalindrome(number))
			System.out.println("Number is Palindrome Number");
		else
			System.out.println("Number is not a Palindrome Number");
	}
	// Create main function to run the program
	public static void main(String[] args) {
		ProblemOne problem=new ProblemOne();
		problem.output(problem.input());

		//If we will make 'static' input() and output() methods we can call 
		// those methods without creating object.

		// output(input());
	}
}