package ClassWork;

public class String_split {

	public static void main(String[] args) {
		String str="123:foo:144:xyz";
		String[] splited=str.split(":");
		for(String s:splited)
			System.out.println(s);
	}

}
