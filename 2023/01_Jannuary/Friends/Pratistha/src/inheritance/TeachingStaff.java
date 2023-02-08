package inheritance;

public class TeachingStaff extends Staff{
	private String subject;
	private int resultPercentage;
	public TeachingStaff(String name, int birthYear, int salary, String subject, int resultPercentage) {
		super(name, birthYear, salary);
		this.subject = subject;
		this.resultPercentage = resultPercentage;
	}
	public double getSalary() {
		return super.getSalary()+super.getSalary()*resultPercentage/1000;
	}
	@Override
	public String toString() {
		return super.toString()+"Subject : " + subject + "\nNew Salary : " + getSalary() + "\n";
	}
}
