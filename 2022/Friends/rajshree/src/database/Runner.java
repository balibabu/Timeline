package database;

public class Runner {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/book_db";
		String uname = "root";
		String password = "12345";
		
		Database db=new Database(url, uname, password);
		
		
//		Database db=new Database(st);
//		String[] s= {"a","b","c","100","e"};
//		db.add_row(s);
		
	}

}
