import java.util.*;
class Author {
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String getName(){
		return name;
	}
	String getEmail(){
		return email;
	}
	char getGender(){
		return gender;
	}
	public String toString(){
		return "Author[name="+name+" ,email="+email+" ,gender="+gender+"]";
	}
}


class Book {
	private String name;
	private Author author;
	private double price;
	private int qty=0;
	Book(String name,Author author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	String getName(){
		return name;
	}
	Author getAuthor(){
		return author;
	}
	double getPrice(){
		return price;
	}
	int getQty(){
		return qty;
	}
	void setQty(int q){
		qty+=q;
	}
	public String toString(){
		return "Book[name="+name+", "+author+", price="+price+", qty="+qty+"]";
	}
}


class Date {
	Scanner sc=new Scanner(System.in);
	int dd,mm,yyyy;
	void getDD(){
		System.out.println("enter date");
		dd=sc.nextInt();
	}
	void getMM(){
		System.out.println("enter month");
		mm=sc.nextInt();
	}
	void getYYYY(){
		System.out.println("enter year");
		yyyy=sc.nextInt();
	}
	public String toString(){
		return dd+"/"+mm+"/"+yyyy;
	}
}



class Student extends Date {
	Scanner sc=new Scanner(System.in);
	String name;
	int roll;
	Date issueDate=new Date();
	Date returnDate=new Date();
	String[] issuedBook=new String[5];
	
	Student(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	void booklist(Book[] b){
		System.out.println("\nLIST OF BOOKS IN THE LIBRARY ARE:");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i].getName()+"\t"+b[i].getQty()+" books");
		}
	}
		
	void issueBook(Book[] b){
		String y;
		int c=0;
		System.out.println("\nenter current date");
		issueDate.getDD();
		issueDate.getMM();
		issueDate.getYYYY();
		booklist(b);
		do{
			System.out.println("which book you want to issue");
			String bok=sc.next();
			for(int i=0;i<b.length;i++){
				if(bok.equals(b[i].getName())){
					if(b[i].getQty()>0){
						issuedBook[c]=bok;
						b[i].setQty(-1);
						c++;
					}else{
						System.out.println("Book Not Available");
					}
				}
			}
			System.out.println("\nenter 'y' if you want to issue more book");
			y=sc.next();
		}while(y.equals("y") && c!=5);
	}
	void display_issuedBook(){
		System.out.println("NAME OF STUDENT: "+name+"\t ROLL NO.:"+roll);
		for(int i=0;i<5;i++){
			if(issuedBook[i]!=null){
				System.out.println("BOOK ISSUED: "+issuedBook[i]+"\t DATE OF ISSUE: "+issueDate);
			}else{
				break;
			}
		}
		System.out.println();
	}
		
	void depositeBook(Book[] b){
		int fine=0;
		String y;
		do{
			
		System.out.println("\nenter the name of book you want to return");
		String n=sc.next();
		for(int i=0;i<b.length;i++){
			if(n.equals(b[i].getName())){
				for(int j=0;j<5;j++){
					if(n.equals(issuedBook[j])){
						b[i].setQty(1);
						System.out.println("enter return date");
						returnDate.getDD();
						returnDate.getMM();
						returnDate.getYYYY();
						issuedBook[j]=null;
						fine+=(issueDate.yyyy-returnDate.yyyy)*365-(issueDate.mm-returnDate.mm)*30-(issueDate.dd-returnDate.dd);
					}
				}
			}
		}
		System.out.println("\nenter 'y' if you want to return more book");
		y=sc.next();
		}while(y.equals("y"));
		System.out.println("total fine is "+fine);
	}
}



public class Main {
	public static void main(String[] args) {
		System.out.println("Remember 'GARBAGE IN GARBAGE OUT'\nSo enter meaningful data");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nhow many books are available in library");
		int nb=sc.nextInt();
		if(nb>0){
		Author[] a=new Author[nb];
		Book[] b=new Book[nb];
		for(int i=0;i<nb;i++){
			System.out.println("\nenter name of book");
			String nameB=sc.next();
			System.out.println("enter author's name");
			String nameA=sc.next();
			System.out.println("enter email address of author");
			String email=sc.next();
			System.out.println("enter gender 'm' or 'f'");
			String gen=sc.next();
			char g=gen.charAt(0);
			while((int)g!=102 && (int)g!=109){
				System.out.println("enter valid gender");
				gen=sc.next();
		   	g=gen.charAt(0);
			}
			System.out.println("enter price of the book");
			double price=sc.nextDouble();
			System.out.println("enter the quantity of the book");
			int qty=sc.nextInt();
			
			a[i]=new Author(nameA,email,g);
			b[i]=new Book(nameB,a[i],price,qty);
		}
		for(int i=0;i<nb;i++){
			System.out.println(b[i]);
		}
		sc.nextLine();
		
		System.out.println("enter how many students are here to issue books");
		int nofS=sc.nextInt();
		Student[] s=new Student[nofS];
		for(int i=0;i<nofS;i++){
			sc.nextLine();
			System.out.println("\nenter name of student");
			String name=sc.nextLine();
			System.out.println("enter roll no.");
			int roll=sc.nextInt();
			s[i]=new Student(name,roll);
			s[i].issueBook(b);
		}
		for(int i=0;i<nofS;i++){
			s[i].display_issuedBook();
		}
		String y;
		do{
			System.out.println("\nenter the name of student who wants to return book");
			sc.nextLine();
			String nam=sc.nextLine();
			for(int i=0;i<nofS;i++){
				if(nam.equals(s[i].name)){
					s[i].depositeBook(b);
				}
			}
			System.out.println("\nif there are more students tor return book enter 'y'");
			y=sc.next();
		}while(y.equals("y"));
		System.out.println("\nREMAINING LIST OF BOOKS IN THE LIBRARY ARE:");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i].getName()+"\t"+b[i].getQty()+" books");
		}
		}else{
			System.out.println("THERE IS NO BOOK IN THE LIBRARY");
		}
	}
}