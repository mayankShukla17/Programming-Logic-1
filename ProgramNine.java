package Programming_Logic_1;
/*9. Write an algorithm and Java Program for calculating the area of 
	 rectangle and square separately.

Algorithm:
Step 1: Take input of length and breadth of a rectangle.
Step 2: Multiply length and breadth to calculate the area of rectangle.
Step 3: Display the area of rectangle.
Step 4: Take the input of side of square.
Step 5: Multiply side and side to calculate the Area of square.
Step 6: Display the area of square. 

*/

import java.util.*;
public class ProgramNine{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int length=scanner.nextInt();
		int breadth=scanner.nextInt();
		System.out.println("Enter the side of square");
		int side=scanner.nextInt();
		int areaOfRectangle=length*breadth;
		System.out.println("Area of rectangle: "+areaOfRectangle);
		int areaOfSquare=side*side;
		System.out.println("Area of square: "+areaOfSquare);
	}
}