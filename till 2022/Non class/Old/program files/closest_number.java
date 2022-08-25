package chapter_1;

public class closest_number {

	public static void main(String[] args) {

		int n = 13;
		info(n);
	}

	public static int perform(int n) {
		int temp = n;
		int i = -1;
		int j = -1;
		int c = -1;
		while (n > 0) {
			c += 1;
			if ((n & 1) == 0)
				j = c;
			if ((n & 1) == 1)
				i = c;

			if (i != j && i > -1 && j > -1)
				break;
			n = n >> 1;
		}
		return swap(temp, i, j);
	}

	public static int swap(int n, int i, int j) {
		int shift = n;
		if (((n >> j) & 1) != ((n >> i) & 1)) {
			int p = (1 << i) | (1 << j);
			shift = n ^ p;
		}
		return shift;
	}

	public static void info(int n) {
		// System.out.println(Integer.parseInt(String.valueOf(n),2));
		System.out.println(Integer.toString(n, 2));
		System.out.println(Integer.toString(perform(n), 2));
	}
}
