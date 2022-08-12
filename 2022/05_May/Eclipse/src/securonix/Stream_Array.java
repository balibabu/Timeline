package securonix;

import java.util.Arrays;

public class Stream_Array {

	public static void main(String[] args) {
			
		int[] list= {4,41,5};
		System.out.println("list:");
		Arrays.stream(list).forEach(n -> System.out.print(n+" "));
		
		Arrays.parallelSort(list);
		System.out.println("\nsorted list:");
		Arrays.stream(list).forEach(n -> System.out.print(n+" "));
		
	}

}
