package Programming_Logic_1;
/*11. Write an algorithm for accepting third character of the given 
 	  string and then display whether it is vowel or constant.

Algorithm
Step 1: Take input of a character String.
Step 2: Check if the third character is "a,e,i,o,u" i.e. vowels or not.
Step 3: If the character is Vowel then Display Vowel.
Step 4: Else Display Consonant.
*/

import java.util.*;
public class ProgramEleven{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String.");
		String string=scanner.next();
		for (int i=0;i<string.length();i++) {
			char character=string.charAt(i);
			if (i==2 && character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U') {
				System.out.println("Third Character is Vowel "+character);
				break;
			}
			else{
				System.out.println("Third Character is Consonant "+character);	
				break;
			}
		}
	}
}