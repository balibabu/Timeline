package assignment12;

import java.util.Arrays;
import java.util.Scanner;

/*2. Write a java code to find the longest substring with repeating
	 characters in the given string 
 */
public class a12q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		int occ=0;
		int pos=0;
		for(int i=0;i<words.length;i++) {
			if(occ<degree(words[i])) {
				occ=degree(words[i]);
				pos=i;
			}
		}
		System.out.println(words[pos]);
	}
	
	public static int degree(String s) {
		s.toLowerCase();
		int[] cnt=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=i; j<s.length();j++) {
				if(s.charAt(i)==(s.charAt(j))) {
					cnt[i]+=1;
				}
			}
		}
		Arrays.sort(cnt);
		return cnt[s.length()-1];
	}

}
