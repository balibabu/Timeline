package question1;

public class Stall implements Runnable {
	private String stallName;
	private String details;
	private double stallArea;
	private String owner;
	private double stallCost;
	

	public Stall() {
		super();
	}

	public Stall(String stallName, String details, double stallArea, String owner) {
		super();
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}


	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getStallArea() {
		return stallArea;
	}

	public void setStallArea(double stallArea) {
		this.stallArea = stallArea;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getStallCost() {
		return stallCost;
	}

	public void setStallCost(double stallCost) {
		this.stallCost = stallCost;
	}

	@Override
	public void run() {
		this.stallCost=this.stallArea*150.0;
		System.out.println(this.stallCost);
	}

}
