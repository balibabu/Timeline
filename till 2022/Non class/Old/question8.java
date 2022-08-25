import java.util.*;
interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
	
}
abstract class Employee{
	int empID;
	String fname;
	String lname;
	double sal;
	
}
class Manager extends Employee implements EmpInterface{
	double bonus;
	Manager(int empID,String fname,String lname,double sal)
	{
		this.empID=empID;
		this.fname=fname;
		this.lname=lname;
		this.sal=sal;
	}
	public void giveBonus(double amount)
	{
		if(amount<=0)
			System.out.println("Enter valid amount");
		else {
			bonus=amount;
			sal=sal+bonus;
		}
		
	}
	public void displayEmp()
	{
		System.out.println("EmpId="+empID+" First name="+fname+" Last name="+lname+"Salary"+sal);
		
	}
}
public class question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpInterface []e=new Manager[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter fname");
			String fn=sc.next();
			System.out.println("Enter last name");
			String ln=sc.next();
			System.out.println("Enter salary");
			double s=sc.nextDouble();
			e[i]=new Manager(id,fn,ln,s);
			System.out.println("Enter bonus");
			double amt=sc.nextDouble();
			e[i].giveBonus(amt);
		}
		for(int i=0;i<3;i++)
		{
			e[i].displayEmp();
		}
	}

			
			
			
		

	}

