package cw;

public class number_demo {

	public static void main(String[] args) {
		System.out.println("Byte");
		Byte b1=new Byte((byte)10);//constructor 1:built_in type
		Byte b2=new Byte("10");//constructor 2: string
		System.out.println(b1);
		System.out.println(b2);
		
		
		System.out.println("Float");
		Float f1=new Float(10.2f);//constructor 1:built_in type
		Float f2=new Float("10.5");//constructor 2: string
		Float f3=new Float(10.6d);//constructor 3: double
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		System.out.println("Short");
		Short s1=new Short((short)10);//constructor 1:built_in type
		Short s2=new Short("15");//constructor 2: string
		System.out.println(s1);
		System.out.println(s2);
	}

}
