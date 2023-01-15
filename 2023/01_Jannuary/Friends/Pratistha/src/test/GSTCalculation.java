package test;

import java.util.Scanner;

public class GSTCalculation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String detail=sc.nextLine();
		String type=sc.nextLine();
		String ownerName=sc.nextLine();
		double costPerDay=sc.nextDouble();
		int rate=sc.nextInt();
		String startingDate=sc.next();
		String endingDate=sc.next();
		System.out.println(rate*costPerDay/100);
	}
}

class Event {
	String name;
	String detail;
	String type;
	String ownerName;
	double costPerDay;
	
	public Event() {
		super();
	}

	public Event(String name, String detail, String type, String ownerName, double costPerDay) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}
	
}

class Exhibition extends Event{
	int noOfStall;

	public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfStall = noOfStall;
	}
	
}

class StageEvent extends Event{
	int noOfSeats;

	public StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfSeats = noOfSeats;
	}
}