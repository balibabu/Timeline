package cw;

import java.text.ChoiceFormat;

public class plural_using_cf {

	public static void main(String[] args) {
		double[] d= {0,1,2,3};
		String[] plurals= {"books","book","books","bookes"};
		ChoiceFormat cf=new ChoiceFormat(d,plurals);
		int[] data= {-2,-1,0,1,2,3,4};
		for(int i:data)
			System.out.println("i am reading "+i+" "+cf.format(i));

	}

}
