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
		return "Student [department=" + department + ", attendancePercentage=" + attendancePercentage + "]";
	}


	public boolean isEligible() {
		if(attendancePercentage>=75)
			return true;
		return false;
	}
}
