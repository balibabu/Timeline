package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {
	String delimeter=",";
	public ReadCSV() {
		delimeter=",";
	}
	public ReadCSV(String delim) {
		delimeter=delim;
	}
	public ArrayList<String[]> read(String filePath) throws FileNotFoundException {
		Scanner sc=new Scanner(new File(filePath));
		sc.nextLine();
		ArrayList<String[]> rows=new ArrayList<String[]>();
		while(sc.hasNext()) {
			String[] row=sc.nextLine().split(delimeter);
			rows.add(row);
		}
		sc.close();
		return rows;
	}
}

/*
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
*/