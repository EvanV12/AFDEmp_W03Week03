package p00ClassExample;

class Circle {
	
		// counts the number of the created circles
	
	public static int count;
	
	// constructor
	Circle() {
		count += 1; // increase count by one after creating a new circle
	}


	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		System.out.println("c1 count is " + c1.count);
		// c1.count gives a warning. Why?
		
		
		Circle c2 = new Circle();
		
		System.out.println("c2 count is " + Circle.count);
		
		
		Circle c3 = new Circle();
		
		System.out.println("c3 count is " + Circle.count);
		
	}
	
}