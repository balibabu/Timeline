package paloAlto;

import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nofCase = sc.nextInt();
		String[] str1 = new String[nofCase];
		String[] str2 = new String[nofCase];
		sc.nextLine();
		for (int i = 0; i < nofCase; i++) {
			str1[i] = sc.nextLine();
			str2[i] = sc.nextLine();

		}
		int[][] nums = new int[nofCase][3];
		for (int i = 0; i < nofCase; i++) {
			String[] strArr = str1[i].split(" ");
			for (int j = 0; j < 3; j++) {
				nums[i][j] = Integer.parseInt(strArr[j]);
			}
		}
		for (int i = 0; i < nofCase; i++) {
			spiralTravel2(nums[i][0], nums[i][1], nums[i][2], str2[i]);
		}

	}
	public static void spiralTravel2(int row, int col, int len, String string) {
		char[][] mat = new char[row][col];
		int c = 0; 
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
				mat[j][i]=getChar(string, c++,len);
				changeCol = 1;
			}
			if (changeCol == 1)
				i--;
			else
				break;

			for (j = b + 1; j < rowP; j++) {
				mat[j][i]=getChar(string, c++,len);
				changeRow = 1;
			}
			if (changeRow == 1)
				j--;
			else
				break;

			changeRow = 0;
			changeCol = 0;
			for (i = i - 1; i >= a; i--) {
				mat[j][i]=getChar(string, c++,len);
				changeCol = 1;
			}
			if (changeCol == 1)
				i++;
			else
				break;

			for (j = j - 1; j > b; j--) {
				mat[j][i]=getChar(string, c++,len);
				changeRow = 1;
			}
			if (changeRow == 1)
				j++;
			else
				break;

		} while (a < rowP / 2 && b < colP / 2);
		
		for (int ii = 0; ii < row; ii++) {
			for (int jj = 0; jj < col; jj++) {
				System.out.print(mat[ii][jj]);
			}
			System.out.println();
		}
	}
	public static char getChar(String str,int c,int len) {
		c=c%str.length();
		return str.charAt(c);
	}
	
}
/* paste it in console for input
2
4 8 6
abcdef
2 4 3
abc
*/