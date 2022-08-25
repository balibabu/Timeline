package ClassWork;

public class str_to_int {

	public static void main(String[] args) {
		String str="1234";
		System.out.println(get_num(str));
		System.out.println(get_num("-152"));
	}
	public static int get_num(String s) {
		int flag=1,i=0;
		if(s.charAt(0)=='-') {
			flag=-1;
			i=1;
		}
		int num=0;
		
		for(;i<s.length();i++) {
			num=(s.charAt(i)-48)+num*10;
		}
		return num*flag;
	}

}
