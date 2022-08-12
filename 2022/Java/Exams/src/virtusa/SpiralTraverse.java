package virtusa;

import java.util.ArrayList;

public class SpiralTraverse {
	public static void main(String[] args) {
		 int[][] grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		System.out.println(spiralIterate(grid));
		System.out.println();
//		int[][] arr= {{1,2,3,4,5},{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35}};
//		int[][] arr= {{1,2,3}};
//		int[][] arr= {{1},{2},{3}};
		int[][] arr= {{1}};
		spiralTravel(grid);
	}

	static ArrayList<Integer> spiralIterate(int[][] grid) {
		int size = grid.length;
		ArrayList<Integer> list = new ArrayList<>();
		int rowHigh = size - 1;
		int colHigh = size - 1;
		int rowLow = 0;
		int colLow = 0;

		while (rowLow <= rowHigh) {
			for (int i = colLow; i < colHigh; i++) {
				list.add(grid[rowLow][i]);
			}
			for (int i = rowLow; i < rowHigh; i++) {
				list.add(grid[i][colHigh]);
			}
			for (int i = colHigh; i > colLow; i--) {
				list.add(grid[rowHigh][i]);
			}
			for (int i = rowHigh; i > rowLow; i--) {
				list.add(grid[i][colLow]);
			}
			rowLow += 1;
			colLow += 1;
			rowHigh -= 1;
			colHigh -= 1;
		}
		return list;
	}

	public static void spiralTravel(int[][] mat) {
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