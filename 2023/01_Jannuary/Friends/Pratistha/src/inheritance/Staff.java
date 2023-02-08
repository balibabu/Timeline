package inheritance;

public class Staff extends Person{
	private double salary;

	public Staff(String name, int birthYear, int salary) {
		super(name, birthYear);
		this.salary = salary;
	}

	
	public double getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString()+"Old Salary : " + salary + "\n";
	}


}
