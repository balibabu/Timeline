package Assignment13;
/*
 * 2. Write a java program to read all mobile numbers present in given
file and validate it on the following criteria:
-The first digit should contain any number between 7 to9.
-The rest 9 digit can contain any number between 0 to 9.
-The mobile number can have 11 digits including 0 in the
beginning.
-The mobile number can be of 12 digits including 91 in the
beginnig.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a13q2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(^[789][0-9]{9})|(^[0][789][0-9]{9})|(^91[789][0-9]{9})");
		Matcher m1=p.matcher("08884334426");
		boolean b1=m1.matches();
		System.out.println(b1);
		
	}

}
