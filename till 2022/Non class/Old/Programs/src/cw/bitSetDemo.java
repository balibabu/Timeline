package cw;

import java.util.BitSet;

public class bitSetDemo {

	public static void main(String[] args) {
		String weeks[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		for(int i=0;i<weeks.length;i++) {
			System.out.println(weeks[i]);
		}
		BitSet b=new BitSet();
		b.set(1);
		b.set(4);
		for(int i=0;i<weeks.length;i++) {
			if(b.get(i))
				System.out.println(weeks[i]);
		}
	}

}
