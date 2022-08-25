package practice;
import java.util.*;
public class GFG {

	public static void main(String[] args) {
		String StringValue = "There are 60 students in cse d section, 40 in cse b and 55 in cse";
		String regex = "[^\\d]* | ^$";
		String[]arrOfStr = StringValue.split(regex);
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