package assignment10;

import java.util.StringTokenizer;

/*5.Write a program which read a string from user and remove all
	token from the string and create an output string which consist of
	string without any token of the input string
*/
public class a10q5 {

	public static void main(String[] args) {
		String str="apple,ball|cat|dog";
		StringTokenizer s=new StringTokenizer(str,",|",true);
		String delimeter="";
		while(s.hasMoreTokens()) {
			String temp=s.nextToken();
			if(temp.equals(",") || temp.equals("|"))
				delimeter+=temp;
		}
		System.out.println(delimeter);
	}

}
