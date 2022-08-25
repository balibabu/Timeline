package cw;

public class binary_to_octal {

	public static void main(String[] args) {
		String binary="101";
		int deci=Integer.parseInt(binary,2);
		String octal=Integer.toString(deci,8);
		System.out.println(octal);
	}

}
