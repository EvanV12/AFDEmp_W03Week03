package p01Shapes;


public class ShapesMain {

	public static void main(String[] args) {
		
		J01Point p1 = new J01Point();
		p1.setX(1);
		p1.setY(5);
			
		J01Point p2 = new J01Point();
		p2.setX(5);
		p2.setY(5);
		
		J01Point p3 = new J01Point();
		p3.setX(1);
		p3.setY(2);
		
		J01Point p4 = new J01Point();
		p4.setX(5);
		p4.setY(2);
		
		// Point p5 = new Point (3, 7);
		
		J03Rectangle r1 = new J03Rectangle();
		r1.setA(p1);
		r1.setB(p2);
		r1.setC(p3);
		r1.setD(p4);
		
		// Rectangle r2 = new Rectangle(p1, p2, p3, p4);
		
		System.out.println("Rectangle1 Point A (x,y) = " + r1.getA().getX() + ", " + r1.getA().getY());
		System.out.println("Rectangle1 Point B (x,y) = " + r1.getB().getX() + ", " + r1.getB().getY());
		System.out.println("Rectangle1 Point C (x,y) = " + r1.getC().getX() + ", " + r1.getC().getY());
		System.out.println("Rectangle1 Point D (x,y) = " + r1.getD().getX() + ", " + r1.getD().getY());
		System.out.println();
		
		System.out.println("SideA of Rectangle1 = " + r1.sideA());
		System.out.println("SideB of Rectangle1 = " + r1.sideB());
		System.out.println();
		
		System.out.println("Perimeter of Rectangle1 = " + r1.perimeter());
		System.out.println("Surface Area of Rectangle1 = " + r1.surfacearea());
		System.out.println();
		System.out.println();
		
		
		
		J01Point pc1 = new J01Point();
		pc1.setX(8);
		pc1.setY(9);
		
		J02Circle c1 = new J02Circle();
		c1.setA(pc1);
		c1.setRadius(4);
		
		System.out.println("Given radius value of Circle1 = " + c1.getRadius());
		System.out.println("Perimeter of Circle1 = " + c1.getPerimeter());
		System.out.println("Surface Area of Circle1 = " + c1.getArea());
		
		
	
	}

}
