package inheritance;

public class NonTeachingStaff extends Staff{
	private String lab;
	private int experience;
	public NonTeachingStaff(String name, int birthYear, int salary, String lab, int experience) {
		super(name, birthYear, salary);
		this.lab = lab;
		this.experience = experience;
	}
	public double getSalary() {
		return super.getSalary()+super.getSalary()*experience/100;
	}
	@Override
	public String toString() {
		return super.toString()+"Lab : " + lab + "\nNew Salary : " + getSalary() + "\n";
	}
}
