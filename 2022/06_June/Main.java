import java.util.*;
public class Main {
	static int counter=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string ");
		String str=sc.next();
		char[] Arr=new char[str.length()];
		for(int i=0;i<Arr.length;i++){
			Arr[i]=str.charAt(i);
		}
		String remArr="";
		Arrange(Arr,remArr);
		System.out.println("\ntotal possibilities are "+counter);
	}
	public static void Arrange(char[] Arr,String remArr){
		if(Arr.length==2){
			print(Arr,remArr);
			char temp=Arr[0];
			Arr[0]=Arr[1];
			Arr[1]=temp;
			print(Arr,remArr);
		}else{
			for(int i=0;i<Arr.length;i++){
				System.out.println(get(Arr,i));
				System.out.println(i);
				System.out.println(rem(Arr,i,remArr));
				Arrange(get(Arr,i),rem(Arr,i,remArr));
			}
		}
	}
	public static char[] get(char[] Arr,int i){
		char[] temp=new char[Arr.length-1];
		int c=0;
		for(int j=0;j<Arr.length;j++){
			if(i!=j){
				temp[c]=Arr[j];
				c++;
			}
		}
		return temp;
	}
	
	public static String rem(char[] Arr,int i,String remArr){
		for(int j=0;j<Arr.length;j++){
			if(i==j){
				remArr+=Arr[j];
			}
		}
		return remArr;
	}
	public static void print(char[] Arr,String remArr){
		System.out.println(remArr+Arr[0]+Arr[1]);
		counter++;
	}
}
