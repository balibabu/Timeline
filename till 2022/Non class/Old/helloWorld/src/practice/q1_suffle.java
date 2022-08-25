package practice;

public class q1_suffle {

	public static void main(String[] args) {
		String str1="abc";
		String str2="defgh";
		String str3="daebcf";
		if(is_valid_suffle(str1,str2,str3))
			System.out.println("valid suffle");
		else
			System.out.println("invalid suffle");
	}

	public static boolean is_valid_suffle(String s1,String s2,String s3) {
		int[] order1=new int[s3.length()];
		int[] order2=new int[s3.length()];
		int c1=0;
		int c2=0;
		for(int i=0;i<s3.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j)==s3.charAt(i)) {
					order1[c1]=j;
					c1++;
					break;
				}
			}
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j)==s3.charAt(i)) {
					order2[c2]=j;
					c2++;
					break;
				}
			}
		}
			
		return is_sorted(order1, c1) && is_sorted(order2, c2);
	}
	
	public static boolean is_sorted(int[] arr, int size) {
		for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}
}
