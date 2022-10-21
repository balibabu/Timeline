package pratistha;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		test t=new test();
		int[] a={1,2,3,3};
		int i=t.sumOfPrimeIndexValues(a,a.length);
		System.out.println(i);

	}
	public int sumOfPrimeIndexValues(int[] input1,int input2) {
		if(input2<3)
			return 0;
		int sum=0;
		ArrayList<Integer> list=primeList(input2);
		if(list.size()==0)
			return 0;
		for(int i:list)
			sum+=input1[i];
		return sum;
	}
	public static boolean divide(int n,ArrayList<Integer> list) {
		if(list.size()==0)
			return false;
		for(int i:list) {
			if(n%i==0)
				return true;
		}
		return false;
	}
	
	public static ArrayList<Integer> primeList(int n) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=2;i<n;i++) {
			if(!divide(i,list)) {
				list.add(i);
			}
		}
		return list;
	}

}
