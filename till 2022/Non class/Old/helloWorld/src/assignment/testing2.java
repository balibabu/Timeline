package assignment;
import java.util.*;
public class testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(!true);
		char ch='a';
		char ch2=Character.toUpperCase(ch);
		System.out.println(ch2);
		
		StringTokenizer stuff = new StringTokenizer( "abc,def,ghi" );
		System.out.println( stuff.nextToken() );
		System.out.println(stuff.hasMoreElements());
		String s="assda";
		StringBuilder st=new StringBuilder("bali");
		st.deleteCharAt(2);
		System.out.println(st);
		String a="hjdvb\naudvj";
		String b="Dvb";
		if(a.substring(2,5).equalsIgnoreCase(b))
			System.out.println(a.substring(2,5));
		
		
	}

}
