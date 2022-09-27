package testing;

public class test1 {

	public static void main(String[] args) {
		System.out.println("in main method");
		test1 t=new test1();
		System.out.println("in main method after creating obj");
	}
	{
		System.out.println("in instance method");
	}
	static {
		System.out.println("in static method");
	}

}
