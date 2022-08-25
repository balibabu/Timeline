package assignment;

import java.util.StringTokenizer;

public class cw1 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("apple,,,ball,cat",",",true);
		while(st.hasMoreTokens()) {
			String t2;
			String t1=st.nextToken();
			if(t1.equals(",")) {
				while(true) {
					t2=st.nextToken();
					if(t2.equals(",")) {
						t2=st.nextToken();
					}else {
						System.out.println(t2);
						break;
					}
				}
				//System.out.println(t1);
				System.out.println(t2);
			}else {
				System.out.println(t1);
			}
		}

	}

}
