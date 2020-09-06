package in.legato;
/*6. Write an algorithm and Java Program for accepting five numbers 
 	 and display the sum and average of the numbers.

Algorithm
Step 1: Take input of five numbers.
Step 2: Add all the five numbers to calculate the sum.
Step 3: Now divide the sum by 5 which is strored in Step 2 to calculate the average of the numbers.
Step 4: Display the Sum of numbers from Step 2 and Average of numbers from Step 3. 
*/

import java.util.*;
public class CalcSumAndAverage{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 5 numbers");
		int numberOne=scanner.nextInt();
		int numberTwo=scanner.nextInt();
		int numberThree=scanner.nextInt();
		int numberFour=scanner.nextInt();
		int numberFive=scanner.nextInt();
		int sum=numberOne+numberTwo+numberThree+numberFour+numberFive;
		float average=sum/5;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
	}
}