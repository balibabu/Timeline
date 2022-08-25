package assignment9;
/*Q: Write a program to enter a string and print the string in a format
     which says that 1 st letter of each word present in the string must
     be printed in capital letters
*/
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String[] Split=s.split(" ");
		for(int i=0;i<Split.length;i++) {
			System.out.print(Character.toUpperCase(Split[i].charAt(0)));
			for(int j=1;j<Split[i].length();j++) 
					System.out.print(Character.toLowerCase(Split[i].charAt(j)));
			System.out.print(" ");
		}
	}

}
