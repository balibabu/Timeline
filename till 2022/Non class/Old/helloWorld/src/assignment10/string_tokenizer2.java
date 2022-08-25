package assignment10;
import java.util.StringTokenizer;
public class string_tokenizer2 {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("apple,ball,cat_are_words",",_",true);
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
