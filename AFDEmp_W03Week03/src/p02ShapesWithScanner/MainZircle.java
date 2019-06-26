package p02ShapesWithScanner;

import java.util.Scanner;

//import java.util.Scanner;

public class MainZircle {

	public static void main(String[] args) {

		/* Scanner userInput = new Scanner(System.in);
		double radius = userInput.nextDouble();
		userInput.close(); */
		
		
		Scanner userInput = new Scanner(System.in);
		double radius;

		J01Circle z1 = new J01Circle(5.5, "yellow");

		System.out.println("The radius of the circle z1 is " + z1.getRadius());
		System.out.println("The circle's surface area is " +z1.getArea());
		System.out.println(z1.toString());

		J01Circle z2 = new J01Circle();
		z2.setRadius(8.8);
		z2.setColor("red");

		System.out.println("\n\n\nThe radius of the circle z2 is " + z2.getRadius());
		System.out.println("The circle's surface area is " +z2.getArea());
		System.out.println(z2.toString());



		System.out.println("Enter radius value for Circle #3");
		radius=userInput.nextDouble();
		J01Circle z3 = new J01Circle(radius, "yellow");

		System.out.println("The radius of the circle z1 is " + z3.getRadius());
		System.out.println("The circle's surface area is " +z3.getArea());
		System.out.println(z3.toString());


		
		System.out.println("Enter radius value for Circle #4");
		radius=userInput.nextDouble();
		J01Circle z4 = new J01Circle();
		z4.setRadius(radius);
		z4.setColor("red");

		System.out.println("The radius of the circle z1 is " + z4.getRadius());
		System.out.println("The circle's surface area is " +z4.getArea());
		System.out.println(z4.toString());


		userInput.close();


	}

}
