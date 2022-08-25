package assignment9;
import java.util.Scanner;
/*Q: Write a program to check whether the 
     entered string is a palindrome or not.
 */
public class a9q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String word=sc.next();
		if(isPalindrome(word))
			System.out.println("yes it is palindrome");
		else
			System.out.println("no it is not palindrome");
	}
	
	public static boolean isPalindrome(String w) {
		String rev="";
		for(int i=0;i<w.length();i++) {
			rev=w.charAt(i)+rev;
		}
		if(rev.equals(w))
			return true;
		else
			return false;
	}
}
