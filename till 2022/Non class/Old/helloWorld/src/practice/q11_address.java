package practice;

public class q11_address {

	public static void main(String[] args) {
		String s="Sam Penn:14 Bridge St.:Hoboken, NJ 01881";
		String[] Split=s.split(":");
		for(int i=0;i<Split.length;i++) {
			System.out.println(Split[i]);
		}
	}

}
