package cw;
import java.math.BigInteger;
public class bigInteger {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("315123122");
		BigInteger b2=new BigInteger("8173561");
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		BigInteger sum=b1.add(b2);
		System.out.println("sum is "+sum);
		BigInteger diff=b2.subtract(b1);
		System.out.println("difference is "+diff);
		System.out.println("absolute value is "+diff.abs());
		BigInteger mltiply=b1.multiply(b2);
		System.out.println("product is "+mltiply);
		BigInteger power=b1.pow(3);
		System.out.println("b1 to the power 3 is "+power);
		System.out.println("negate b1 : "+b1.negate());
		System.out.println("compareTo :"+b1.compareTo(b2));
		System.out.println("b1=b2? :"+b1.equals(b2));
		
	}

}
