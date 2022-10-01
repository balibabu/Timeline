package thinking;

public class integerD {
	final class subclass{
		public subclass() {
			System.out.println("Inside Subclass");
		}
	}

	public static void main(String[] args) {
		int a=9_9_9;
		int b=10_9;
		int c=9_99_9;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		float f1=9_5;
		float f2=99_734.4_6f;       //underscore is only used to make more readable form
		System.out.println(f1);
		System.out.println(f2);
	}

}
