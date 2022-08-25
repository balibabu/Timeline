package assignment3;
import java.util.Scanner;
public class cse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		section m=new section();
		System.out.println("Choose an option");
		while(true) {
			System.out.println("1.Insert  2.Display  \n3.Students with highest and lowest marks  4.exit");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				m.insert();
				break;
			case 2:
				System.out.println("enter roll number");
				int r=sc.nextInt();
				m.display(r);
				break;
			case 3:
				m.highLow();
				break;
			default:
				System.exit(1);
			}
		}
	}

}
