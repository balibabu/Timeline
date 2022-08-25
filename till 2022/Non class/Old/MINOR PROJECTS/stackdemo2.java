import java.util.*;
class Node {
	int data;
	Node prev;
}


public class stackdemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedlist stack = new linkedlist();
		while (true) {
			System.out.println("\n===========|| menu ||==========");
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. isEmpty");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Bye ! Thanks For Using !");
				System.exit(0);
			case 1:
				System.out.println("enter data");
				int a = sc.nextInt();
				stack.push(a);
				break;
			case 2:
				System.out.println();
				stack.pop();
				break;
			case 3:
				System.out.println();
				stack.display();
				break;
			case 4:
				stack.isEmpty();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}


class linkedlist {
	Node top;
	public void push(int a) {
		Node temp = new Node();
		temp.data = a;
		temp.prev = top;
		top = temp;
	}
	public void pop() {
		if (top == null) {
			System.out.println("stack is empty");
		} else {
			System.out.println(top.data);
			top = top.prev;
		}
	}
	public void display() {
		if (top == null) {
			System.out.println("stack is empty");
		} else {
			System.out.println("data in stack are:");
			Node temp = top;
			do {
				System.out.println(temp.data);
				temp = temp.prev;
			} while (temp != null);
		}
	}
	public void isEmpty() {
		if (top == null) {
			System.out.println("yes, stack is empty");
		} else {
			System.out.println("no, stack is not empty");
		}
	}
}