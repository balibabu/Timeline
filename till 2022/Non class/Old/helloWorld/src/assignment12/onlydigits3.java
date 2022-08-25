package assignment12;
//Q3: Write a java program to check if a string contains only digits.
import java.util.Scanner;
public class onlydigits3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			if(isDigit(str.charAt(i))) {
				System.out.println("string doesn't contain only digits");
				System.exit(1);
			}
		}
		System.out.println("string contains only digits");
	}
	
	public static boolean isDigit(char a) {
		String temp="0123456789";
		for(int i=0;i<10;i++) {
			if(temp.charAt(i)==a){
				return false;
			}
		}
		return true;
	}

}
