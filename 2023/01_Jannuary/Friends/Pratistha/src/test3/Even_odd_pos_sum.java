package test3;

public class Even_odd_pos_sum {

	public static void main(String[] args) {
		int[] a= {2,3,1,4};
		print_highest_sum(a, 4);
	}
	
	public static void print_highest_sum(int[] nums,int size) {
		int a=nums[0];
		int b=nums[1];
		int sum=a+b;
		for(int i=0;i<size;i+=2) {
			for(int j=1;j<size;j+=2) {
				if((nums[i]+nums[j])>sum) {
					a=nums[i];
					b=nums[j];
					sum=a+b;
				}
			}
		}
		System.out.println(a+" "+b);
	}

}
