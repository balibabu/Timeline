package cw;
import java.util.Arrays;
import java.util.Scanner;
public class array_of_double {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		double[] nums=new double[n];
		System.out.println("enter values in array");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextDouble();
		}
		Arrays.sort(nums);
		System.out.println("max ="+nums[n-1]);
		System.out.println("min ="+nums[0]);
	}

}
