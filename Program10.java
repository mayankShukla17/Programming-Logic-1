/*10.Write an algorithm and Java Program for accepting the distance and speed values for a particular journey, calculate the time taken for the journey and display the same.

Algorithm
Step 1: Take input of distance and speed of journey.
Step 2: Divide the distance by speed to calculate the time taken for journey. 
Step 3: Display the time taken for the journey which is calculated in Step 2.

*/

import java.util.*;
public class Program10{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance of journey in Kilometers.");
		int distance=sc.nextInt();
		System.out.println("Enter the speed of journey in Km/Hr.");
		int speed=sc.nextInt();
		float time=distance/speed;
		System.out.println("Time of journey: "+time+"Hr");
	}
}