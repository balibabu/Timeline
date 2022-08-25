package practice;

public class q6_1st_uniq_char {

	public static void main(String[] args) {
		String s="gibblegabbler";
		System.out.println(get_uniq_char(s));

	}

	public static char get_uniq_char(String s) {
		s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0; j<s.length();j++) {
				if(s.charAt(i)==(s.charAt(j))) {
					count++;
				}
			}
			if(count==1)
				return s.charAt(i);
		}
		return 0;
	}
}
