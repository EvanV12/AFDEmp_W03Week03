package p04LibrarySearch;

import java.util.Arrays;

class Library {
	
	private static Library unique_instance;
	
	//books
	private J03Librarian l1;
	//private Book b1;
	
	private J02Book BookSet [] = {new J02Book("bbb", "ccc", 3.5, 44), new J02Book("ddd", "fff", 5.5, 77)};
	
	
	private Library() { }
	
	public static Library getInstance() {
		if(unique_instance == null) unique_instance = new Library();
		return unique_instance;
	}
	
	
	public static Library getUnique_instance() {
		return unique_instance;
	}
	public static void setUnique_instance(Library unique_instance) {
		Library.unique_instance = unique_instance;

	
	
	//public String getBookName() {
	//	return b1.getName();
	//}
	
}

	@Override
	public String toString() {
		return "Library [b1=" + Arrays.toString(BookSet) + "]";
	}

	public J02Book[] getBookSet() {
		return BookSet;
	}

	public void setBookSet(J02Book[] BookSet) {
		this.BookSet = BookSet;
	}
	
	
}
