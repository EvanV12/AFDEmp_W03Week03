package p03Book;

public class J02Book {
	private String name;
	private J01Author I;
	private double price;
	private int quantity;
	
	public J02Book() {}
	public J02Book(String name, J01Author I, double price, int quantity) {
		this.name = name;
		this.I = I;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public J01Author getI() {
		return I;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setI(J01Author I) {
		this.I = I;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public String toString() {
		return "Book name = " + getName() + "\nAuthor's name = " + I.getName() +
				"\nAuthor's email = " + I.getEmail() + "\nAuthor's gender = " + I.getGender() +
				"\nBook price = " + getPrice() + "\nBook quantity = " + getQuantity();
	}
	
	
	public String getAuthorName() {
		return I.getName();
	}
	public String getAuthorEmail() {
		return I.getEmail();
	}
	public String getAuthorGender() {
		return I.getGender();
	}
		
}
