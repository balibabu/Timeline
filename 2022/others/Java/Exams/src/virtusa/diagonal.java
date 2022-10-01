package virtusa;

import java.util.Scanner;

public class diagonal {

	public static void main(String[] args) {
		int[][] matrix=getMatrix();
		int d=getDiagonalDiff(matrix);
		System.out.println("diff betn sum of diagonals is "+d);
	}

	private static int getDiagonalDiff(int[][] matrix) {
		int size=matrix.length;
		int d1=0,d2=0;
		for(int i=0;i<size;i++) {
			d1+=matrix[i][i];
			d2+=matrix[i][size-1-i];
		}
		return Math.abs(d2-d1);
	}

	public static int[][] getMatrix() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of square matrix ");
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		return matrix;
	}

}
