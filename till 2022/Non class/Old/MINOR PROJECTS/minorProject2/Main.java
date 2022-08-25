public class Main {
	public static void main(String[] args) {
		polynomial poly1 = new polynomial();
		polynomial poly2 = new polynomial();
		polynomial sum=new polynomial();
		System.out.println("enter the first expression");
		poly1.fetch();
		System.out.println("enter the second expression");
		poly2.fetch();
		System.out.println("The two polynomials are given below");
		poly1.sort();
		poly2.sort();
		poly1.display();
		poly2.display();
		sum.add(poly1,poly2);
		System.out.println("\nthe sum of the polynomials is");
		sum.display();
	}
}