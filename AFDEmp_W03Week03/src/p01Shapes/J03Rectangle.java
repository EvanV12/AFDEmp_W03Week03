package p01Shapes;

public class J03Rectangle {
	
	private J01Point a;  			 //η μεταβλητη Point ειναι συνθετου τυπου (πχ οχι int,string), την ορισαμε εμεις
	private J01Point b;
	private J01Point c;
	private J01Point d;
	
	
	public J03Rectangle() {}		//constructor (default)
	
	public J03Rectangle(J01Point a, J01Point b, J01Point c, J01Point d) {		//also constructor
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	public J01Point getA() {
		return a;
	}
	public void setA(J01Point a) {
		this.a = a;
	}
	
	
	public J01Point getB() {
		return b;
	}
	public void setB(J01Point b) {
		this.b = b;
	}
	
	
	public J01Point getC() {
		return c;
	}
	public void setC(J01Point c) {
		this.c = c;
	}
	
	
	public J01Point getD() {
		return d;
	}
	public void setD(J01Point d) {
		this.d = d;
	}
	
	
	// method for first side length
	public int sideA() {
		int sideone = b.getX() - a.getX();
		return sideone;
	}
	
	// method for second side length
	public int sideB() {
		int sidetwo = b.getY() - c.getY();
		return sidetwo;
	}
	
	
	// method for rectangle perimeter
	public int perimeter() {
		int total = (sideA()*2) + (sideB()*2);
		return total;
	}
 	
	// method rectangle surface area
	public int surfacearea() {
		int surface = sideA() * sideB();
		return surface;
	}
	
	
}
