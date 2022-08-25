package ClassWork;

public class int_to_str {

	public static void main(String[] args) {
		int num=127;
		System.out.println(get_str(num));
		System.out.println(get_str(-126));
	}
	public static String get_str(int n) {
		String s="";
		boolean flag=false;
		if(n<0)
			flag=true;
		n=Math.abs(n);
		while(n>0) {
			int r=n%10;
			s=(char)(r+48)+s;
			n=n/10;
		}
		if(flag)
			s="-"+s;
		return s;
	}

}
