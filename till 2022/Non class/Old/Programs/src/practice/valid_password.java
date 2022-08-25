package practice;
import java.util.regex.*;
public class valid_password {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{6,}[0-9]$");
		Matcher m=p.matcher("appgg5h_54");
		boolean b=m.matches();
		System.out.println(b);

	}

}
