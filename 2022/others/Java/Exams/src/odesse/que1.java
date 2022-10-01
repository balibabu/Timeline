package odesse;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(get(n));
	}
	public static int get(int n) {
		int tmp=n;
		int sum=0;
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
				sum+=tmp/n;
			}else {
				n=n-1;
				sum+=tmp/n;
			}
		}
		return sum;
	}
}
