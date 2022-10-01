package leetcode;

import java.util.ArrayList;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        String str=""+n;
        char[] chars=str.toCharArray();
        int length=str.length();
        ArrayList<String> list=new ArrayList<String>();
		permute(chars, 0,length , list);
        
        for(String i:list){
        	
        	if((i.charAt(0)!='0') && isValid(Integer.parseInt(i))){
                return true;
            }
        }
        return false;
        
    }
    
    public static boolean isValid(int n){
        int i=1;
        while(n>=i){
            if(i==n){
                return true;
            }
            i*=2;
        }
        return false;
    }
    
    public static void permute(char[] chars,int l,int n, ArrayList<String> list) {
		if(l==n) {
			list.add(new String(chars));
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