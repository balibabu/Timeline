package chapter_2;

import java.util.ArrayList;
import java.util.Arrays;

public class array_list {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(8,7,9,9,1,2,3,4,5));
		int sum=0;
		for(int num:list) {
			sum+=num;
		}
		System.out.println("sum "+sum);
		smallest_largest(list);
		
	}
	
	
	public static void smallest_largest(ArrayList<Integer> list) {
		int smallest=list.get(0);
		int largest=list.get(0);
		for(int num:list) {
			if(smallest>num) {
				smallest=num;
			}else if(largest<num){
				largest=num;
			}
		}
		System.out.println("smallest "+smallest);
		System.out.println("largest "+largest);
	}
	
	

}
