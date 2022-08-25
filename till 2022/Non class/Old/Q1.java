import java.util.*;
class commision {
	int sales;
	commision(int a){
		sales=a;
		double c=getCommision();
		System.out.println("your commision is "+c);
	}
	double getCommision(){
		double c;
		if(sales<500){
			c=.02*sales;
		}else if(sales<5000){
			c=.05*sales;
		}else{
			c=.08*sales;
		}
		return c;
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount of sales");
		int a=sc.nextInt();
		if(a>=0){
		commision c1=new commision(a);
		}else{
			System.out.println("invalid input");
		}
	}

}
