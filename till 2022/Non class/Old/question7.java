import java.util.Scanner;
interface aa
{
	void display();
	void count();
	
}
class bb implements aa
{
	static int maxcount;
	String name;
	bb(String name)
	{
		this.name=name;
	}
	public void count()
	{
	maxcount=name.length();
	}
	public void display()
	{
		System.out.println("count="+maxcount);
		
	}
}	
	
public class question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		bb a=new bb(name);
		a.count();
		a.display();
	}
		
		

	}


