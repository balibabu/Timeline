package chapter_2;

public class array_even_odd {

	public static void main(String[] args) {
		int[] a= {2,4,8,0,9,1,2,3,4,5,6};
		even_odd(a);
		
	}
	
	public static void even_odd(int[] Array) {
		int next_even = 0, next_odd = Array.length - 1; 
		while (next_even < next_odd) {
			if (Array[next_even] % 2 == 0) { 
				next_even++;
			} else { 
				int temp = Array[next_even];
				Array[next_even] = Array[next_odd]; 
				Array[next_odd--] = temp;
			}
		}
		for(int num:Array) {
			System.out.println(num);
		}
		
	}

}
