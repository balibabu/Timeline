package virtusa;

public class swapBalls {

	public static void main(String[] args) {
		int[][] matrix= {{8,9},{9,8}};
		System.out.println(isSwapPossible(matrix));
		
	}

	private static boolean isSwapPossible(int[][] matrix) {
		int[] mat1=getMatrix(matrix[0]);
		int[] mat2=getMatrix(matrix[1]);
		int c1=0,c2=0;
		while(c1<mat1.length && c2<mat2.length) {
			if(mat1[c1]==0) {
				c1++;
			}else {
				if(mat2[c2]==0) { //swapping values
					int tmp=mat1[c1];
					mat1[c1]=mat2[c2];
					mat2[c2]=tmp;
				}else {
					c2++;
				}
			}
		}
		return isSwapped(mat1,mat2);
	}
	

	private static boolean isSwapped(int[] mat1, int[] mat2) {
		for(int i=0;i<mat1.length;i++) {
			if(mat1[i]!=0)
				return false;
			if(mat2[i]!=1)
				return false;
		}
		return true;
	}

	private static int[] getMatrix(int[] mat) {
		int size=sum(mat);
		int[] matrix=new int[size];
		for(int i=0;i<mat[0];i++) {
			matrix[i]=0;
		}
		for(int i=mat[0];i<size;i++) {
			matrix[i]=1;
		}
		return matrix;
	}
	
	public static int sum(int[] matrix) {
		int s=0;
		for(int i=0;i<matrix.length;i++) {
			s+=matrix[i];
		}
		return s;
	}
}

/*
 * Code Dumper
 
		System.out.println(mat1);
		System.out.println(mat2);
		for(int i:mat1)
			System.out.print(i+" ");
		System.out.println();
		for(int i:mat2)
			System.out.print(i+" ");
		System.out.println();
 
 */
