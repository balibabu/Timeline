package test4;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ItemList list=new ItemList();
		for(int i=0;i<n;i++) {
			String name=sc.next();
			double deposite=sc.nextDouble();
			double costPerDay=sc.nextDouble();
			list.add(new ItemType(name,deposite,costPerDay));
		}
		list.sort();
		list.print();
	}

}

class ItemList{
	ArrayList<ItemType> list=new ArrayList<>();
	public void add(ItemType newItem) {
		list.add(newItem);
	}
	public void sort() {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).compare(list.get(j))) {
					list.get(i).swap(list.get(j));
				}
			}
		}
	}
	public void print() {
		for(ItemType item:list) {
			System.out.println(item.getName()+" "+item.getDeposite()+" "+item.getCostPerDay());
		}
	}
}

class ItemType{
	private String name;
	private double deposite;
	private double costPerDay;
	public ItemType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemType(String name, double deposite, double costPerDay) {
		super();
		this.name = name;
		this.deposite = deposite;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	public boolean compare(ItemType item) {
		if(costPerDay<item.costPerDay) {
			return false;
		}
		return true;
	}
	
	public void swap(ItemType item) {
		String Tname=item.name;
		double Tdeposite=item.deposite;
		double TcostPerDay=item.costPerDay;
		item.name=this.name;
		item.deposite=this.deposite;
		item.costPerDay=this.costPerDay;
		
		this.name=Tname;
		this.deposite=Tdeposite;
		this.costPerDay=TcostPerDay;
	}
}