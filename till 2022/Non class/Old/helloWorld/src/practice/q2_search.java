package practice;

public class q2_search {

	public static void main(String[] args) {
		String s1="My name is Khan but I am not a terrorist";
		String s2="khan";
		System.out.println(search(s1,s2));
	}
	public static int search(String s1, String s2) {
		int l1=s1.length();
		int l2=s2.length();
		try {
			for(int i=0;i<s1.length();i++) {
				if(s1.substring(i, i+l2).equalsIgnoreCase(s2)) {
					return i;
				}
			}
		}catch(Exception  e) {
			
		}
		return -1;
	}
}
