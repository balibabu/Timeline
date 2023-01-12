package test2;

import java.util.Scanner;

public class SingleFileProgramming {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String csv=sc.nextLine();
		String[] terms=csv.split(",");
		for(String term:terms) {
			System.out.print(term);
		}
	}

}

class Event{
	String name;
	String detail;
	String type;
	String organiserName;
	
	public Event() {
		super();
	}

	public Event(String name, String detail, String type, String organiserName) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiserName = organiserName;
	}
}

class Exhibition extends Event{
	int noOfStalls;

	public Exhibition(String name, String detail, String type, String organiserName, int noOfStalls) {
		super(name, detail, type, organiserName);
		this.noOfStalls = noOfStalls;
	}
	
}

class StageEvent extends Event{
	int noOfSeats;

	public StageEvent(String name, String detail, String type, String organiserName, int noOfSeats) {
		super(name, detail, type, organiserName);
		this.noOfSeats = noOfSeats;
	}
	
}