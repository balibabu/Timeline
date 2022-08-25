package chapter_1;

public class swap_digits {

	public static void main(String[] args) {
		int num=28;
		int i=1;
		int j=3;
		System.out.println(Integer.toString(num,2));
		swap_digit(num,i,j);
	}
	
	public static void swap_digit(int num,int i,int j) {
		if((( num>>i ) & 1) != (( num>>j) & 1)) {
			int p=(1<<i) | (1<<j);
			int shift=num^p;
			System.out.println(Integer.toString(shift,2));
		}else {
			System.out.println(Integer.toString(num,2));
		}
	}

}
