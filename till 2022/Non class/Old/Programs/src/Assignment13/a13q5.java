package Assignment13;
/*
 * 5. Write a program to demonstrate the splitting of a text by a given
pattern. The given input is “CSE1ECE2EEE”. The output will be:
CSE
ECE
EEE
 */
import java.util.regex.Pattern;

public class a13q5 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\d");
		String[] Split=p.split("CSE1ECE2EEE");
		for(String str:Split)
			System.out.println(str);
	}

}
