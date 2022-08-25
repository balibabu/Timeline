package ClassWork;

public class num_conversion {

	public static void main(String[] args) {
		String s="10";
		int b1=2;
		int b2=2;
		String s2=get_converted(s,b1,b2);
		System.out.println(s2);
		System.out.println(get_converted(s2, b2, b1));
		System.out.println(get_converted(s2, b2, 10));

	}

	private static String get_converted(String s, int b1, int b2) {
		if(checkException(s,b1)) {
			int decimal=toDecimal(s,b1);
			String str=toBase_b2(decimal,b2);
			return str;
		}
		return "Error";
	}

	private static boolean checkException(String s, int b1) {
		for(int i=0;i<s.length();i++) {
			int c=s.charAt(s.length()-i-1);
			if(c<58)
				c-=48;
			else
				c=c-55;
			if(c>=b1)
				return false;
		}
		return true;
	}

	private static String toBase_b2(int decimal,int b2) {
		String str="";
		while(decimal>0) {
			int rem=decimal%b2;
			decimal/=b2;
			if(rem>9)
				str=(char)(rem+55)+str;
			else
				str=(char)(rem+48)+str;
		}
		return str;
	}

	private static int toDecimal(String s, int b1) {
		int num=0;
		for(int i=0;i<s.length();i++) {
			int c=s.charAt(s.length()-i-1);
			if(c<58)
				c-=48;
			else
				c=c-55;
			num+=c*Math.pow(b1, i);
		}
		return num;
	}
	

}
