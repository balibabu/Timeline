package practice;
import java.util.regex.*;
public class shfb {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(",\\s[0-9]{1,4}){4},\\s[0-9]{1,3}\\.[0-9]? ");
		Matcher matcher = pattern.matcher("");
		while (matcher.find())
			System.out.print(matcher.group() + " ");

	}

}
