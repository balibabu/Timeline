
class person {
	String name;
	int age;
	person(String n,int a){
		name=n;
		age=a;
	}
	void display(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
class student123 extends person {
	String course;
	int roll;
	float mark;
	student123(String s,int r,float m,String n,int a){
		super(n,a);
		course=s;
		roll=r;
		mark=m;
		
	}
	void display(){
		super.display();
		System.out.println("course: "+course);
		System.out.println("roll: "+roll);
		System.out.println("mark: "+mark);
		
	}
}
class teacher extends person {
	String subject_assigned;
	int contact_hour;
	teacher(String s,int c,String n,int a){
		super(n,a);
		subject_assigned=s;
		contact_hour=c;
	}
	void display(){
		super.display();
		System.out.println("subject assigned: "+subject_assigned);
		System.out.println("contact_hour: "+contact_hour);
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student123 s=new student123("cse",60,90,"bali",18);
		teacher t=new teacher("dsa",5,"teacher",45);
		s.display();
		t.display();
	}

}
