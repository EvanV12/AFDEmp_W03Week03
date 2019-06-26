package p01Shapes;

public class J02Circle {

	
	public static final double pi = 3.14;
	private J01Point a;
	private int radius;
	
		
	/*  public static final double pi() {
		double pi = 3.14;
		return pi;
		}	 */
	
	public J02Circle() {}						// default constructor
	
	public J02Circle (J01Point a, int radius){	// manual constructor
		this.a = a;
		this.radius = radius;
	}
	
	
	public J01Point getA() {
		return a;
	}
	public void setA(J01Point a) {
		this.a = a;
	}
	
	
	public int getRadius () {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	// method for perimeter
	public double getPerimeter() {
		double perimeter = 2*pi*radius;
		return perimeter;
	}
	
	// method for surface area
	public double getArea() {
		return  pi*radius*radius;
	}
	
}
	
