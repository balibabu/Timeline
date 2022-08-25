package assignment12;

import java.util.Scanner;

/*3. Write a java code to remove all occurences of a given character
	from an input String
 */
public class a12q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		StringBuilder str=new StringBuilder(sc.nextLine());
		System.out.println("which letter you want to remove");
		char a=sc.next().charAt(0);
		int pos=0;
		while(pos!=str.length()) {
			if(a==str.charAt(pos))
				str.deleteCharAt(pos);
			else
				pos+=1;
		}
		System.out.println(str);
	}

}
