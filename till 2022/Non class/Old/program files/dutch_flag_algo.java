package chapter_1;

public class dutch_flag_algo {

	public static void main(String[] args) {

		int[] arr= {0,1,1,2,0,0,1,1,2,0,1,0,1};
		int mid=0,low=0,high=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				
				low++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else if(arr[mid]==2) {
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
