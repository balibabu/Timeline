package assignment2;
import java.util.*;
public class testing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("bali");
		String s1=new String("Hello World");
		String s2="Hello World";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0,3));
		char a='b';
		if(a=='b')
			System.out.println("true");
		String s="balI";
		System.out.println(s.toUpperCase());
	}

}
