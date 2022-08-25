package ClassWork;

import java.util.Scanner;

public class spreadsheet_encoding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		sc.close();
		System.out.println(get_string(n-1));
	}

	private static String get_string(int n) {
		if(n<26) {
			return ""+(char)(65+n);
		}else {
			return get_string(n/26-1)+get_string(n%26);
		}
	}

}
