package classwork;

public class queue_max_api {

	public static void main(String[] args) {
		queue_backend q1=new queue_backend();
		q1.enqueue(3);
		q1.enqueue(2);
		q1.enqueue(1);
		q1.enqueue(4);
		q1.enqueue(5);
		queue_backend q2=new queue_backend();
		q2=get_queue_max(q1);
		q2.show();
	}
	
	public static queue_backend get_queue_max(queue_backend q1) {
		queue_backend q2=new queue_backend();
		int temp=q1.dequeue();
		q2.enqueue(temp);
		while(!q1.isEmpty()) {
			int temp2=q1.dequeue();
			if(temp2>temp) {
				temp=temp2;
			}
			q2.enqueue(temp);
		}
		
		return q2;
	}
	

}
 