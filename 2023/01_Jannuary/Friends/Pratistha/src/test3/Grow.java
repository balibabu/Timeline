package test3;

import java.util.Scanner;

public class Grow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		System.out.println(str);
	}
	public static boolean isGrowing(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

}


interface Growing {
	public boolean isGrowing(String str);
}

class GrowNumber implements Growing{
	@Override
	public boolean isGrowing(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(Integer.parseInt(""+str.charAt(i))>Integer.parseInt(""+str.charAt(i+1))) {
				return false;
			}
		}
		return true;
	}
	
}

class GrowingString implements Growing{

	@Override
	public boolean isGrowing(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
}