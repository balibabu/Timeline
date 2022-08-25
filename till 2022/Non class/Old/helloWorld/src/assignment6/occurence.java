package assignment6;
import java.util.*;
public class occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String s=sc.next();
		char[] ch=new char[s.length()];
		int[] cnt=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=i; j<s.length();j++) {
				if(s.charAt(i)==(s.charAt(j))) {
					cnt[i]+=1;
				}
			}
		}
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(isUnique(ch,c,s.charAt(i))) {
				System.out.println(s.charAt(i)+" = "+cnt[i]);
				c+=1;
				ch[c]=s.charAt(i);
			}
		}
	}
	
	public static boolean isUnique(char[] ch,int c,char a) {
		for(int i=0; i<=c;i++) {
			if(a==ch[i])
				return false;
		}
		return true;
	}

}
