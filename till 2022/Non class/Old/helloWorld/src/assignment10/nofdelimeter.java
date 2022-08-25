package assignment10;
import java.util.StringTokenizer;
public class nofdelimeter {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("apple,ball,cat,dog,elephant",",");
		System.out.println("no. of word are "+s.countTokens());
		System.out.println("no. of ',' are "+(s.countTokens()-1));
	}

}
