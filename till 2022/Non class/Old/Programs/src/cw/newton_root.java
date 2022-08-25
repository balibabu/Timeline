package cw;

import java.util.Scanner;

public class newton_root {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double c=sc.nextDouble();
		System.out.println("enter power of root");
		int n=sc.nextInt();
		double x=c/2;
		for(int i=0;i<100;i++) {
			x=x-(Math.pow(x, n)-c)/((n*Math.pow(x, n-1)));
		}
		System.out.println(x);
	}

}
