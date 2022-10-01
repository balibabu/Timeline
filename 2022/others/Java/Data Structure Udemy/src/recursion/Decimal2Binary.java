package recursion;

public class Decimal2Binary {

	public static void main(String[] args) {
		System.out.println(deciToBin(10));

	}
	public static int deciToBin(int n) {
		if(n==0)
			return 0;
		return n%2+deciToBin(n/2)*10;
	}
	
	

}
