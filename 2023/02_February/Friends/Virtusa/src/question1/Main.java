package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String stallName=sc.nextLine();
			String details=sc.nextLine(); 
			double stallArea=sc.nextDouble();
			sc.nextLine();
			String owner=sc.nextLine();
			Thread thread=new Thread(new Stall(stallName,details,stallArea,owner));
			thread.run();
		}
	}
	

}

