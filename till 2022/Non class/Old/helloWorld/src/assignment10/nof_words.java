package assignment10;
import java.util.Scanner;
import java.util.StringTokenizer;
public class nof_words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		StringTokenizer s=new StringTokenizer(str);
		System.out.println("no of words present in the string is "+s.countTokens());
	}

}
