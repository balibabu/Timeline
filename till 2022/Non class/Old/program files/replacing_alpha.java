package ClassWork;

public class replacing_alpha {

	public static void main(String[] args) {
		String s1="acdbbca";
		System.out.println(s1);
		StringBuilder s2=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a')
				s2.append("dd");
			else if(s1.charAt(i)=='b')
				continue;
			else if(s1.charAt(i)!='a' && s1.charAt(i)!='b')
				s2.append(s1.charAt(i));
		}
		System.out.println(s2);
				
	}

}
