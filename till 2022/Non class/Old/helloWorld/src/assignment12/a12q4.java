package assignment12;

import java.util.Scanner;

/*4. Write a java program to input a string from user and reverse each
	 word of the string.
 */
public class a12q4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		for(int i=words.length;i>0;i=i-1) {
			System.out.print(words[i-1]+" ");
		}
	}

}
