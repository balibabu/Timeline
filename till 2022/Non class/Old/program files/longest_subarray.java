package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class longest_subarray {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,2,3,3,3,2,2,1,1));
		int pos=0;
		int max=0;
		
		int counter=0;
		ArrayList<Integer> temp=new ArrayList<>();
		int val=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(val==list.get(i)) {
				counter++;
			}else {
				temp.add(counter);
				val=list.get(i);
				counter=1;
			}
		}
		temp.add(counter);
		System.out.println(Collections.max(temp));
		
	}

}
