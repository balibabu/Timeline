package random_que;

import java.util.Arrays;
import java.util.regex.Pattern;

public class q1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[^\\d]* | ^$");
		String[]arrOfStr = p.split("java adder 1 3 2 10");
		int[] nums=new int[arrOfStr.length];
		for (int i=0;i<arrOfStr.length;i++) { 
			try {
				nums[i]=Integer.parseInt(arrOfStr[i]);
			}catch(Exception e) {
				continue;
			}
		}
		int sum=0;
		for (int i=0;i<arrOfStr.length;i++) { 
			sum+=nums[i];
			System.out.println(nums[i]);
		}
		System.out.println(sum);

	}

}
