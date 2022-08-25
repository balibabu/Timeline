package practice;
import java.util.regex.*;
public class sDF {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("M+", 5);
		Matcher matcher = pattern.matcher("M Merit Match MM m mM");
		while (matcher.find())
			System.out.print(matcher.group() + " ");

	}

}
