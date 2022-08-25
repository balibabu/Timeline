package practice;

public class word5 {

	public static void main(String[] args) {
		String s="This is how we would ordinary write a sentence";
		sentence_in_five(s);

	}
	
	public static void sentence_in_five(String s) {
		String[] Split=s.split(" ");
		int a=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.print(s.charAt(i));
				a++;
			}
			if(a==5) {
				System.out.print(" ");
				a=0;
			}
		}
	}

}
