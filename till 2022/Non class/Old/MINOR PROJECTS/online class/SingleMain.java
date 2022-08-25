import java.util.Scanner;

public class SingleMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		SingleLinkedList ob=new SingleLinkedList();
		ob.create();
		ob.display();
		while(true)
		{
			System.out.println("0: Quit");
			System.out.println("1: Display");
			System.out.println("2: Search");
			System.out.println("3: InsBeg");
			System.out.println("4: InsEnd");
			System.out.println("5: InsLoc");
			System.out.println("6: DelBeg");
			System.out.println("7: DelEnd");
			System.out.println("9: Revrse");
			System.out.println("10: Sort ");
			System.out.println("11: Merge");
			System.out.println("Input your choice ");
			
			int op=sc.nextInt();
			switch(op)
			{
				case 0: return;
				case 1: ob.display();	break;
				case 2: System.out.println("Input ele to search");
						int ele=sc.nextInt();
						int pos=ob.search(ele);
						if(pos==-1)
							System.out.println("Not found");
						else
							System.out.println("Found at position"+pos);
						break;
				case 3: ob.insBeg();	break;
				case 4: ob.insEnd();	break;
				case 5: ob.insLoc();	break;
				case 6: ob.delBeg();	break;
				case 7: ob.delEnd();	break;
				case 9: ob.reverse();	break;
				case 10:ob.sort();		break;
			}
		}

	}

}
