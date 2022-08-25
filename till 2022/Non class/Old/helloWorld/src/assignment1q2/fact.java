package assignment1q2;

public class fact {
	public fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("factorial of "+n+" is "+f);
	}
}
