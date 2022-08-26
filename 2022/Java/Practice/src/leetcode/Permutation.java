package leetcode;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		int num=123;
		String str="123";
		char[] chars=str.toCharArray();		// string to characters
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		permute(chars, 0, str.length(), list);
		for(int i:list) {
			System.out.println(i);
		}
		
	}
	
	public static void permute(char[] chars,int l,int n, ArrayList<Integer> list) {
		if(l==n) {
			list.add(Integer.parseInt(new String(chars)));
		}else {
			for(int i=l;i<n;i++) {
				swap(chars,i,l);
				permute(chars,l+1,n,list);
				swap(chars,i,l);
			}
		}
	}
	
	public static void swap(char[] chars,int i,int j) {
		char temp=chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
	}

}
