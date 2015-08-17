package Assignment1;

/**
 * Square
 * @author Pulkit
 * @since  12th August 15
 * Implements shape class for square
 */
public class Square implements Shape {
	private int side;

	/**
	 * Square 
	 * @param{side} side
	 * Constructor of class Square
	 */
	public Square(int side) {
		this.side = side;
	}

	/**
	 * draw
	 * Prints the square 
	 */
	
	public void draw() {
		System.out.println("Function To Draw Square");
	}
	
	/**
	 * getArea
	 * @return{double} area
	 * returns the area of square
	 */

	public double getArea() {
		return (side * side);
	}

}