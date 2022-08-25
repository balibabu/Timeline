package assignment2;
/*Name: Bali Babu Chauhan
 *Redg no.: 19410121182
 *Branch: CSE-M
 */
import java.util.*;
public class Bankapp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bankarray icic=new Bankarray();
		icic.create();
		while(true) {
			System.out.println("\nchoose an option\n1.Insert 2.Search 3.Operate 4.Display_all_accounts 5.Exit");
			int chk=sc.nextInt();
			switch (chk) {
			case 1:
				icic.create();
				break;
			case 2:
				icic.search();
				break;
			case 3:
				icic.operate();
				break;
			case 4:
				icic.display();
				break;
			default:
				System.exit(1);
			}
		}
	}

}
