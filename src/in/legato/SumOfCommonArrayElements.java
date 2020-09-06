package in.legato;
import java.util.Scanner;
// Input:-array1={10,20,30,40,50};
// 		  array2={5,10,15,20,25};
// Output:-commonNumbersSum=30

//6,7,8
//1,2,0
//0
public class SumOfCommonArrayElements{
	// Write the logic to calculate the sum of common array elements from the given 
	// two different array
	/*
	 	int array1[]=readArr();
		int array2[]=readArr();
		int sum=0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i]==array2[j]) 
					sum+=array1[i];
			}
		}
		System.out.println(sum);
	 */

	// Create a function to accept the size of an array
	public static int size(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the size of your array.");
		int size=scanner.nextInt();
		return size;
	}

	// Create a function to accept array elements.
	public static int[] readArr(){
		Scanner scanner = new Scanner(System.in);
		int size=size();
		int array[]=new int[size];
		System.out.println("Enter " + size + " values. " );
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextInt();
		return array;
	}

	// Create a function to calculate the sum of common array elements
	public int sumCommonArray(int array1[],int array2[]) {
		int sum=0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i]==array2[j]) 
					sum+=array1[i];
			}
		}
		return sum;
	}

	// Create a function to display the output
	public void dispArr(int array[]){
		for (int i = 0; i < array.length; i++){
			if (i<array.length-1)
				System.out.print(array[i]+ ",");
			else
				System.out.println(array[i]);
		}
	}

	public void output(int result) {
		System.out.println("Sum of common array elements "+result);
	}

	// Create a main function to check the output
	public static void main(String[] args) {
		SumOfCommonArrayElements problem=new SumOfCommonArrayElements();
		System.out.println(" Enter first array. ");
		int array1[]=problem.readArr();
		System.out.println(" Enter second array. ");
		int array2[]=problem.readArr();

		System.out.println(" Entered first array. ");
		problem.dispArr(array1);
		System.out.println(" Entered second array. ");
		problem.dispArr(array2);
		problem.output(problem.sumCommonArray(array1, array2));
	}
}