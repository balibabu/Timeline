package inheritance;

public class Student extends Person {
	private String department;
	private int attendancePercentage;
	
	public Student(String name, int birthYear, String department, int attendancePercentage) {
		super(name, birthYear);
		this.department = department;
		this.attendancePercentage = attendancePercentage;
	}

	

	@Override
	public String toString() {
		return super.toString()+"Department : " + department + "\nEligible : " + isEligible() + "\n";
	}


	public String isEligible() {
		if(attendancePercentage>=75)
			return "Yes";
		return "No";
	}
}
