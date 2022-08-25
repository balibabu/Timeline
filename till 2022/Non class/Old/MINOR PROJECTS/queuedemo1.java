import java.util.*;
public class queuedemo1 {
	public static final int max = 5;
	public static int[] queue = new int[max];
	public static int last = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("***** menu *****");
			System.out.println("0. Exit");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. is_Full");
			System.out.println("5. is_Empty");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thanks for using\nBye Bye ! !! !!!");
				System.exit(0);
			case 1:
				if (last == max - 1) {
					System.out.println("sorry ! ! queue is full");
				} else {
					System.out.println("enter data");
					int data = sc.nextInt();
					insert(data);
				}
				break;
			case 2:
				delete ();
				break;
			case 3:
				display();
				break;
			case 4:
				is_Full();
				break;
			case 5:
				is_Empty();
				break;
			default:
				System.out.println("wrong choices");
			}
		}
	}
	public static void insert(int data) {
		last++;
		queue[last] = data;
		System.out.println("successfully ! ! inserted at last ! !");
	}
	public static void delete () {
		if (last == -1) {
			System.out.println("sorry ! ! queue is already empty");
		} else {
			System.out.println(queue[0] + " is deleted");
			for (int i = 0; i < last; i++) {
				queue[i] = queue[i + 1];
			}
			queue[last] = 0;
			last--;
		}
	}
	public static void display() {
		System.out.println("elements in queue are :");
		for (int i = 0; i <= last; i++) {
			System.out.println(queue[i]);
		}
	}
	public static void is_Full() {
		if (last == max - 1) {
			System.out.println("yes, queue is full");
		} else {
			System.out.println("no, queue is not full");
		}
	}
	public static void is_Empty() {
		if (last == -1) {
			System.out.println("yes, queue is empty");
		} else {
			System.out.println("no, queue is not empty");
		}
	}
}