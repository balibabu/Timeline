package assignment10;
import java.util.StringTokenizer;
public class string_tokenizer1 {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("my name is khan,but| i am not, a |terrorist",",|");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
