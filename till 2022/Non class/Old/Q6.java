abstract class shape {
	abstract void getdata();
	abstract void display();
}

class square extends shape {
	int length;
	void getdata(){
		length=5;
	}
	void display(){
		System.out.println("area of square is "+length*length);
	}
}

class triangle extends shape {
	int base,height;
	void getdata(){
		base=4;
		height=7;
	}
	void display(){
		System.out.println("area of triangle is "+(0.5*base*height));
	}
}

class circle extends shape {
	int radius;
	void getdata(){
		radius=7;
	}
	void display(){
		System.out.println("area of circle is "+(22/7*radius*radius));
	}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s=new square();
		triangle t=new triangle();
		circle c=new circle();
		s.getdata();
		t.getdata();
		c.getdata();
		s.display();
		t.display();
		c.display();
		
	}

}
