package classwork;

public class stack_frontend {

	public static void main(String[] args) {
		stack_backend obj=new stack_backend();
		System.out.println("is stack empty: "+obj.isempty());
		obj.push(1);
		obj.push(6);
		obj.push(2);
		obj.push(3);
		obj.push(9);
		obj.push(8);
		obj.show();
/*		System.out.println(obj.pop()+" popped out");
		obj.show();
		System.out.println("is stack empty: "+obj.isempty());
		System.out.println("max value "+obj.maxValue());
		System.out.println("peak value is "+obj.peak()); 	*/
		obj.auxuliary();
	}

}
