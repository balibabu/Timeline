package assignment6;
import java.util.*;
public class nof_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s5=sc.next().toLowerCase();
		int counter=0;
		for(int i=0;i<s5.length();i++) {
			switch(s5.charAt(i))
			{
			case 'a':
				counter+=1;
				break;
			case 'e':
				counter+=1;
				break;
			case 'i':
				counter+=1;
				break;
			case 'o':
				counter+=1;
				break;
			case 'u':
				counter+=1;
				break;
				
			}				
		}
		System.out.println("no. of vowels is "+counter);
	}

}
