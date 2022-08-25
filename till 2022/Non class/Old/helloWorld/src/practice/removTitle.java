package practice;

import java.util.StringTokenizer;

public class removTitle {

	public static void main(String[] args) {
		String s="Mr.Sachin Tendulkar";
		System.out.println(s);
		remove_title(s);
		s="Mister Chunkey Pandey";
		System.out.println(s);
		remove_title(s);
				
		

	}
	
	public static void remove_title(String s) {
		StringTokenizer st=new StringTokenizer(s,". ");
		st.nextToken();
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
		System.out.println();
	}

}
