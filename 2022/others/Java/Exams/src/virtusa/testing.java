package virtusa;
//import java.util.Scanner;


public class testing {
	private static int i=0;
	private static int j=0;
	public static void main(String[] args) {
		System.out.println("program started");
		
		
		String s="Java";
		System.out.println(s.charAt(s.toUpperCase().length()));
		
		
		
		
		
		
		
		
		
//		String s1="cat";
//		String s2="cat";
//		String s3=new String("cat");
//		if(s1==s2) {
//			System.out.println(true);
//		}
//		if(s1==s3) {
//			System.out.println(true);
//		}else {
//			System.out.println("false");
//		}
//		
//		
		
		
		
		
//		int i=3;
//		int k=4;
//		
//		{
//			int j=2;
//			System.out.println("i+j is "+i+j);
//		}
//		
//		k=i+j;
//		System.out.println(k);
//		System.out.println(j);
//		
//		
//		System.out.println((int)'2');
//		System.out.println(Answer.submit("subject"));
//		String s="java"+1+2+"quiz"+""+(3+4);
//		System.out.println(s);
//		for(int i=0;i<10;i++) {
//			System.out.println(getChar("abcdef", i));
//		}
//		int[] mat= {1,2,3};
//		System.out.println(sum(mat));
//		Scanner sc=new Scanner(System.in);
//		char ch1=sc.next().charAt(0);
		
//		System.out.println(diff('e','c'));
//		System.out.println(diff('a','a'));
////		System.out.println((int)'a');
//		nextChar('x', -1);
		
		
//		String s=sc.nextLine();
//		String s2=sc.nextLine();
//		String[] arr1=s.split(" ");
//		String[] arr2=s2.split(" ");
//		System.out.println(arr1[0]);
//		for(String str:arr1) {
//			int a=Integer.parseInt(str);
//			System.out.println(a);
//		}
//		System.out.println(s);
//		System.out.println(s2);
		
//		
//		int[] mat=new int[0];
//		System.out.println(mat.length);
//		String s;
//		try {
//			s=sc.nextLine();
//		}catch(Exception e) {
//			s="";
//		}
//		String s="";
//		
//		System.out.println(s.length());
		
		
		System.out.println("Program ended...");
	}
//	public static int sum(int[] matrix) {
//		int s=0;
//		for(int i=0;i<matrix.length;i++) {
//			s+=matrix[i];
//		}
//		return s;
//	}
//	public static int diff(char ch1,char ch2) {
//		if(ch1==ch2) {
//			return -1;
//		}
//		int c1=ch1-96;
//		int c2=ch2-96;
//		System.out.println(c1);
//		System.out.println(c2);
//		if(c1<c2) {
//			return c2-c1-1;
//		}
//		return (26-c1)+c2-1;
//	}
//	public static void nextChar(char ch,int d) {
//		
//		int c=ch-97;
//		c+=d+1;
//		if(c>=26) {
//			c-=26;
//		}
//		System.out.println(c);
//		System.out.println((char)(c+97));
//	}
//	public static char getChar(String str,int c) {
//		c=c%str.length();
//		return str.charAt(c);
//	}
}

//class Answer{
//	static String answer="java";
//	static String submit(String que) {
//		return que+" is "+answer;
//	}
//}