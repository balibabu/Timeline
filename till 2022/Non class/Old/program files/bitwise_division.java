package chapter_1;

public class bitwise_division {

	public static void main(String[] args) {
		divide(19, 3);
	}

	public static void divide(int x, int y) {
		int temp = 0;
		int quotient = 0;
		int sign = 1;
		if (x * y < 0) {
			sign = -1;
		}
		x = Math.abs(x);
		y = Math.abs(y);
		for (int i = 29; i >= 0; i--) {
			if ((temp + (y << i)) <= x) {
				temp += y << i;
				quotient = quotient | (1 << i);
			}
		}
		System.out.println("Quotient : " + sign * quotient);
		System.out.println("Remainder : " + (x - (sign * quotient) * y));
	}

}
