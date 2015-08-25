/**
 * @class Circle
 * @author Pulkit
 * @since 12th August15
 * Implements the shape interface according to circle
 */
package Assignment1;

public class Circle implements Shape {
	private int radius;
	
	/**
	 * Circle
	 * @param radius
	 * Constructor of circle class
	 */
	
	public Circle(int radius) {
		this.radius = radius;															// Initializes the radius member of the circle.
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
	 * Returns the area of circle of the object by which it is called.
	 */
	
	public double getArea() {
		double area;
		area = (22 / 7) * (radius * radius);											// Calculates the area of the circle.
		return area;
	}
}
