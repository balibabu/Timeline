package assignment12;
/*6. Write a java code to swap two string variables without using third
or temp variable
*/
public class a12q6 {

	public static void main(String[] args) {
		String a="hello";
		String b="world";
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a=a.concat(b);
		b=a.substring(0, b.length());
		a=a.substring(b.length());
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
