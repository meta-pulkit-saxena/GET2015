package Assignment1;

/**
 * Circle
 * @author Pulkit
 * @since 12th August15
 * Implements the shape interface according to circle
 */
public class Circle implements Shape {
	private int radius;
	
	/**
	 * Circle
	 * @param radius
	 * Constructor of circle class
	 */
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	/**
	 * draw
	 * Displays message for circle
	 */
	
	public void draw() {
		System.out.println("Function To Draw Circle");
	}
	
	/**
	 * @return{double} area of circle
	 * returns the area of circle
	 */
	
	public double getArea() {
		double area;
		area = (22 / 7) * (radius * radius);
		return area;
	}
}
