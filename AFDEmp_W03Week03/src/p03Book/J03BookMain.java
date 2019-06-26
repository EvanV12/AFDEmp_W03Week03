package p03Book;

public class J03BookMain {

	public static void main(String[] args) {
		
		J01Author a1 = new J01Author("Jack", "jack@gmail.com", "male");
	
		J02Book b1 = new J02Book("Title", a1, 34.5, 55);
		
		System.out.print(b1.toString());

	}

}

