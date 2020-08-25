import java.util.Scanner;
public class Program2
{
	// Write the logic to calculate the sum of common array elements from the given two different array
//	int a[]=p.readArr();
//	int b[]=p.readArr();
//	int sum=0;
//	for (int i = 0; i < a.length; i++) {
//		for (int j = 0; j < b.length; j++) {
//			if (a[i]==b[j]) {
//				sum+=a[i];
//			}
//		}
//	}
//	System.out.println(sum);
	
	
	// Create a function to accept the size of an array
	public int size() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the size of your array.");
		int n=sc.nextInt();
		return n;
	}
	
	// Create a function to accept array elements.
	public int[] readArr()
	{
		Scanner sc = new Scanner(System.in);
		int n=size();
		int ar[]=new int[n];
		System.out.println("Enter " + n + " values. " );
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	// Create a function to calculate the sum of common array elements
	public int sumCommonArray(int a[],int b[]) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					sum+=a[i];
				}
			}
		}
		return sum;
	}
	
	// Create a function to display the output
	public void dispArr(int ar[])
	{
		for (int i = 0; i < ar.length; i++)
		{
			if (i<ar.length-1)
				System.out.print(ar[i]+ ",");
			else
				System.out.println(ar[i]);
		}
	}
	
	public void output(int result) {
		System.out.println("Sum of common array elements "+result);
	}
	
	// Create a main function to check the output
	public static void main(String[] args) {
		Program2 p=new Program2();
		System.out.println(" Enter first array. ");
		int a[]=p.readArr();
		System.out.println(" Enter second array. ");
		int b[]=p.readArr();
		
		System.out.println(" Entered first array. ");
		p.dispArr(a);
		System.out.println(" Entered second array. ");
		p.dispArr(b);
		p.output(p.sumCommonArray(a, b));
	}
}



// 10,20,30,40,50
// 5,10,15,20,25
// 30

// 6,7,8
// 1,2,0
// 0