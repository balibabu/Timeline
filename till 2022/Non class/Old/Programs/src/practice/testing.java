package practice;

import java.util.regex.*;

public class testing {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[^abc]");
		Matcher m=p.matcher("a");
		boolean b=m.matches();
		System.out.println(b);
	}

}
