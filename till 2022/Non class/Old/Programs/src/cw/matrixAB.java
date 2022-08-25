package cw;

public class matrixAB {

	public static void main(String[] args) {
		int[][] m1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2= {{3,2,1},{6,5,4},{9,8,7}};
		int[][] m3= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m3[i][j]=0;
				for(int k=0;k<3;k++) {
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
