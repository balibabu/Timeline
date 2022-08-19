package part_2;

import java.io.FileNotFoundException;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException {

		Library library = new Library();
		library.storeBooks();
		library.showBooks();

		// requirement 4
		library.authorBooks();
	}

}