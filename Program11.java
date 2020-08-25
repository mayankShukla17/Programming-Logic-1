/*11.Write an algorithm for accepting third character of the given string and then displaywhether it is vowel or constant.

Algorithm
Step 1: Take input of a character String.
Step 2: Check if the third character is "a,e,i,o,u" i.e. vowels or not.
Step 3: If the character is Vowel then Display Vowel.
Step 4: Else Display Consonant.
*/

import java.util.*;
public class Program11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String.");
		String s=sc.next();
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (i==2 && ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Third Character is Vowel "+ch);
				break;
			}
			else{
				System.out.println("Third Character is Consonant "+ch);	
				break;
			}
		}
	}
}