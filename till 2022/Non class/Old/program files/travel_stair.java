package ClassWork;

public class travel_stair {

	public static void main(String[] args) {
		int[][] array= {
				{11,12,13,14},
				{20,19,18,17,16,15},
				{21,22,23,24},
				{26,25},
				{27,28,29,30}
		};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			i+=1;
			if(i!=array.length) {
				for(int j=array[i].length-1;j>=0;j--) {
					System.out.print(array[i][j]+" ");
				}
			}
		}

	}

}

