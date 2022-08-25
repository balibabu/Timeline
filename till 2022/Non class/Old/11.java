public class Main {
	public static void main(String[] args) {
		System.out.print(gcd(8,20));
	}
	public static int gcd(int m,int n){
		if(n==0){
			return m;
		}else{
			return gcd(n,n%m);
		}
	}
}