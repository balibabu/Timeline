package lab_7_library;

public class Library {
	
	Book[] array;
	int index;
	static int sizeOfBookArray=10;
	
	public Library() {
		index=0;
		array=new Book[sizeOfBookArray];
	}
	
	public static void setShelfSpace(int a) {
		sizeOfBookArray=a;
		if(a<1)
			sizeOfBookArray=1;
	}
	public boolean placeBook(Book book) {
		if(index>=sizeOfBookArray) {
			System.out.println("Book Shelf is Full");
			return false;
		}
		book.setShelfLocation(index);
		array[index++]=book;
		return true;
	}
	public Book checkOutBook(int n) {
		if(n<0 || n>sizeOfBookArray-1) {
			System.out.println("Invalid book shelf position");
			return null;
		}
			
		if(array[n]!=null) {
			if(array[n].isChecked()==false) {
				array[n].checkOut();
				return array[n];
			}
		}
		return null;
	}
	public boolean checkInBook(Book book) {
		if(book==null)
			return false;
		int n=book.getShelfLocation();
		if(n==-1)
			return false;
		book.checkIn();
		return true;
	}
	public String toString() {
		if(index==0)
			return " its an empty space";
		int a=Book.getNumCheckedOut();
		String s="";
		for(int i=0;i<index;i++) {
			s+="\n"+array[i];
		}
		return s+"\n\nBooks checked out:"+a+"/"+(index);
	}
	
}


class Book{
	
	private String title;
	private int year_of_publication;
	private String author;
	private boolean isChecked;
	private int index;
	private static int nBooks_checked_out=0;
	
	public Book() {
		title="";
		author="";
		year_of_publication=1440;
		isChecked=false;
		index=-1;
	}
	
	public Book(String title,int year,String author){
		this.title=title;
		year_of_publication=year;
		this.author=author;
		isChecked=false;
		index=-1;
	}
	
	public String getTitle() {
		return title;
	}

	public int getYear_of_publication() {
		return year_of_publication;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isChecked() {
		return isChecked;
	}
	
	public int getShelfLocation() {
		return index;
	}
	
	public static int getNumCheckedOut() {
		return nBooks_checked_out;
	}
		
	public void setShelfLocation(int i) {
		index=i;
	}
	
	public void checkOut() {
		isChecked=true;
		nBooks_checked_out++;
	}
	public void checkIn() {
		isChecked=false;
		nBooks_checked_out--;
	}

	public String toString() {
		return "Book [title=" + title + ", year_of_publication=" + year_of_publication + ", author=" + author
				+ ", Available=" + !isChecked + "]";
	}
	
	
}










