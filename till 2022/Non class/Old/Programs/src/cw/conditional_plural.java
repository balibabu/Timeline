package cw;

import java.util.Scanner;

public class conditional_plural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("i am reading "+n+" book"+(n==1?".":"s."));
	}

}
