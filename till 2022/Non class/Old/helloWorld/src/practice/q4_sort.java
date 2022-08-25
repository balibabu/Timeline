package practice;

public class q4_sort {

	public static void main(String[] args) {
		String[] s={"apple","ball","cat","dolphin","elephant"};
		String[] sorted=sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(sorted[i]);
		}
	}

	public static String[] sort(String[] s) {
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()>s[j].length()) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
					
			}
		}
		return s;
	}
}
