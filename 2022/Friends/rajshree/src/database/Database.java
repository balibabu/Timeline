package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	Statement st;
	public Database(String url,String uname,String password) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		st = con.createStatement();
	}
	public void create_table() {
		String query="create table Book(Book_id serial primary key, Title varchar(100), Author varchar(100), Genre varchar(100), Height int, Publisher varchar(100))";
		System.out.println(query);
	}
	public void add_row(String[] cols) throws SQLException {
		String query="INSERT into book(Title,Author,Genre,Height,Publisher) values(\"%s\",\"%s\",\"%s\",%s,\"%s\")".formatted(cols[0], cols[1],cols[2], cols[3],cols[4]);
		st.executeUpdate(query);
		System.out.println(query);
	}
	public void add_multiple_row(ArrayList<String[]> rows) {
		for(String[] row:rows) {
			try {
				add_row(row);
			} catch (Exception e) {
				System.out.println(row+" not inserted");
			}
		}
	}
}
