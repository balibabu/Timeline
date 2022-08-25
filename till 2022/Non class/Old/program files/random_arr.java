package chapter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class random_arr {

	public static void main(String[] args) {
		ArrayList<Integer> array1=new ArrayList<Integer>(Arrays.asList(2,3,5,1,9,6,5,4,8,3,2,1,0));
		System.out.println(array1);
		get_list(array1, 5);
	}
	
	static void get_list(ArrayList<Integer> array1,int k){
		List<Integer> array2=array1.subList(0, k);
		System.out.println(array2);
		List<Integer> array3=array1.subList(k, array1.size());
		//System.out.println(array3);
		Random rnd=new Random();
		int n=array3.get(rnd.nextInt(array3.size()));
		for(int i=0;i<array2.size();i++) {
			if(array2.get(i)==n) {
				try {
					Collections.swap(array2,i, array2.get(i));
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		System.out.println("random no. from array is "+n);
		System.out.println(array2);
		
		
	}

}
