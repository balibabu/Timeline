package assignment7;
import java.util.Scanner;
public class printAllChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println("\nthe characters in the string are");
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

}
