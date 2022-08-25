package practice;

public class q3_highest_char_occ {

	public static void main(String[] args) {
		String s="aaajbdfvihvbzbbbb";
		System.out.println(s);
		System.out.println(find_char(s));

	}
	
	public static char find_char(String s) {
		s.toLowerCase();
		int[] cnt=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=i; j<s.length();j++) {
				if(s.charAt(i)==(s.charAt(j))) {
					cnt[i]+=1;
				}
			}
		}
		int pos=0;
		int largest=cnt[0];
		for(int i=0;i<s.length();i++) {
			if(largest<cnt[i]) {
				pos=i;
				largest=cnt[i];
			}
		}
		return s.charAt(pos);
	}
}
