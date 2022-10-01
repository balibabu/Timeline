package leetcode;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println(reorderedPowerOf2(10));

	}

	public static boolean reorderedPowerOf2(int n) {
		String str = "" + n;
		int i = 1;
		while (str.length() >= ("" + i).length()) {
			String str2="" + i;
			if (str2.charAt(0) != '0') {
				if (areEqual(str,str2)) {
					System.out.println(str+" "+i);
					return true;
				}
			}
			i *= 2;
		}
		return false;
	}

	public static boolean areEqual(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (count(str1, ch) != count(str2, ch)) {
				return false;
			}
		}
		return true;
	}

	public static int count(String str, char ch) {
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				c++;
		}
		return c;
	}

}
