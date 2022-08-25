package classwork;

public class circular_queue {

	public static void main(String[] args) {
		queue obj=new queue();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		System.out.println("size of queue is "+obj.getSize());

		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		obj.dequeue();
		obj.enqueue(9);
		obj.display();
	}

}

class queue{
	int capacity=8;
	int[] array=new int[capacity];
	int head=0,tail=0;
	int size=0;
	public int getSize() {
		return size;
	}
	public void enqueue(int n) {
		if(size<capacity) {
			System.out.println(n+" enqueued");
			array[tail]=n;
			tail++;
			tail%=capacity;
			head%=capacity;
			size++;
		}else {
			System.out.println("queue is full");
		}
	}
	public void display() {
		if(head<tail) {
			for(int i=head;i<tail;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}else {
			for(int i=head;i<capacity+tail;i++) {
				System.out.print(array[i%capacity]+" ");
			}
			System.out.println();
		}

	}
	public void dequeue() {
		System.out.println(array[head]+" dequeued");
		head=(head+1)%capacity;
		size--;
	}
}
