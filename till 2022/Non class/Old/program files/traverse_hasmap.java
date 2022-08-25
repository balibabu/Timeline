package chapter_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class traverse_hasmap {

	public static void main(String[] args) {
		HashMap<Integer,String> students=new HashMap<Integer,String>();
		students.put(1,"Ram");
		students.put( 3,"Shyam");
		students.put(2,"Gita");
		for(int i=1;i<=students.size();i++) {
			System.out.println(students.get(i));
		}
		
		HashSet<Integer> n=new HashSet<Integer>(Arrays.asList(1,2,3,2,1,4,5,4,2,1,3));
		for(int num:n)
			System.out.println(num);
	}

}
