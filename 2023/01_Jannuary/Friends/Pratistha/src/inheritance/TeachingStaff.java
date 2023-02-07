package inheritance;

public class TeachingStaff extends Staff{
	private String subject;
	private int resultPercentage;
	public TeachingStaff(String name, int birthYear, int salary, String subject, int resultPercentage) {
		super(name, birthYear, salary);
		this.subject = subject;
		this.resultPercentage = resultPercentage;
	}
	@Override
	public String toString() {
		return "TeachingStaff [subject=" + subject + ", resultPercentage=" + resultPercentage + "]";
	}
	public int getSalary() {
		return super.getSalary()+super.getSalary()*resultPercentage/1000;
	}
}
