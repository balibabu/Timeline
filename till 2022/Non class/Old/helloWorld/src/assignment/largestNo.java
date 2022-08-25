package assignment;
import java.util.*;
public class largestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= new int[10];
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		int largest=array[0];
		for(int i=0;i<array.length;i++) {
			if(largest<array[i]) {
				largest=array[i];
			}
		}
		System.out.println("largest no. is "+largest);

	}

}
