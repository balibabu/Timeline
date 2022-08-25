package ClassWork;

public class travel_spiral {

	public static void main(String[] args) {
		int[][] array= {
				{11,26,25,24},
				{12,27,34,23},
				{13,28,33,22},
				{14,29,32,21},
				{15,30,31,20},
				{16,17,18,19}
		};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int layer=0;
		while(layer!=((array.length)/2)) {
			int i=layer,j=layer;
			for(i=layer;i<array.length-layer;i++) {
				System.out.print(array[i][j]+" ");
			}
			i--;
			for(j=layer+1;j<array[i].length-layer;j++) {
				System.out.print(array[i][j]+" ");
			}
			i--;j--;
			for(i=i;i>=layer;i--) {
				System.out.print(array[i][j]+" ");
			}
			i++;
			for(j=j-1;j>layer;j--) {
				System.out.print(array[i][j]+" ");
			}
			
			layer++;
		}
	}

}
