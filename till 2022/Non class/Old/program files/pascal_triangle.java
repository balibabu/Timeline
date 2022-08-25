package ClassWork;

import java.util.ArrayList;
import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		long t1=System.currentTimeMillis();
		generate(n);
		System.out.println("Time taken in milliseconds "+(System.currentTimeMillis()-t1));
	}
	public static void generate(int n) {
		ArrayList<Integer> array=new ArrayList<>();
		array.add(1);
		System.out.println(array);
		for(int i=1;i<=n;i++) {
			ArrayList<Integer> temp=new ArrayList<>();
			temp.add(1);
			for(int j=1;j<i;j++) {
				temp.add(array.get(j-1)+array.get(j));
			}
			temp.add(1);
			array=temp;
			System.out.println(array);
		}
	}

}
