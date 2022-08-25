package chapter_1;

public class reverse_binary {

	public static void main(String[] args) {
		int n = 29;
		System.out.println(Integer.toString(n, 2));
		int reverse = 0;
		while (n > 0) {
			reverse = reverse << 1;
			if ((n & 1) == 1) {
				reverse = reverse ^ 1;
			}
			n >>= 1;
		}
		System.out.println(Integer.toString(reverse, 2));
		System.out.println(reverse);
	}

}
