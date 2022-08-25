import java.util.*;
class complex {
	Scanner sc=new Scanner(System.in);
	double real,imag;
	
	void setdata(){
		System.out.println("enter the real part ");
		real=sc.nextDouble();
		System.out.println("enter the imaginary part ");
		imag=sc.nextDouble();
		
	}
void display(){
		System.out.println("the real part is "+real);
		System.out.println("the imaginary part is "+imag);
	}
	public complex add(complex n1,complex n2){
		complex sum=new complex();
		 sum.real=n1.real+n2.real;
		 sum.imag=n1.imag+n2.imag;
		 return (sum);
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex n1=new complex();
		complex n2=new complex();
		complex sum=new complex();
		n1.setdata();
		n2.setdata();
		sum=sum.add(n1, n2);
		sum.display();
	}

}
