public class Main {
	public static void main(String[] args) {
		int n=7;
		System.out.print(fibo(n));
	}
	public static int fibo(int n){
		if(n==1 || n==2){
			return 1;
		}else{
			return fibo(n-1)+fibo(n-2);
		}
	}
}