package ClassWork;

public class replacing_alpha2 {

	public static void main(String[] args) {
		String str="acdbbca";
		System.out.println(str);
		for(int i=0;i<str.length()-i+1;i++) {
			if(str.charAt(i)=='a')
				str+="dd";
			else if(str.charAt(i)=='b')
				continue;
			else if(str.charAt(i)!='a' && str.charAt(i)!='b')
				str+=str.charAt(i);
		}
		System.out.println(str);
	}

}
