package assignment6;
import java.util.Scanner;
public class stringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="Hello World";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(6,s1.length())); //including 6, excluding 11
		System.out.println("enter two string");
		String s2=sc.next();
		String s3=sc.next();
		int l1=5;
		int l2=7;
		if(s2.length()<5)
			l1=s2.length();
		if(s3.length()<7)
			l2=s3.length();
		String s4=s2.substring(0,l1).concat(s3.substring(0,l2));
		System.out.println(s4);
		
		
	}

}
