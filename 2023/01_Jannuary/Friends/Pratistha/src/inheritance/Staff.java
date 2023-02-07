package inheritance;

public class Staff extends Person{
	private int salary;

	public Staff(String name, int birthYear, int salary) {
		super(name, birthYear);
		this.salary = salary;
	}

	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}


}
