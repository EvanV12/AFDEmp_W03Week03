package p04LibrarySearch;
import java.util.Scanner;

public class MainLibrary {

	public static void main(String[] args) {
		
		J03Librarian lib1 = new J03Librarian("Jack", "45", 'M');
		
		Scanner answer = new Scanner(System.in);
		System.out.println("Which author are you looking for");
		String input = answer.nextLine();
		
		lib1.getAuthor(input);
		
	
		
		
		
		
		answer.close();
	}

}
