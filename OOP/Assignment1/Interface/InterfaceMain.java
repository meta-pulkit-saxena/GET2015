package Assignment1;

/**
 * InterfaceMain
 * @author Pulkit
 * @since  12th August 15
 * Runs all the shapes class
 */

public class InterfaceMain {
	
	/**
	 * printShape
	 * @param{Shape} shape
	 * Takes obj of shape and prints it's area
	 */
	
	public void printShape(Shape shape) {
		System.out.println(shape.getArea());
	}
	
	/**
	 * main
	 * @param{String[]} args
	 * starts the program execution
	 */
	
	public static void main(String args[]) {
		try {
			Shape shape = new Circle(5);
			shape.draw();
			double cirArea = shape.getArea();
			InterfaceMain object = new InterfaceMain();
			object.printShape(shape);
			Shape squareobj = new Square(2);
			squareobj.draw();
			double squArea = squareobj.getArea();
			object.printShape(squareobj);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
