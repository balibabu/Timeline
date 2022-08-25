package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//input:1234567890 output:(123) 456-7890
public class cw3nov {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("([0-9]{3})([0-9]{3})([0-9]{4})");
		Matcher m=p.matcher("1234567890 8756235799");
		while(m.find())
			System.out.println("("+m.group(1)+")"+" "+m.group(2)+"-"+m.group(3));

	}

}
