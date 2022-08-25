package chapter_1;

public class palindrome_decimal {

	public static void main(String[] args) {
		int num = 983438;
		System.out.println(is_palindrome(num));
	}

	public static boolean is_palindrome(int n) {
		int reverse = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		if (reverse == temp)
			return true;
		return false;
	}

}
