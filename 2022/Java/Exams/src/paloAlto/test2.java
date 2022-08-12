package paloAlto;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr1=new int[N];
		int[] arr2=new int[N];
		for(int i=0;i<N;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			arr2[i]=sc.nextInt();
		}

		int[] newArr=solve(arr1,arr2,N);
		for(int x:newArr) {
			System.out.print(x+" ");
		}
	}
	public static HashMap<Integer, Integer> Counter(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], 1 + map.get(array[i]));
			} else {
				map.put(array[i], 1);
			}
		}
		return map;
	}
	public static int[] solve(int[] arr1,int[] arr2,int N) {
		HashMap<Integer, Integer> hasAr = Counter(arr1);
		Set<Integer> keys=hasAr.keySet();
		HashMap<Integer, Integer> average=new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++) {
			if(average.containsKey(arr1[i])) {
				average.put(arr1[i], average.get(arr1[i])+arr2[i]);
			}else {
				average.put(arr1[i], arr2[i]);
			}
		}
		for(int i:keys) {
			average.put(i, average.get(i)/hasAr.get(i));
		}
		
		int[] newArr=new int[N];
		for(int i=0;i<N;i++) {
			newArr[i]=arr2[i]-average.get(arr1[i]);
		}

		return newArr;
	}
}
/*
7
1 1 5 3 1 3 5
10 20 30 15 17 19 7
*/