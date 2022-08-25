package classwork;

public class queue_backend {
	node first;
	node last;
	int size=0;
	public void enqueue(int data) {
		if(size==0) {
			first=new node(data);
			last=first;
		}else {
			node temp=new node(data);
			last.next=temp;
			last=temp;
		}
		size++;
	}
	public int dequeue() {
		if(size>0) {
			int temp=first.data;
			first=first.next;
			size--;
			return temp;
		}
		System.out.println("queue is empty");
		return -1;
	}
	public void show() {
		node temp=first;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public boolean isEmpty() {
		if(size>0) {
			return false;
		}
		return true;
	}
}
