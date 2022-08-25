import java.util.*;
public class DLinkedList {
	node head;
	node tail;
	Scanner sc = new Scanner(System.in);
	public void create() {
		node list = new node();
		System.out.println("enter redg_no and mark");
		list.redg_no = sc.nextInt();
		list.mark = sc.nextFloat();
		head = list;
		System.out.println("do you want to add more y/n");
		char a = sc.next().charAt(0);
		while (a == 'y') {
			node temp = new node();
			System.out.println("enter redg_no and mark");
			temp.redg_no = sc.nextInt();
			temp.mark = sc.nextFloat();
			list.next = temp;
			temp.prev = list;
			list = temp;
			System.out.println("do you want to add more y/n");
			a = sc.next().charAt(0);
		}
		tail = list;
	}
	public void display() {
		node temp = head;
		do {
			System.out.println("redg_no:" + temp.redg_no + "\t" + "mark=" + temp.mark);
			temp = temp.next;
		} while (temp != null);
	}

	public void insBeg(int r, float m) {
		node temp = new node();
		temp.redg_no = r;
		temp.mark = m;
		temp.next = head;
		head.prev = temp;
		head = temp;
	}
	public void insEnd(int r, float m) {
		node temp = new node();
		temp.redg_no = r;
		temp.mark = m;
		tail.next = temp;
		temp.prev = tail;
		tail = temp;
	}
	public void insAny(int r, float m, int k) {
		try {
			if (k == 1) {
				insBeg(r, m);
			} else {
				int c = 1;
				node temp = head;
				for (int i = 1; i < k; i++) {
					temp = temp.next;
				}
				node n = new node();
				n.redg_no = r;
				n.mark = m;
				n.prev = temp;
				n.next = temp.next;
				temp.next = n;
			}
		} catch (Exception e) {
			System.out.println("invalid position \ninserting at end");
			insEnd(r, m);
		}
	}

	public void delBeg() {
		head = head.next;
		head.prev = null;
	}
	public void delEnd() {
		tail = tail.prev;
		tail.next = null;
	}
	public void delAny(int a) {
		try {
			if (a == 1) {
				delBeg();
			} else {
				node temp = head;
				for (int i = 1; i < a - 1; i++) {
					temp = temp.next;
				}
				node n = temp.next;
				temp.next = n.next;
				n = n.next;
				n.prev = temp;
			}
		} catch (Exception e) {
			delEnd();
		}
	}
	
	public void search(int r){
		node temp=head;
		do{
			if(r==temp.redg_no){
				System.out.println("enter new mark to update");
				temp.mark=sc.nextFloat();
				return;
			}
			temp=temp.next;
		}while(temp!=null);
		System.out.println("there is no such registration number");
	}
}