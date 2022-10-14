package database;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/book_db";
		String uname = "root";
		String password = "12345";
		
		ReadCSV csv=new ReadCSV(",");
		ArrayList<String[]> rows=csv.read("D:\\Works_Space\\Timeline\\2022\\10_October\\resources\\books.csv");
		Database db=new Database(url, uname, password);
//		db.create_table();
//		db.add_multiple_row(rows);
		String[] row= {"a","b","c","12","e"};
		db.add_row(row);
		System.out.println("done");
	}

}
