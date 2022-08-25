package assignment12;

import java.util.Scanner;
import java.util.StringTokenizer;

/*5. Write a java code to capitalize last alphabet of each word in a
	 string
*/
public class a12q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		StringTokenizer s=new StringTokenizer(str);
		while(s.hasMoreTokens()) {
			String temp=s.nextToken();
			for(int i=0;i<temp.length()-1;i++) {
				System.out.print(temp.charAt(i));
			}
			System.out.print(Character.toUpperCase(temp.charAt(temp.length()-1))+" ");
		}
		
	}

}
