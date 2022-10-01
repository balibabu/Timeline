package paloAlto;

public class spiral {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4,5},{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35}};
//		int[][] arr= {{1,2},{3,4}};
//		int[][] arr= {{1,2,3}};
//		int[][] arr= {{1},{2},{3}};
//		int[][] arr= {{1}};
		spiralTravel1(arr, 0, 0);
		System.out.println();
		spiralTravel2(arr);
	}
	public static void spiralTravel1(int[][] mat,int a,int b) {
		int rowP=mat.length-a;
		int colP=mat[0].length-b;
		int i=a,j=b;
		int changeRow=0,changeCol=0;
		
		for(i=i;i<colP;i++) {
			System.out.print(mat[j][i]+" ");
			changeCol=1;
		}
		if(changeCol==1)
			i--;
		else
			return;
		
		for(j=b+1;j<rowP;j++) {
			System.out.print(mat[j][i]+" ");
			changeRow=1;
		}
		if(changeRow==1)
			j--;
		else
			return;
		
		changeRow=0;changeCol=0;
		for(i=i-1;i>=a;i--) {
			System.out.print(mat[j][i]+" ");
			changeCol=1;
		}
		if(changeCol==1)
			i++;
		else
			return;
		
		for(j=j-1;j>b;j--) {
			System.out.print(mat[j][i]+" ");
			changeRow=1;
		}
		if(changeRow==1)
			j++;
		else
			return;
		
		if(a<rowP/2 && b<colP/2) {
			spiralTravel1(mat, a+1, b+1);
		}
	}
	public static void spiralTravel2(int[][] mat) {
		int a = -1, b = -1;
		int rowP;
		int colP;
		int changeRow = 0, changeCol = 0;
		do {
			a++;
			b++;
			rowP = mat.length - a;
			colP = mat[0].length - b;
			int i = a, j = b;
			for (i = a; i < colP; i++) {
				System.out.print(mat[j][i] + " ");
				changeCol = 1;
			}
			if (changeCol == 1)
				i--;
			else
				return;

			for (j = b + 1; j < rowP; j++) {
				System.out.print(mat[j][i] + " ");
				changeRow = 1;
			}
			if (changeRow == 1)
				j--;
			else
				return;

			changeRow = 0;
			changeCol = 0;
			for (i = i - 1; i >= a; i--) {
				System.out.print(mat[j][i] + " ");
				changeCol = 1;
			}
			if (changeCol == 1)
				i++;
			else
				return;

			for (j = j - 1; j > b; j--) {
				System.out.print(mat[j][i] + " ");
				changeRow = 1;
			}
			if (changeRow == 1)
				j++;
			else
				return;

		} while (a < rowP / 2 && b < colP / 2);
	}
}