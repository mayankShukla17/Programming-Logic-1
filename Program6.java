/*6. Write an algorithm and Java Program for accepting five numbers and display the sum and average of the numbers.

Algorithm
Step 1: Take input of five numbers.
Step 2: Add all the five numbers to calculate the sum.
Step 3: Now divide the sum by 5 which is strored in Step 2 to calculate the average of the numbers.
Step 4: Display the Sum of numbers from Step 2 and Average of numbers from Step 3. 
*/

import java.util.*;
public class Program6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		float average=sum/5;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
	}
}