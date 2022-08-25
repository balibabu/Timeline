package assignment9;

import java.util.Scanner;

/*Q: Write a program to enter a name as string and print the name in
	 shorter manner. Eg.: Ram Chandra Dash becomes R.C.Dash
 */
public class a9q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println(short_form(name));
	}
	
	public static String short_form(String name) {
		String[] Split=name.split(" ");
		String Short="";
		for(int i=0;i<Split.length-1;i++) {
			Short+=Character.toUpperCase(Split[i].charAt(0))+".";
		}
		Short+=Character.toUpperCase(Split[Split.length-1].charAt(0));
		for(int i=1;i<Split[Split.length-1].length();i++) {
			Short+=Character.toLowerCase(Split[Split.length-1].charAt(i));
		}
		return Short;
	}
}
