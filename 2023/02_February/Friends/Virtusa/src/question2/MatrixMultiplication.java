package question2;

public class MatrixMultiplication implements Runnable {
	int[][] mat1;
	int[][] mat2;

	public MatrixMultiplication(int[][] mat1, int[][] mat2) {
		super();
		this.mat1 = mat1;
		this.mat2 = mat2;
	}


	@Override
	public void run() {
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				int temp = 0;
				for (int k = 0; k < mat2.length; k++) {
					temp += mat1[i][k] * mat2[k][j];
				}
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}

}
