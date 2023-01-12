package test;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Hi");
		Runner.main("hello world");
		Runner.main("hello","world");
	}
	public static void main(String str1) {
		System.out.println("Overloaded: "+str1);
	}
	public static void main(String str1,String str2) {
		System.out.println("Overloaded: "+str1);
		System.out.println("Overloaded: "+str1+" & "+str2);
	}
}
