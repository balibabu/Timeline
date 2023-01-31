package test3;

import java.util.Scanner;

public class Grow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		Growing num=new GrowingNumber();
		Growing str=new GrowingString();
		if(num.isGrowing(input[0])) {
			System.out.println("Growing number");
		}else {
			System.out.println("Not growing number in the first line");
		}
		
		if(str.isGrowing(input[1])) {
			System.out.println("Growing string");
		}else {
			System.out.println("Not growing string in the second line");
		}
		
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

class GrowingNumber implements Growing{
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