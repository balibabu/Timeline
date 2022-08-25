package assignment7;
import java.util.Scanner;
public class Compare_strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		System.out.println("enter second string");
		String s2=sc.next();
		if(s1.equals(s2)) {
			System.out.println("they are equal");
		}else {
			System.out.println("they are not equal");
		}
	}

}
