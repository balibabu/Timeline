package cw;

public class area_triangle {

	public static void main(String[] args) {
		double a=10f;
		double b=20f;
		double c=25f;
		double s=(a+b+c)/3;
		double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
		System.out.println(s);
	}

}
