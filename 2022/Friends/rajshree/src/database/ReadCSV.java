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
		ArrayList<String[]> rows=new ArrayList<String[]>();
		while(sc.hasNext()) {
			String[] row=sc.nextLine().split(delimeter);
			rows.add(row);
		}
		sc.close();
		return rows;
	}
}