package chapter_1;

public class parity_bit {

	public static void main(String[] args) {
		
		int n=21;
		System.out.println(Integer.toString(n,2));
		perform1(n);
		perform2(n);
		perform3(n);
		
	}
	
	
	public static void perform1(int n) {
		int result=0;
		while(n>0) {
			if((n&1)==1) {
				result^=1;
			}
			n>>=1;
		}
		System.out.println(result);
	}
	
	public static void perform2(int n) {
		int result=0;
		while(n!=0) {
			n=n&(n-1);
			result^=1;
		}
		System.out.println(result);
	}
	
	public static void perform3(int n) {
		int half=32;
		while(half!=0) {
			n=n^(n>>half);
			half/=2;
		}
		System.out.println(n&1);
	}


}
