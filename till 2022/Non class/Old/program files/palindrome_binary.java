package chapter_1;

public class palindrome_binary {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(Integer.toString(n, 2));
		System.out.println(Integer.toString(reverse(n), 2));
		if (n == reverse(n)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	public static int reverse(int n) {
		int result = 0;
		while (n > 0) {
			result = result << 1;
			if ((n & 1) == 1) {
				result = result ^ 1;
			}
			n = n >> 1;
		}
		return result;
	}

}