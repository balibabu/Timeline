package practice;
/*
 * 1. Strings matching names starting with Anii or Aniie or Aniy.
2. Strings starting with vowels.
3. Strings having only digits upto 6 places.
4. Strings having Get Set Go within as different words.
 */
import java.util.regex.*; 
public class regex1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Anii.*|Aniie.*|Aniy.*");
		Matcher m1=p.matcher("Aniil is a good student");
		boolean b1=m1.matches();
		System.out.println(b1);
		
		Pattern p2=Pattern.compile("[aeiouAEIOU].*");
		Matcher m2=p2.matcher("Aniil is a good student");
		boolean b2=m2.matches();
		System.out.println(b2);
		
		Pattern p3=Pattern.compile("[0-9]{6}.*");
		Matcher m3=p3.matcher("123456 are numbers");
		boolean b3=m3.matches();
		System.out.println(b3);
		
		Pattern p4=Pattern.compile(".*Get.*Set.*Go.*");
		Matcher m4=p4.matcher("On your mark, Get Set and Go");
		boolean b4=m4.matches();
		System.out.println(b4);
		

		
	}

}
