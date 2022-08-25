public class Main {
	public static void main(String[] args) {
		int i=5;
		System.out.print(fact(i));
	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}
}