import java.util.*;
public class Program1
{
	// Write a logic to find whether number is palindrome or not.
	//	int n;
	//	int rev=0,t=n;
	//	while(n!=0){
	//		int r=n%10;
	//		rev=rev*10+r;
	//		n=n/10;
	//	}
	//	if(rev==t)
	//		System.out.println("Palindrome Number");
	//	else
	//		System.out.println("Not Palindrome Number");

	// Create a function to accept the number from user
	public static int input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		return n;
	}

	// Create a function to check whether given input is valid integer
	public static void isInteger(int n){
		try {
			int num=n;
			System.out.println("Integer value");
		}
		catch(NumberFormatException e) {
			System.out.println("Input is not a valid integer");
		}
	}

	// Create a function check the number entered by user whether it is positive integer or not
	public static boolean isPositiveInteger(int n){
		if(n>0)
			return true;
		else
			return false;
	}
	
	// Create a function to check the number is palindrome or not.
	public static boolean isPalindrome(int n){
		int rev=0,t=n;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev==t;
	}

	// Create a function to display the output
	public static void output(int n){
		isInteger(n);
		if(isPositiveInteger(n))
			System.out.println("Number is Positive Integer");
		else
			System.out.println("Number is not a Positive integer");
		
		if(isPalindrome(n))
			System.out.println("Number is Palindrome Number");
		else
			System.out.println("Number is not a Palindrome Number");
	}

	// Create main function to run the program
	public static void main(String[] args) {
		Program1 p=new Program1();
		p.output(p.input());
	}
}






