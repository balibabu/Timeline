package database;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner sc=new Scanner(System.in);
	public void menuDriven(Database db) throws SQLException, FileNotFoundException {
		int choice;
		do {
			System.out.println("1.Read Book");
			System.out.println("2.Add Book");
			System.out.println("3.Exit");
			System.out.println("make a choice:");
			choice=sc.nextInt();
			if(choice==1) {
				readBook(db);
			}else if(choice==2) {
				addBook(db);
			}else if(choice==3) {
				System.out.println("Bye Bye !!!");
			}else {
				System.out.println("Wrong Choice");
			}
		}while(choice!=3);
	}
	public void readBook(Database db) throws SQLException {
		sc.nextLine();
		System.out.println("Show the list of:");
		System.out.println("Title, Genre, Author");
		String col=sc.nextLine();
		db.show_column(col);
		System.out.println("\nEnter anyone");
		String colVal=sc.nextLine();
		System.out.println("\nThese are the books with given value\n");
		db.show_booklist(col, colVal);
	}
	public void addBook(Database db) throws SQLException, FileNotFoundException {
		System.out.println("do you want to upload books from csv file[y/n]");
		if(sc.next().charAt(0)=='y') {
			try {
				db.create_table();
			} catch (Exception e) {
			}
			ReadCSV csv=new ReadCSV("/");
			System.out.println("enter full path of the file");//D:\\Works_Space\\Timeline\\2022\\10_October\\booklist.csv
			ArrayList<String[]> rows = csv.read(sc.next());
			db.add_multiple_row(rows);
			return;
		}
		int colSize=5;
		String cols[]=new String[colSize];
		System.out.println("Enter Title, Author's name, Genre, Height, Publisher");
		sc.nextLine();
		for(int i=0;i<colSize;i++) {
			cols[i]=sc.nextLine();
		}
		db.add_row(cols);
	}
}
