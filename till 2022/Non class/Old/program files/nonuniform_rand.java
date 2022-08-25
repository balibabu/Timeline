package chapter_2;

public class nonuniform_rand {
	public static void main(String[] args) {
		int[] numbers= {3,5,7,11};
		double[] probabilities= {0.5,0.333,0.111,0.0555};
		double test=Math.random();
		double prob=0;
		for(int i=0;i<probabilities.length;i++) {
			prob+=probabilities[i];
			
			if(test<prob) {
				System.out.println(numbers[i]);
				break;
			}
		}
		System.out.println("done");
	}
}
