package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		File file = new File("D:\\Works_Space\\Timeline\\2022\\Friends\\aayush\\src\\assignment6\\brackets.txt");
		Scanner rows = new Scanner(file);
		while (rows.hasNextLine()) {
			System.out.println(isParenthesisMatch(rows.nextLine()));
		}
		rows.close();
	}

	public static boolean isParenthesisMatch(String line) {
		line=line.strip();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<line.length();i++) {	
			char c=line.charAt(i);
			if(c=='(') {
				stack.push(c);
			}else {
				if(stack.size()==0) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.size()==0;
	}

}
