package chapter_1;

public class is_it_rectangle {

	public static void main(String[] args) {
		System.out.println(is_rectangle(-3, 5, 0, -4, 3, 7, 6, -2));
		System.out.println(is_rectangle(0, 0, 1, 1, 4, 1, 4, 0));

	}

	private static boolean is_rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

		boolean width = get_distance(x1, y1, x2, y2) == get_distance(x3, y3, x4, y4);
		boolean height = get_distance(x1, y1, x4, y4) == get_distance(x3, y3, x2, y2);
		boolean diagonals = get_distance(x1, y1, x3, y3) == get_distance(x4, y4, x2, y2);
		if (width && height && diagonals) {
			return true;
		}
		return false;
	}

	public static double get_distance(int x1, int y1, int x2, int y2) {
		double dist = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
		return dist;
	}

}
