package aayush;

public class Main {

	public static void main(String[] args) {
		
		C c = new C();

	}

}


class A {
	A(){
		 System.out.println("Constructing A...");
		 message();
	}
	 
	 public void message(){
		 System.out.println("A says hi.");
	}
}

class B extends A {
	 
	 @Override
	 public void message(){
		 super.message();
		 System.out.println(" ...B also says hi.");
	 }
}

class C extends B {
	C(){
		this("C says hi.");
	}
 
	 C(String myMessage){
		 System.out.println("Constructing C... " + myMessage);
	 }
}