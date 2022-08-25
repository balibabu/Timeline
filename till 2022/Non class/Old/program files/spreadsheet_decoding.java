package ClassWork;

import java.util.Scanner;

public class spreadsheet_decoding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println(get_num(str.toUpperCase()));
	}

	private static int get_num(String str) {
		int n=0;
		for(int i=0;i<str.length();i++) {
			n+=Math.pow(26, str.length()-i-1)*((int)str.charAt(i)-64);
		}
		return n;
	}

}
