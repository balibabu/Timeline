package assignment3;

public class student {
	int roll;
	String name;
	int[] marks=new int[5];
	int total_marks=0;
	
	public student(int r, String n, int[] m) {
		roll=r;
		name=n;
		marks=m;
		for(int i=0;i<m.length;i++) {
			total_marks+=m[i];
		}
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no.: "+roll);
		System.out.println("Total marks: "+total_marks);
	}
	
}
