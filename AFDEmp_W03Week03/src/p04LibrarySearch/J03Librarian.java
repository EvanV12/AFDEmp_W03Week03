package p04LibrarySearch;

public class J03Librarian {
	private String name;
	private String age;
	private char gender;
	
	
	
	
	public J03Librarian() {}
	
	public J03Librarian(String name, String age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		//this.b1 = b1;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//public Book getB1() {
	//	return b1;
	//}
	//public void setBb(Book b1) {
	//	this.b1 = b1;
	//}
	
	//Author author1 = new Author ("Jack", "jack@gmail.com", "male");
	//Book book1 = new Book ("Title", author1, 34.5, 55);
	
	
	public static void getAuthor(String args) {
		Library lb = Library.getInstance();
		J02Book BookSet [] = lb.getBookSet();
		for (int i = 0; i < BookSet.length; i++)
			if (BookSet[i].getAuthor().equalsIgnoreCase(args)) {
				System.out.println("Book by this author");
			}
			else {
				System.out.println("Book not by this author");
				
			}
	}
	

	
	
}
