package thinking;

import java.util.Scanner;

public class stringR {

	public static void main(String[] args) {
		System.out.println("program is runnning");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<3;i++) {
			String s=sc.nextLine();
			System.out.println(i+" "+s);
		}
		System.out.println("Execution completed....");
	}

}
// there was confusion related to taking string line by line