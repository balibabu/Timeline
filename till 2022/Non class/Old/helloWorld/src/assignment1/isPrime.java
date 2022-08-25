package assignment1;
import java.util.*;
public class isPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if (isprime(a)) {
			System.out.println("it's prime");
		}else {
			System.out.println("it's not prime");
		}
	}
	
	public static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
