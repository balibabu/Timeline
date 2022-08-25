import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of beads");
		int n=sc.nextInt();
		move(n,'A','B','C');
	}
	public static void move(int n,char t1,char t2,char t3){
		if(n==1){
			System.out.println("Disk 1 from "+t1+" to "+t3);
		}else{
			move(n-1,t1,t3,t2);
			System.out.println("Disk "+n+" from "+t1+" to "+t3);
			move(n-1,t2,t1,t3);
		}
	}
}
