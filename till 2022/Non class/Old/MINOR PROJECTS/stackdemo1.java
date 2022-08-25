import java.util.*;
class stackdemo1 {
	public static final int max = 10;
	static int top = -1;
	static int[] stack = new int[max];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n===========|| menu ||==========");
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. isEmpty");
			System.out.println("5. isFull");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Bye ! Thanks For Using !");
				System.exit(0);
			case 1:
				if (top == max - 1) {
					System.out.println("**********  stack is full  *********");
				} else {
					System.out.println("enter a data");
					int data = sc.nextInt();
					push(data);
				}
				break;
			case 2:
				if (top == -1) {
					System.out.println("*********  stack is empty  *******");
				} else {
					pop();
				}
				break;
			case 3:
				if (top == - 1) {
					System.out.println("********  stack is empty  *******");
				} else {
					display();
				}
				break;
			case 4:
				if (top == -1) {
					System.out.println("stack is empty");
				} else {
					System.out.println("stack is not empty");
				}
				break;
			case 5:
				if (top == max - 1) {
					System.out.println("stack is full");
				} else {
					System.out.println("stack is not full");
				}
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
	public static void push(int data) {
		top++;
		stack[top] = data;
	}
	public static void pop() {
		System.out.println(stack[top]);
		top--;
	}
	public static void display() {
		int t = top;
		System.out.println("your data in stack are");
		while (t >= 0) {
			System.out.println(stack[t]);
			t--;
		}
	}
}