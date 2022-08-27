package leetcode;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
//		Solution sol=new Solution();
//		System.out.println(sol.reorderedPowerOf2(10));
//		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
//		map.put(0, 1);
//		System.out.println(map.containsKey(0));
//		System.out.println(map.get(0));
//		String s="12345";
//		System.out.println(s.substring(1,4));
		Exercise e=new Exercise();
		System.out.println(e.capitalizeWord("abc desf"));
//		int[] a= {4,6,8,9};
//		System.out.println();
//		for(int i:a) {
//			System.out.println(i);
//		}
//		char b='a';
//		System.out.println(Character.toUpperCase(b));
//				
//		String st="ab cd ef";
//		System.out.println(st.indexOf(" "));
		
		
	}

}

class Exercise {
	public static String capitalizeWord(String str){
	    if((str.split(" ")).length==1) {
	    	return Character.toUpperCase(str.charAt(0))+str.substring(1);
	    }
	    int n=str.indexOf(" ");
		return Character.toUpperCase(str.charAt(0))+str.substring(1,n+1)+capitalizeWord(str.substring(n+1));
	  }  
	
    public  boolean isPalindrome(String s)
    {   
    	int length=s.length();
        if(length==0 || length==1) {
        	return true;
        }
        if(s.charAt(0)!=s.charAt(length-1)) {
        	return false;
        }
        return isPalindrome(s.substring(1,length-1));
        
    }
    public boolean someRecursive(int[] arr, OddFunction odd) {
        if(arr.length==1) {
        	return odd.run(arr[0]);
        }
    	return odd.run(arr[0]) || someRecursive(remPart(arr), odd);
    }
    public int[] remPart(int[] arr) {
    	int[] arr2=new int[arr.length-1];
    	for(int i=0;i<arr2.length;i++) {
    		arr2[i]=arr[i+1];
    	}
    	return arr2;
    }

}
class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0) { 
            return false; }
       else {
           return true;
       }
    }
  }
