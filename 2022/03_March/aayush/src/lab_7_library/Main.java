package lab_7_library;

public class Main {

	public static void main(String[] args) {
		
		Library.setShelfSpace(4);
		
		Book b1 = new Book("Moby Dick", 1851, "Herman Melville");
	    Book b2 = new Book("Crime and Punishment", 1866, "Fyodor Dostoevsky");
	    Book b3 = new Book("Ulysses", 1922, "James Joyce");
	    Book b4 = new Book("Frankenstein", 1818, "Mary Shelley");
	    Book b5 = new Book("Winesburg, Ohio", 1919, "Sherwood Anderson");
	    
	    Library library = new Library();
	    
	    System.out.println(library); 
	    
	    library.placeBook(b1);
	    library.placeBook(b2);
	    
	    System.out.println(library);
		
	    Book b = library.checkOutBook(2);
	    if(b==null){
	        System.out.println("Error: checking out book at index 2 should be null at this point in the program.");
//	        System.exit(1);
	    }
	    
	    library.placeBook(b3);
	    library.placeBook(b4);
	    
	    boolean success = library.placeBook(b5);
	    if(success == false){
	        System.out.println("Error: Should not be allowed to place 5 book son a shelf with 4 spaces.");
//	        System.exit(1);
	    }
	    
	    System.out.println(library);
	    
	    Book myNewBook = library.checkOutBook(1);
	    System.out.println("* I checked out a book called " + myNewBook.getTitle() + ".*");
	    
	    
	    Book anotherNewBook = library.checkOutBook(1);
	    
	    if(anotherNewBook == null){
	        System.out.println("Error: checkout out book at index 1 should be null since it is already checked out.");
//	        System.exit(1);
	    }
	    
	    Book yetAnotherNewBook = library.checkOutBook(100);
	    yetAnotherNewBook = library.checkOutBook(-1);
	    
	    yetAnotherNewBook = library.checkOutBook(3);
	    System.out.println(library);
	    
	    library.checkInBook(myNewBook);
	    success = library.checkInBook(anotherNewBook);
	    if(success == false){
	        System.out.println("Error: success should be false because anotherNewBook is null.");
//	        System.exit(1);
	    }
	    
	    library.checkInBook(yetAnotherNewBook);
	    success = library.checkInBook(new Book());
	    if(success == false){
	        System.out.println("Error: checking in an un-placed book should not be successful.");
//	        System.exit(1);
	    }
	    
	    System.out.println(library);
	}

}























