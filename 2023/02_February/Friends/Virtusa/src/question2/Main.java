package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		int[][] mat1= new int[m1][n1];
		int[][] mat2= new int[m2][n2];

		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		Thread thread=new Thread(new MatrixMultiplication(mat1, mat2));
		thread.run();
	}

}
