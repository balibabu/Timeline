package part_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import part_1.Book;

class Library {
	int invalidBooks = 0;
	ArrayList<Book> bookList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);

	public void storeBooks() throws FileNotFoundException {
		System.out.println("Enter datafile name");
		String filename = sc.next();
		File file = new File(filename);
		Scanner rows = new Scanner(file);
		while (rows.hasNextLine()) {
			String data = rows.nextLine();
			Book b = getBook(data);
			if (b != null) {
				bookList.add(b);
			}

		}
		rows.close();
	}

	public Book getBook(String row) {
		String[] columns = null;
		try {
			columns = row.split("-");
			if (columns.length != 6)
				throw new Exception("In valid book details");
		} catch (Exception e) {
			System.out.println("delimiter is missing or wrong field delimiter used");
			return null;
		}
		String title;
		String author;
		String publisher;
		double price;
		int pages;
		String isbn;
		try {
			title = columns[0];
			if (title.equals(""))
				throw new Exception("Book title is missing");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

		try {
			author = columns[1];
			if (author.equals(""))
				throw new Exception("Book author is missing");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

		try {
			publisher = columns[2];
			if (publisher.equals(""))
				throw new Exception("Book publisher is missing");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

		try {
			price = Double.parseDouble(columns[3]);
		} catch (Exception e) {
			System.out.println("Price is not numeric value");
			return null;
		}

		try {
			pages = Integer.parseInt(columns[4]);
		} catch (Exception e) {
			System.out.println("Number of pages is not numeric");
			return null;
		}

		try {
			isbn = columns[5];
			if (isbn.equals(""))
				throw new Exception("Book isbn is missing");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

		return new Book(title, author, publisher, price, pages, isbn);
	}

	public void showBooks() {
		int i = 0;
		for (i = 0; i < bookList.size() - 1; i++) {
			Book b = bookList.get(i);
			print(b);
			System.out.println("====================================");
		}
		print(bookList.get(i));
	}

	public void print(Book b) {
		System.out.println("Title:" + b.getTitle());
		System.out.println("Author:" + b.getAuthor());
		System.out.println("Publisher:" + b.getPublisher());
		System.out.println("Price:" + b.getPrice());
		System.out.println("Pages:" + b.getPages());
		System.out.println("ISBN:" + b.getIsbn());
	}

	public void authorBooks() {
		System.out.println("\nenter authors name:");
		sc.nextLine();
		String author = sc.nextLine();
		for (Book b : bookList) {
			if (author.equals(b.getAuthor())) {
				print(b);
			}
		}
		System.out.println("\nDone searching books...........");
	}
}
