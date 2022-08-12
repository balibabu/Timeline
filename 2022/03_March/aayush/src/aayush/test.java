package aayush;
import java.util.Random;
public class test {
	public static void main(String[] args) {
		String[] deck=new String[52];
		initDeck(deck);
		System.out.println("Original Deck:");
		printDeck(deck);
		
		String[] sfdeck=shuffleDeck(deck);
		System.out.println("Shuffled Deck:");
		printDeck(sfdeck);
		
		System.out.println("Drawing Cards...");
		while(!isEmpty(sfdeck)) {
			System.out.println(draw(sfdeck));
		}
		
		System.out.println("Original Deck:");
		printDeck(deck);
		
		System.out.println("is Original Deck Empty:");
		System.out.println(isEmpty(deck));
		
		System.out.println("is Shuffled Deck Empty:");
		System.out.println(isEmpty(sfdeck));
		
	}
	
	public static void initDeck(String[] deck) {
		char[] set={'H','C','D','S'};
		int pos=0;
		for(char x:set) {
			deck[pos++]="A"+x;
			for(int i=2;i<=10;i++) {
				deck[pos++]=""+i+x;
			}
			deck[pos++]="J"+x;
			deck[pos++]="Q"+x;
			deck[pos++]="K"+x;
		}
	}
	
	public static String[] shuffleDeck(String[] deck) {
		String[] sfdeck=new String[52];
		System.arraycopy(deck, 0, sfdeck, 0, 52);
		Random r=new Random();
		for(int i=0;i<1000;i++) {
			int x1=r.nextInt(52);
			int x2=r.nextInt(52);
			String temp=sfdeck[x1];
			sfdeck[x1]=sfdeck[x2];
			sfdeck[x2]=temp;
		}
		return sfdeck;
	}
	
	public static String draw(String[] deck) {
		if(isEmpty(deck))
			return "no cards";
		for(int i=0;i<52;i++) {
			if(deck[i]!="-") {
				String temp=deck[i];
				deck[i]="-";
				return temp;
			}
		}
		return "no cards";
	}
	
	public static boolean isEmpty(String[] deck) {
		int c=0;
		for(String x: deck) {
			if(x=="-")
				c++;
		}
		if(c==52)
			return true;
		return false;
	}
	
	public static void printDeck(String[] deck) {
		for(int i=0;i<52;i++) {
			System.out.print(deck[i]+" ");
			if((i+1)%13==0)
				System.out.println();
		}
		System.out.println();
	}
}
