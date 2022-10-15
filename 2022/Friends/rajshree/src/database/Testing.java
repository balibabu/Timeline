package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\Works_Space\\Timeline\\2022\\Friends\\rajshree\\src\\database\\book.txt");
		Scanner rows = new Scanner(file);
		while (rows.hasNextLine()) {
			String data = rows.nextLine();
			System.out.println(data);
		}
		rows.close();
	}

}
