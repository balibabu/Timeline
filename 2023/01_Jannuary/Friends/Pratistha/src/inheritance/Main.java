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
			String subject=sc.next();
			int resultPercentage=sc.nextInt();
			int salary=sc.nextInt();
			person=new TeachingStaff(name, birthYear, salary, subject, resultPercentage);
		}else if(code==3) {
			sc.nextLine();
			String lab=sc.nextLine();
			int experience=sc.nextInt();
			int salary=sc.nextInt();
			person=new NonTeachingStaff(name, birthYear, salary, lab, experience);
		}
		System.out.println(person);
	}

}
