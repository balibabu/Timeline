package assignment10;
import java.util.Scanner;
import java.util.StringTokenizer;
public class withoutDelimeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		StringTokenizer s=new StringTokenizer(str);
		String neu="";
		while(s.hasMoreTokens()) {
			neu+=s.nextToken();
		}
		System.out.println(neu);
	}

}
