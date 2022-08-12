package aayush;

public class ComplexAdditionProblem extends AdditionProblem {
	private int c;
	public ComplexAdditionProblem() {
		this(33,33,33);
	}
	
	public ComplexAdditionProblem(int a, int b, int c) {
		super(b,c);
		this.c=a;
	}
	
	@Override
	public int answer() {
		
		return super.answer()+c;
	}
	
	public String showIntermediateStep() {
		return "==> "+c+"+"+super.answer()+"="+answer();
	}
	
	public String toString() {	
		return ""+c+"+"+super.toString();
	}
	


}
