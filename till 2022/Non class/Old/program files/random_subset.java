package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class random_subset {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(15,65,24,48,64,57,25,16,35));
		System.out.println(list);
		List<Integer> subset=new ArrayList<Integer>();
		int k=5;
		while(subset.size()!=k) {
			int i=(int)(Math.random()*list.size())%list.size();
			subset.add(list.get(i));
			list.remove(i);
		}
		System.out.println(subset);
	}

}
