package assignment10;
import java.util.Scanner;
import java.util.StringTokenizer;
public class fstLcap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		StringTokenizer s=new StringTokenizer(str);
		while(s.hasMoreTokens()) {
			String wd=s.nextToken();
			System.out.print(Character.toUpperCase(wd.charAt(0)));
			for(int i=1;i<wd.length();i++) {
				System.out.print(Character.toLowerCase(wd.charAt(i)));
			}
			System.out.print(" ");
		}
	}

}
