package practice;

public class q1suffle {

	public static void main(String[] args) {
		String s1="abcdefgh";
		String s2="12345";
		String s3="dabecf";
		if(suffle(s1,s2).equals(s3)) {
			System.out.println("valid suffle");
		}else {
			System.out.println("invalid suffle");
		}
		System.out.println(suffle(s1,s2));
	}
	
	public static String suffle(String s1, String s2) {
		String suff="";
		int l1=0,l2=0;
		while(true) {
			suff+=""+s2.charAt(l2)+s1.charAt(l1)+"";
			l1++;
			l2++;
			if(l1==s1.length()) {
				suff+=s2.substring(l1, s2.length());
				break;
			}
			if(l2==s2.length()) {
				suff+=s1.substring(l2, s1.length());
				break;
			}
			
		}
		return suff;
	}
}
