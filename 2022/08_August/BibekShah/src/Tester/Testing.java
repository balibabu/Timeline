package Tester;

public class Testing {

	public static void main(String[] args) {
		Testing t=new Testing();
		System.out.println("in main method");
	}
	static {
		System.out.println("static method");
	}
	{
		System.out.println("method without name");
	}
	public Testing() {
		System.out.println("in constructor");
	}

}
