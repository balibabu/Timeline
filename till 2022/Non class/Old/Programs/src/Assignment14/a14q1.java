package Assignment14;

import java.util.Scanner;

public class a14q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		try {
			double d=Double.parseDouble(s);
			System.out.println("valid number");
		}catch(Exception e) {
			System.out.println("not valid number");
		}
	}

}
