package assignment7;
import java.util.Scanner;
public class checkSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int checksum=0;
		for(int i=0;i<s.length();i++) {
			checksum+=(int)s.charAt(i);
		}
		System.out.println("the checksum of the string is "+checksum);
	}

}
