public class Main {
	public static void main(String[] args) {
		int x=5;
		int n=3;
		System.out.print(pow(x,n));
	}
	public static int pow(int x,int n){
		if(n==0){
			return 1;
		}else{
			return x*pow(x,n-1);
		}
	}
}