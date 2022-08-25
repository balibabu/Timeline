package chapter_2;

import java.util.ArrayList;

public class arraylist_2D {
	public static void main(String[] args) {
		ArrayList<ArrayList<Object>> array=new ArrayList<ArrayList<Object>>();
		array.add(new ArrayList<Object>());
		array.get(0).add(1);
		array.get(0).add(2);
		array.get(0).add(3);
		array.add(new ArrayList<Object>());
		array.get(1).add(11);
		array.get(1).add(21);
		array.get(1).add(31);
		for(int i=0;i<array.size();i++) {
			for(int j=0;j<array.get(i).size();j++) {
				System.out.print(array.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
