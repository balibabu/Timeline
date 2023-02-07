package inheritance;

public class NonTeachingStaff extends Staff{
	private String lab;
	private int experience;
	public NonTeachingStaff(String name, int birthYear, int salary, String lab, int experience) {
		super(name, birthYear, salary);
		this.lab = lab;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "NonTeachingStaff [lab=" + lab + ", experience=" + experience + "]";
	}
	public int getSalary() {
		return super.getSalary()+super.getSalary()*experience/100;
	}
}
