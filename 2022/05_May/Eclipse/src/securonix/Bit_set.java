package securonix;

import java.util.BitSet;

public class Bit_set {

	public static void main(String[] args) {
		
		BitSet obj=new BitSet(3);
		for(int i=0;i<3;++i) {
			obj.set(i);
			System.out.println(obj);
		}
		obj.clear(2);
		System.out.println(obj);
		
	}
}