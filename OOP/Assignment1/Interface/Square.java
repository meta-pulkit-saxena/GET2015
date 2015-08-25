/**
 * @class Square
 * @author Pulkit
 * @since  12th August 15
 * Implements shape class for square
 */

package Assignment1;
public class Square implements Shape {
	private int side;

	/**
	 * @param{side} side
	 * Constructor of class Square. It initializes the object with side argument very moment it is created.
	 */
	
	public Square(int side) {
		this.side = side;														// Initializes the side member of the object.
	}

	/**
	 * Prints the square 
	 */
	
	public void draw() {
		System.out.println("Function To Draw Square");
	}
	
	/**
	 * @return{double} area
	 * returns the area of square of the object by which it is called.
	 */

	public double getArea() {
		return (side * side);													// Returns the area of the square.
	}

}
