package question2;

public class Main {

	public static void main(String[] args) {
		int[][] mat1= {{1,2},{3,4}};
		int[][] mat2= {{5,6},{7,8}};
		int[][] result=new int[2][2];
		Thread thread=new Thread(new RowMultiplyWorker(result, mat1, mat2, 2));
		thread.run();
		for(int[] row:result) {
			for(int i:row) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
