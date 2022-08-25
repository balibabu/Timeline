package assignment2;
public class bank {
	private String name;
	private int accNo;
	private int balance;
	public bank(String n, int a, int b) {
		name=n;
		accNo=a;
		balance=b;
	}
	
	public void deposite(int amt) {
		balance+=amt;
		System.out.println(amt+" amount deposited in your account");
	}
	
	public void withdrawl(int amt) {
		if((balance-amt)>1000) {
			System.out.println(amt+" debited from your account");
			balance-=amt;
			System.out.println("your new balance is "+balance);
		}else {
			System.out.println("low balance. money can't be withdrawl");
		}
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Account number: "+accNo);
		System.out.println("Current balance: "+balance);
	}
	public int getacc() {
		return accNo;
	}
}
