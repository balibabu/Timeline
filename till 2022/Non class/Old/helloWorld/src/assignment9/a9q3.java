package assignment9;
import java.util.Arrays;
import java.util.Scanner;

/*Q: Write a program to enter N number of strings, arrange them in
  	 ascending order.
*/

public class a9q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many strings you want to enter");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("enter the strings");
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		Arrays.sort(str);
		System.out.println("arranged strings are:");
		for(int i=0;i<n;i++) {
			System.out.println(str[i]);
		}
	}

}
