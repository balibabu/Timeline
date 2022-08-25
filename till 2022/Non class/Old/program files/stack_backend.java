package classwork;

public class stack_backend {
	int max=5;
	int size=0;
	Node top;
	Node aux;
	public void push(int n) {
		if(max>size) {
			Node temp=new Node(n);
			temp.next=top;
			top=temp;
			size++;
			System.out.println(n+" pushed in");
			if(n>maxValue()) {
				Node temp2=new Node(n);
				temp2.next=aux;
				aux=temp2;
			}else {
				Node temp2=new Node(maxValue());
				temp2.next=aux;
				aux=temp2;
			}
		}else {
			System.out.println(n+" not pushed: stack overflow");
		}
	}
	public int pop() {
		if(size>0) {
			aux=aux.next;
			size--;
			int n=top.data;
			top=top.next;
			return n;
		}else {
			System.out.println("stack is empty");
			return 0;
		}
		
	}
	public void show() {
		Node current=top;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public boolean isempty() {
		if(size>0) {
			return false;
		}
		return true;
	}
	public int peak() {
		return top.data;
	}
	public int maxValue() {
		if(size>0) {
			int max=top.data;
			Node temp=top;
			while(temp!=null) {
				if(temp.data>max)
					max=temp.data;
				temp=temp.next;
			}
			return max;
		}else {
			System.out.println("stack is empty");
			return Integer.MIN_VALUE;
		}
		
	}
	public void auxuliary() {
		Node current=aux;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
}
