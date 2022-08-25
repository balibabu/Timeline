package chapter_1;

public class multiply_binary {

	public static void main(String[] args) {
		System.out.println(multiply(2, 7));
	}

	public static int multiply(int n, int m) {
		int sum1 = 0;
		int i = 1;
		while (m > 0) {
			if ((m & 1) == 1) {
				sum1 = sum(sum1, shift(i, n));
			}
			i <<= 1;
			m >>= 1;
		}
		return sum1;
	}

	public static int sum(int n, int m) {
		int sum = 0;
		int temp = n | m << 1;
		int carry = 0;
		int result = 1;
		while (temp > 0) {
			int d1 = n & 1;
			int d2 = m & 1;
			int sum_digit = d1 ^ d2 ^ carry;
			carry = d1 & d2 | carry & (d1 ^ d2);
			sum_digit = shift(result, sum_digit);
			sum = sum | sum_digit;
			result <<= 1;
			temp >>= 1;
			n >>= 1;
			m >>= 1;
		}

		return sum;
	}

	public static int shift(int n, int sum) {
		while (n > 1) {
			sum <<= 1;
			n >>= 1;
		}
		return sum;
	}
}