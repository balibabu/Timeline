import java.util.*;

class pointype {
	Scanner sc=new Scanner(System.in);
	double x;
	double y;
	void get_point(){
		System.out.println("enter point x,y");
		x=sc.nextDouble();
		y=sc.nextDouble();
	}
	void display_point(){
		System.out.println("center of circle is ("+x+","+y+")");
	}
}
class circletype extends pointype {
	double r;
	void get_radius(){
		System.out.println("enter radius of circle");
		r=sc.nextDouble();
	}
	void display(){
		System.out.println("area of circle is "+(22/7*r*r));
		System.out.println("circumference of circle is "+2*22/7*r);
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circletype c=new circletype();
		c.get_point();
		c.get_radius();
		c.display_point();
		c.display();
	}

}
