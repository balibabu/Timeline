package assignment3;
import java.util.Scanner;
public class section {
	Scanner sc=new Scanner(System.in);
	student[] names;
	int nofStudent;
	
	public section() {
		names =new student[10];
		nofStudent=0;
		insert();
	}
	
	public void insert() {
		System.out.println("enter name");
		String n=sc.next();
		int r;
		while(true) {
			System.out.println("enter roll number");
			r=sc.nextInt();
			if(isDuplicate(r)) {
				System.out.println("the given roll number already exits");
				System.out.print("Correctly ");
			}else {
				break;
			}
		}
		System.out.println("enter marks of 5 subjects");
		int[] m=new int[5];
		for(int i=0;i<5;i++) {
			m[i]=sc.nextInt();
		}
		names[nofStudent]=new student(r, n, m);
		nofStudent+=1;
	}
	
	public void display(int roll) {
		for(int i=0;i<nofStudent;i++) {
			if(roll==names[i].roll) {
				names[i].display();
				return;
			}
		}
		System.out.println("There is no such roll number");
	}
	
	public void highLow() {
		int highest=names[0].total_marks;
		int roll1=names[0].roll;
		int lowest=names[0].total_marks;
		int roll2=names[0].roll;
		for(int i=0;i<nofStudent;i++) {
			if(highest<names[i].total_marks) {
				highest=names[i].total_marks;
				roll1=names[i].roll;
			}
			if(lowest>names[i].total_marks) {
				lowest=names[i].total_marks;
				roll2=names[i].roll;
			}
		}
		System.out.println("Student with Highest marks");
		display(roll1);
		System.out.println("\nStudent with lowest marks");
		display(roll2);
	}
	
	public boolean isDuplicate(int roll) {
		for(int i=0;i<nofStudent;i++) {
			if(roll==names[i].roll) {
				return true;
			}
		}
		return false;
	}
}
