package practice;

public class q10_replace_word {

	public static void main(String[] args) {
		String doc="to be or not to be, that is the question";
		System.out.println(doc);
		StringBuilder document=new StringBuilder(doc);
		String target="be";
		String replacement="see";
		document=replace(document,target,replacement);
		System.out.println(document);
	}

	public static StringBuilder replace(StringBuilder d,String t,String r) {
		int l1=d.length();
		int l2=t.length();
		try {
			for(int i=0;i<d.length();i++) {
				if(d.substring(i, i+l2).equalsIgnoreCase(t)) {
					d.replace(i, i+l2,r);
				}
			}
		}catch(Exception  e) {
			
		}
		return d;
	}
}
