package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
	public void create_table() throws SQLException {
		String query="create table Book(Book_id serial primary key, Title varchar(100), Author varchar(100), Genre varchar(100), Height int, Publisher varchar(100))";
		st.execute(query);
	}
	public void add_row(String[] cols) throws SQLException {
		String query="INSERT into book(Title,Author,Genre,Height,Publisher) values(\"%s\",\"%s\",\"%s\",%s,\"%s\")".formatted(cols[0], cols[1],cols[2], cols[3],cols[4]);
		System.out.println(query);
		int executeUpdate = st.executeUpdate(query);
		if (executeUpdate==1)
			System.out.println("1 Value inserted");
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
	public void show_column(String column) throws SQLException {
		String query="select distinct(%s) from book".formatted(column);
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(column));
		}
	}
	public void show_booklist(String column, String columnValue) throws SQLException {
		String query="select * from book where %s='%s'".formatted(column,columnValue);
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.println("Title:"+rs.getString("Title"));
			System.out.println("Author:"+rs.getString("Author"));
			System.out.println("Genre:"+rs.getString("Genre"));
			System.out.println("Height:"+rs.getString("Height"));
			System.out.println("Publisher:"+rs.getString("Publisher"));
			System.out.println();
		}
	}
	
}
