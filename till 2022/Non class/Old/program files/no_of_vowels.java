package ClassWork;

public class no_of_vowels {

	public static void main(String[] args) {
		String str="Hello String";
		str=str.toLowerCase();
		int vowel=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				vowel++;
		}
		System.out.println("No. of vowels is "+vowel);
	}

}
