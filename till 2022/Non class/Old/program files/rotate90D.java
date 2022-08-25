package ClassWork;

public class rotate90D {

	public static void main(String[] args) {
		int[][] array= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//{9,10,11,12},
		//{13,14,15,16}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array[i].length;j++) {
				int temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length/2;j++) {
				int temp=array[i][j];
				array[i][j]=array[i][array.length-j-1];
				array[i][array.length-j-1]=temp;
			}
		}
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
