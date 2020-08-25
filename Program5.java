/*5. Write an algorithm and Java Program for accepting distance in kilometers, convert it into meters and display the result.

Algorithm
Step 1: Take input distance in kilometers.
Step 2: Multiply the distance from 1000 to convert into meters.
Step 3: Display the result. 
*/

import java.util.Scanner;
public class Program5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in kilometers");
		int d=sc.nextInt();
		System.out.println("Distance in meters: "+d*1000+"meters");
	}
}