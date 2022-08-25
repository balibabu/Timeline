package assignment1q3b;

public class fib {
	public fib(int n) {
		System.out.println("the fibonacci series upto nth term is");
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			int c=a;
			a=b;
			b=b+c;
		}
	}
}
