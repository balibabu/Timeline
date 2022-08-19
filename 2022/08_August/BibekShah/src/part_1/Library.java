package part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	ArrayList<Book> bookList = new ArrayList<Book>();
	double maxCost=Double.MIN_VALUE;
	double minCost=Double.MAX_VALUE;
	double totalCost=0;
	int highestPages=Integer.MIN_VALUE;
	String highestPagesBook="";
	int lowestPages=Integer.MAX_VALUE;
	String lowestPagesBook="";

	public void storeBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter title of book or nomore to stop");
		String title = sc.nextLine();
		while (!title.equalsIgnoreCase("nomore")) {
			System.out.println("enter author name");
			String author=sc.nextLine();
			System.out.println("enter publisher name");
			String publisher=sc.nextLine();
			System.out.println("enter price of Book");
			double price=sc.nextDouble();
			System.out.println("enter no. of pages the book have");
			int pages=sc.nextInt();
			System.out.println("enter ISBN of Book");
			String isbn=sc.next();
			Book book=new Book(title, author, publisher, price, pages, isbn);
			bookList.add(book);
			update(book);
			
			System.out.println("\nenter title of another book or nomore to stop");
			sc.nextLine();
			title=sc.nextLine();
		}
		System.out.println("%d books added\n".formatted(bookList.size()));
	}
	
	public void showBooks() {
		System.out.println("Title\t\tAuthor\t\tPublisher\tPrice\tPages\tISBN");
		System.out.println("=====\t\t======\t\t=========\t=====\t=====\t=====");

		for(Book book: bookList) {
			String str="%s\t%s\t%s\t%.2f\t%d\t%s".formatted(
					book.getTitle(),book.getAuthor(),book.getPublisher(),
					book.getPrice(),book.getPages(),book.getIsbn());
			
			System.out.println(str);
		}
	}

	public void generatingReport() {
		System.out.println("Totals");
		System.out.println("===============");
		System.out.println("Total number of Books: "+bookList.size());
		System.out.println("Total cost of Books: "+totalCost);
		System.out.println("Maximum cost of a book: "+maxCost);
		System.out.println("Minimum cost of a book: "+minCost);
		System.out.println("%s has the highest number of pages:%d".formatted(highestPagesBook,highestPages));
		System.out.println("%s has the lowest number of pages:%d".formatted(lowestPagesBook,lowestPages));
		System.out.println("Average cost of a book:%.2f".formatted(totalCost/bookList.size()));
	}

	public void update(Book b) {
		totalCost+=b.getPrice();
		if(maxCost<b.getPrice())
			maxCost=b.getPrice();
		if(minCost>b.getPrice())
			minCost=b.getPrice();
		if(highestPages<b.getPages()) {
			highestPages=b.getPages();
			highestPagesBook=b.getTitle();
		}
		if(lowestPages>b.getPages()) {
			lowestPages=b.getPages();
			lowestPagesBook=b.getTitle();
		}
	}
}

