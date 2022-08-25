package Assignment13;
/*
 * 4. Write a program to extract maximum numeric value from a given
string. Input: There are 60 students in cse d section, 40 in cse b,
and 55 in cse a. Output: 60
 */
import java.util.Arrays;
import java.util.regex.Pattern;

public class a13q4 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[^\\d]* | ^$");
		String[]arrOfStr = p.split("There are 60 students in cse d section, 80 in cse b and 55 in cse");
		int[] nums=new int[arrOfStr.length];
		for (int i=0;i<arrOfStr.length;i++) { 
			try {
				nums[i]=Integer.parseInt(arrOfStr[i]);
			}catch(Exception e) {
				continue;
			}
		}
		Arrays.sort(nums);
		System.out.println(nums[arrOfStr.length-1]);
		
	}

}
