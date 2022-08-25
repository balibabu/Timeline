package assignment12;
/*7. Write a java code to move all uppercase characters to the end of
	string.
*/
public class a12q7 {

	public static void main(String[] args) {
		
		StringBuilder a=new StringBuilder("HeLloWorld");
		for(int i=0;i<a.length();i++) {
			if((int)a.charAt(i)<91 && (int)a.charAt(i)>64) {
				a.append(a.charAt(i));
				a.deleteCharAt(i);
			}
		}
		
		
		
		System.out.println(a);

	}

}
