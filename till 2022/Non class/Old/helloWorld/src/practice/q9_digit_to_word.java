package practice;

public class q9_digit_to_word {

	public static void main(String[] args) {
		String str="4 scores and 7 years ago";
		str=transform(str);
		System.out.println(str);

	}

	public static String transform(String s) {
		String[] nums= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>47 && s.charAt(i)<58)
				temp+=nums[s.charAt(i)-48];
			else
				temp+=""+s.charAt(i);
		}
		return temp;
	}
}
