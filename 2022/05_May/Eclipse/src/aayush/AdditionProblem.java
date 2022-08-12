package aayush;

public class AdditionProblem {
	private int a,b;
	
	public AdditionProblem(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int answer() {
		return a+b;
	}
	
	public String toString() {
		return ""+a+"+"+b;
	}
}
