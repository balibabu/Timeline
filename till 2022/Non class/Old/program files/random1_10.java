package chapter_2;

import java.util.*;

public class random1_10 {

	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(randomSubList2(lst, 3));
	}
	
static List<Integer> randomSubList2(ArrayList<Integer> lst, int k) {
		
		Random r = new Random();
		int size = lst.size();
		for(int i=0; i<k; i++) {
			int rnd = r.nextInt(size);
			Collections.swap(lst, i, rnd);
		}
		
		List<Integer> ret = lst.subList(0, k);
		return ret; 	 	
	}

}
