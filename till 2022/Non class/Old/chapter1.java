import java.util.*;
public class chapter1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no. of data");
		int n=sc.nextInt();
		double[] data=new double[n];
		double mean=0;
		double sq=0;
		for(int i=0;i<n;i++){
			double x=sc.nextDouble();
			mean+=x;
			data[i]=x;
		}
		mean=mean/n;
		for(int i=0;i<n;i++){
			sq+=Math.pow(data[i]-mean,2);
		}
		double var=sq/(n-1);
		Arrays.sort(data);
		for(int i=0;i<n;i++){
			System.out.println(data[i]);
		}
		System.out.println("mean "+mean);
		System.out.println("variance = "+var);
		System.out.println("sd = "+Math.sqrt(var));
		
	}
}