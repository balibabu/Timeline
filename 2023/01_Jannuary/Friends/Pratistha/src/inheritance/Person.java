package inheritance;

public class Person {
	private String name;
	private int birthYear;
	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Name : "+name+"\nBirthYear : "+birthYear+"\n";
	}
}
