package assignment2;
import java.util.*;

public class Bankarray {
	Scanner sc=new Scanner(System.in);
	int no_of_acc;
	bank[] accounts;
	
	public Bankarray() {
		accounts=new bank[10];
		no_of_acc=0;
	}
	
	public void create() {
		if(no_of_acc==10) {
			System.out.println("Bank is full");
			return;
		}
		while(true) {
			System.out.println("enter name,account no. and balance");
			String n=sc.next();
			int a=sc.nextInt();
			int b=sc.nextInt();
			accounts[no_of_acc]=new bank(n,a,b);
			no_of_acc+=1;
			System.out.println("do you want to add more [y/n]");
			String chk=sc.next();
			if(chk.charAt(0)!='y') {
				break;
			}
		}
	}
	
	
	public void search() {
		System.out.println("enter account number");
		int acc_no=sc.nextInt();
		for(int i=0;i<no_of_acc;i++) {
			if(acc_no==accounts[i].getacc()) {
				accounts[i].display();
				return;
			}
		}
		System.out.println("No such account");
	}
	
	public void display() {
		for(int i=0;i<no_of_acc;i++) {
			accounts[i].display();
		}
	}
	
	public void operate() {
		System.out.println("enter account number");
		int acc_no=sc.nextInt();
		int position=-1;
		for(int i=0;i<no_of_acc;i++) {
			if(acc_no==accounts[i].getacc()) {
				position=i;
				break;
			}
		}
		while (true) {
			System.out.println("1. Display  2. Deposite  3. Withdrawl  4. Exit");
			int a=sc.nextInt();
			if(a==1) {
				accounts[position].display();
			}else if(a==2){
				System.out.println("enter amount to deposite");
				int amt=sc.nextInt();
				accounts[position].deposite(amt);
			}else if(a==3) {
				System.out.println("enter amount to withdraw");
				int amt=sc.nextInt();
				accounts[position].withdrawl(amt);
			}else {
				break;
			}
			System.out.println("\nchoose an option");
			
		}
	}
}
