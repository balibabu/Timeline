package classwork;

import java.util.*;

public class brackets {

	public static void main(String[] args) {
		String s="[{()}]";
		System.out.println(isBalanced(s));
	}
	public static boolean isBalanced(String s) {
		HashMap<Character,Character> map = new HashMap<>();
		map.put(']','[');
		map.put('}','{');
		map.put(')','(');

		Stack<Character> stack = new Stack<>();

		for(int i=0; i<s.length(); i++) {
			char curr = s.charAt(i);

			if(curr == '[' || curr == '{' || curr == '(') {
				stack.push(curr);
			}
			else {
				if(map.get(curr) == stack.peek()) stack.pop();
				else return false;
			}
		}
		return true;
	}

}
