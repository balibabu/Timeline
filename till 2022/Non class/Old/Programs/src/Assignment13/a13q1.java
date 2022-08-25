package Assignment13;
/*
 * Write a program in java to remove whitespaces fromm a string.
 */
import java.util.regex.Pattern;

public class a13q1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		String[] Split=p.split("My name is khan");
		for(String str:Split)
			System.out.print(str);
	}

}
