package inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person person = null;
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		String name=sc.next();
		int birthYear=sc.nextInt();
		if(code==1) {
			String department=sc.next();
			int attendancePercentage=sc.nextInt();
			person=new Student(name,birthYear,department,attendancePercentage);
		}else if(code==2) {
			int salary=sc.nextInt();
			String subject=sc.next();
			int resultPercentage=sc.nextInt();
			person=new TeachingStaff(name, birthYear, salary, subject, resultPercentage);
		}else if(code==3) {
			int salary=sc.nextInt();
			String lab=sc.next();
			int experience=sc.nextInt();
			person=new NonTeachingStaff(name, birthYear, salary, lab, experience);
		}
		System.out.println(person);
	}

}
