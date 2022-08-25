package chapter_1;

public class lookup_table {

	public static void main(String[] args) {
		int a=6;
		int[] lookupTable=new int[a+1];
		for(int i=0;i<=a;i++) {
			lookupTable[i]=getBits(i);
		}
		
		for(int i=0;i<=a;i++) {
			System.out.println(i+" --> "+lookupTable[i]);
		}
		
	}
	
	public static int getBits(int n) {
		int c=0;
		while(n>0) {
			if((n&1)==1) {
				c++;
			}
			n>>=1;
		}
		return c;
	}

}
