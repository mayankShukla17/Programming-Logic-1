package Programming_Logic_1;
// Write an algorithm and Program in java to achieve below Objective
/*
Step 1: Take the input of number values.
Step 2: Convert Celsius to Fahrenheit.
Step 3: Print the details in a table format.
*/
import java.util.*;
public class Temperature{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many values do you have.");
		int numberOfValues=scanner.nextInt();
		// Method 1:
		 System.out.println("Sr. No.\tTemperature(Celsius)\tTemperature(Fahrenheit)");
		 for (int i=0,j=0;i<=numberOfValues && j<=100;i++,j=j+10) {
		 			int Celsius=j;
		 			int Fahrenheit=(Celsius/5 * 9)+32;
		 		System.out.println(i+1+"\t\t"+j+"\t\t\t"+Fahrenheit);
		 }
		
		// Method 2:
		int i=0;
		int Celsius=0;
		int Fahrenheit;
		System.out.println("Sr. No.\tTemperature(Celsius)\tTemperature(Fahrenheit)");
		do{
			Fahrenheit=(Celsius/5 * 9)+32;
			System.out.println(i+1+"\t\t"+Celsius+"\t\t\t"+Fahrenheit);
			System.out.println("Do you have more values");
			String s=scanner.next();
			if(s.equalsIgnoreCase("yes")) {
				i++;
				numberOfValues--;
				Celsius+=10;
				continue;
			}
			else
				break;
		}while(numberOfValues>0);
	}
}