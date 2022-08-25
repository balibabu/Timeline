import java.util.*;

class student {
	Scanner sc=new Scanner(System.in);
	int roll;
	String name,course;
	void input_student(){
		System.out.println("enter roll");
		roll=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter course");
		course=sc.next();
	}
	void display_student(){
		System.out.println("name is "+name);
		System.out.println("roll is "+roll);
		System.out.println("course is "+course);
	}
}

class exam extends student {
	double mark1,mark2,mark3;
	void input_marks(){
		System.out.println("enter mark in subject 1");
		mark1=sc.nextDouble();
		System.out.println("enter mark in subject 2");
		mark2=sc.nextDouble();
		System.out.println("enter mark in subject 3");
		mark3=sc.nextDouble();
	}
	void display_result(){
		System.out.println("your mark in subject 1 is "+mark1);
		System.out.println("your mark in subject 2 is "+mark2);
		System.out.println("your mark in subject 3 is "+mark3);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam[] s=new exam[5];
		for(int i=0;i<5;i++){
			s[i]=new exam();
			s[i].input_student();
			s[i].input_marks();
		}
		
		for(int i=0;i<5;i++){
			s[i].display_student();
			s[i].display_result();
		}

	}

}
