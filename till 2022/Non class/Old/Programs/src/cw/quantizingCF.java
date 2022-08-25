package cw;

import java.text.ChoiceFormat;
import java.util.Scanner;

public class quantizingCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ChoiceFormat cf=new ChoiceFormat("0#mangoes|1#mango|2#mangoes|2<many mangoes");
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println(cf.format(num));
	}

}
