import java.util.*;
class node {
	int data;
	node next;
}
public class queuedemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedlist queue = new linkedlist();
		while (true) {
			System.out.println("************ menu **************");
			System.out.println("0. Exit");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("make your selection");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("bye bye ! !");
				System.exit(0);
			case 1:
				System.out.println("enter data");
				int d = sc.nextInt();
				queue.insert(d);
				break;
			case 2:
				queue.delete();
				break;
			case 3:
				queue.display();
				break;
			default:
				System.out.println("wrong choice");
			}
		}
	}
}

class linkedlist {
	node first = new node();
	public void insert(int d) {
		node queue = first;
		while (queue.next != null) {
			queue = queue.next;
		}
		node temp = new node();
		temp.data = d;
		queue.next = temp;
		System.out.println("successfully inserted at last");
	}
	public void delete () {
		first = first.next;
		System.out.println("successfull deleted the first element");
	}
	public void display() {
		System.out.println("elements in the queue are :");
		node temp = first;
		do {
			temp = temp.next;
			System.out.println(temp.data);
		} while (temp.next != null);
	}
}
