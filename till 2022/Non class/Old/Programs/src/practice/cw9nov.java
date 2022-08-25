package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Q: use the given input and the given patterns to check the working 
 * of all compile flags(alone or combined)
 */
public class cw9nov {

	public static void main(String[] args) {
		String inp="I dream of softwares\nmore softwares, all day long";
		String[] patt= {"softwares.more softwares","wares\nmore","softwares$","more softwares"};
		for(int i=0;i<patt.length;i++) {
			System.out.println(inp+"\n"+patt[i]);
			Pattern p=Pattern.compile(patt[i],Pattern.CASE_INSENSITIVE|Pattern.DOTALL|Pattern.MULTILINE);
			Matcher m=p.matcher(inp);
			while(m.find()) {
				System.out.println("-->Match "+m.group()+" found at index "+m.start());
			}
			System.out.println("\n=====================================================");
		}
	}

}
