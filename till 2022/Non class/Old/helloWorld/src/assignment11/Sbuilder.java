package assignment11;
import java.util.Scanner;
public class Sbuilder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string eg.Hi all there");
		String str=sc.nextLine();
		StringBuilder obj=new StringBuilder(str);
		System.out.println(obj);
		String obj2="";
		String temp="";
		for(int i=0;i<obj.length();i++) {
			if(obj.charAt(i)==' ') {
				obj2=" "+temp+obj2;
				temp="";
			}else {
				temp+=obj.charAt(i);
			}
		}
		obj2=temp+obj2;
		System.out.println(obj2);
		for(int i=0;i<obj.length();i++) {
			if(obj.charAt(i)==' ')
				System.out.print("\t");
			else
				System.out.print(obj.charAt(i));
		}
		System.out.println();
		for(int i=0;i<obj.length();i++) {
			if(obj.charAt(i)=='\t')
				System.out.print(" ");
			else
				System.out.print(obj.charAt(i));
		}
		System.out.println();
		obj.append("\\t");
		System.out.println(obj);
		obj.append("\\n");
		System.out.println(obj);
		obj.append("\\in");
		System.out.println(obj);
		
	}

}
