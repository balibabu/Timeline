package classwork;

import java.util.Stack;

public class eval_stack {

	public static void main(String[] args) {
		String s="3,4,+,2,*,1,+";
		//String s="";
		
		String[] symbol=s.split(",");
		Stack<Integer> obj=new Stack<>();
		for(String str:symbol) {
			char c=str.charAt(0);
			switch(c) {
			case '+':
				int sum=obj.pop()+obj.pop();
				obj.push(sum);
				break;
			case '-':
				int diff=obj.pop()-obj.pop();
				obj.push(diff);
				break;
			case '*':
				int product=obj.pop()*obj.pop();
				obj.push(product);
				break;
			default:
				obj.push(Integer.valueOf(str));
				break;
			}
		}
		System.out.println(obj.pop());
		
		
	}

}
