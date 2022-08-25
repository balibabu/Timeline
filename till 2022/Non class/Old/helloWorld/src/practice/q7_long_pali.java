package practice;
import assignment9.a9q5;
public class q7_long_pali {

	public static void main(String[] args) {
		String s="i saw a racecar driven by madam at noon";
		String[] palin=get_palindrome(s);
		palin=q4_sort.sort(palin);
		System.out.println(palin[palin.length-1]);
	}

	public static String[] get_palindrome(String s) {
		String[] Split=s.split(" ");
		String only_pali="";
		for(int i=0;i<Split.length;i++) {
			if(a9q5.isPalindrome(Split[i]))
				only_pali+=Split[i]+" ";
		}
		return only_pali.split(" ");
	}
	
}
