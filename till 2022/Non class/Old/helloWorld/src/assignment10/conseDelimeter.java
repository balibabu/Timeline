package assignment10;
import java.util.StringTokenizer;
public class conseDelimeter {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("apple,ball,,cat,,,dog,egg",",",true);
		while(s.hasMoreTokens()) {
			String str1=s.nextToken();
			int c=0;
			if(!str1.equals(",")) {
				System.out.print(str1);
			}else {
				c++;
				String str2=s.nextToken();
				while(true) {
					if(str2.equals(",")) {
						c++;
						str2=s.nextToken();
					}else {
						if(c==1)
							System.out.print(str1);
						else
							System.out.print(" ");
						break;
					}
				}
				System.out.print(str2);
			}
		}
	}
}
