package Assignment13;
/*
 * 6. Write a program to get the first letter of each word in a string using
regex in java.
Input: This is CSE Students
Output:TiCS
 */
import java.util.regex.Pattern;

public class a13q6 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(\\B[a-zA-Z]*)|(\\s)");
		String[] arr=p.split("This is CSE Students");
		for(String str:arr)
			System.out.print(str);
	}

}
