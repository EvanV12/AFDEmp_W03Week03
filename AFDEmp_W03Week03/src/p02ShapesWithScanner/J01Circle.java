package p02ShapesWithScanner;

public class J01Circle {
	
	public static final double pi=3.14;
	private double radius = 1.0;
	private String color = "red";
	
	public J01Circle() {}									// default constructor
	
	public J01Circle (double radius, String color) {		// constructor
		this.radius = radius;
		this.color = color;
	}
	
	
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public double getArea() {
		return pi*radius*radius;
	}
	
	public String toString() {
		return "\nThe circle's color is " + getColor() + "\n";
	}
	
}
