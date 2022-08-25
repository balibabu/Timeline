import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		DLinkedList record = new DLinkedList();
		record.create();
		while (true) {
			System.out.println("\n0.InsBeg");
			System.out.println("1.InsEnd");
			System.out.println("2.InsAny");
			System.out.println("3.DelBeg");
			System.out.println("4.DelEnd");
			System.out.println("5.DelAny");
			System.out.println("6.Search redg_no and update mark");
			System.out.println("7.Display");
			System.out.println("8.Exit");
			System.out.println("enter you choice");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				System.out.println("enter redg_no and mark");
				int i = sc.nextInt();
				float j = sc.nextFloat();
				record.insBeg(i, j);
				System.out.println(".....inserted");
				break;
			case 1:
				System.out.println("enter redg_no and mark");
				i = sc.nextInt();
				j = sc.nextFloat();
				record.insEnd(i, j);
				System.out.println(".....inserted");
				break;
			case 2:
				System.out.println("enter redg_no and mark");
				i = sc.nextInt();
				j = sc.nextFloat();
				System.out.println("enter position like 1,2,3...");
				int k = sc.nextInt();
				record.insAny(i, j, k);
				System.out.println(".....inserted");
				break;
			case 3:
				record.delBeg();
				System.out.println(".....deleted");
				break;
			case 4:
				record.delEnd();
				System.out.println(".....deleted");
				break;
			case 5:
				System.out.println("enter position like 1,2,3...");
				k = sc.nextInt();
				record.delAny(k);
				System.out.println(".....deleted");
				break;
			case 6:
				System.out.println("enter redg_no");
				i = sc.nextInt();
				record.search(i);
				break;
			case 7:
				record.display();
				break;
			case 8:
				System.out.println("Thank You  For Using\nsee you soon, Bye ! ! !");
				System.exit(0);
			default:
				System.out.println("wrong choice");
			}
		}
	}
}