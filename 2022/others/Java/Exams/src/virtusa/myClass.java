package virtusa;


public class myClass {
	int a=5;

	public static void main(String[] args) {
		String s1="bbc";
		String s2="acc";
		System.out.println(s1.compareTo(s2)); //only compares one character and return diff
		myClass m=new myClass();
	}
	public myClass() {
		System.out.println("inside constructor");
	}

	{
		System.out.println("inside instance block");
	}
}
