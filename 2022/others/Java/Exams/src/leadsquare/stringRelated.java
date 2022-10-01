package leadsquare;

import java.util.Scanner;

public class stringRelated {

	public static void main(String[] args) {
		System.out.println(canBeFormed("night","thing"));
		System.out.println(canBeFormed("tight","right"));
		stringRelated test=new stringRelated();
		System.out.println(test.Test(2));

	}
	public int Test(int input1) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		String[][] strList=new String[input1][2];
		for(int i=0;i<input1;i++) {
			strList[i][0]=sc.next();
			strList[i][1]=sc.next();
		}
		
		for(int i=0;i<input1;i++) {
			if(canBeFormed(strList[i][0], strList[i][0])) {
				c++;
			}
		}
		
		return c;
	}
	public static boolean canBeFormed(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++) {
        	if(countChar(str1, str1.charAt(i))!=countChar(str2, str1.charAt(i))) {
        		return false;
        	}
        }
        
        return true;
    }
	public static int countChar(String str1,char c) {
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}
}
