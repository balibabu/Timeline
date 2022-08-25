package sll;

public class sll_nums {

	public static void main(String[] args) {
		SLinkedList arr=new SLinkedList();
		arr.add(1);
		arr.add(7);
		arr.add(3);
		arr.add(6);
		arr.add(4);
		arr.add(2);
		System.out.println("linkedlist before pivot");
		arr.show();
		//System.out.println();
		//arr.deleteDuplicates();
		//arr.show();
		//System.out.println(arr.isPalindrome());
		arr.MakePivot(4);
		System.out.println("linkedlist after pivot");

		arr.show();
		
		
		
		
		//arr.createloop();
		//System.out.println(arr.containsLoop());
		//arr.deleteFirstNode();
		//arr.show();
		//arr.deleteAt(2);
		
		//arr.show();
		//arr.deleteLastNode();
		//arr.show();
		//System.out.println(arr.size);
		//arr.deleteKthLastNode(2);
		//arr.show();
	}
	

}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
class SLinkedList {
	Node head;
	int size;
	
	public void add(int data) {
		size++;
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=temp;
		}
		
	}
	public void show() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public Node reverse(Node h) {
		Node current=h;
		Node nxt=current.next;
		Node prev=current;
		prev.next=null;
		while(nxt.next!=null) {
			current=nxt;
			nxt=nxt.next;
			current.next=prev;
			prev=current;
		}
		current=nxt;
		current.next=prev;
		prev=current;
		
		return nxt;
	}
	public void createloop() {
		Node current=head;
		current=current.next;
		current=current.next;
		Node current2=head;
		while(current2.next!=null) {
			current2=current2.next;
		}
		current2.next=current;
		
	}
	public boolean containsLoop() {
		Node slow=head;
		Node fast=head;
		while(true) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow.next==null || fast.next==null) {
				return false;
			}else if(slow==fast) {
				return true;
			}
		}
	}
	public void deleteFirstNode() {
		size--;
		if(head!=null) {
			System.out.println(head.data+" deleted");
			head=head.next;
		}else {
			System.out.println("empty linkedlist");
		}
		
	}
	public void deleteLastNode() {
		size--;
		Node current=head;
		while(current.next.next!=null) {
			current=current.next;
		}
		System.out.println(current.next.data+" deleted");
		current.next=null;
	}
	public void deleteAt(int pos) {
		if(pos==0) {
			deleteFirstNode();
			return;
		}else {
			size--;
			int c=1;
			Node current=head;
			while(current.next!=null) {
				if(pos==c) {
					System.out.println(current.next.data+" deleted");
					current.next=current.next.next;
					break;
				}
				current=current.next;
				c++;
			}
		}
	}
	public void deleteKthLastNode(int n) {
		if(n==1) {
			deleteLastNode();
			return;
		}else {
			Node slow=head;
			Node fast=head;
			for(int i=0;i<n;i++) {
				fast=fast.next;
			}
			while(fast.next!=null) {
				fast=fast.next;
				slow=slow.next;
			}
			System.out.println(slow.next.data+" deleted");
			slow.next=slow.next.next;
		}
	}
	public void deleteDuplicates() {
		Node distinct=head;
		Node current=head;
		while(current!=null) {
			current=current.next;
			while(current!=null) {
				if(distinct.data!=current.data) {
					break;
				}
				current=current.next;
				
			}
			
			distinct.next=current;
			distinct=distinct.next;
		}
	}
	public boolean isPalindrome() {
		Node slow=head;
		Node fast=head;
		Node normal=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}

		Node rev=reverse(slow);
		while(rev!=null) {
			if(rev.data!=normal.data)
				return false;
			rev=rev.next;
			normal=normal.next;
		}
		
		return true;
	}
	public void MakePivot(int p) {
		System.out.println("pivot = "+p);
		Node temp=head;
		Node temp2=new Node(p);
		Node back=temp2;
		Node forward=temp2;
		while(temp!=null) {
			if(temp.data<p) {
				Node newnode=new Node(temp.data);
				newnode.next=back;
				back=newnode;
			}else if(temp.data>p) {
				Node newnode=new Node(temp.data);
				forward.next=newnode;
				forward=newnode;
			}
			
			temp=temp.next;
		}
		head=back;
	}
} 

