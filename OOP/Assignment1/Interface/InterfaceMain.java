/**
 * InterfaceMain
 * @author Pulkit
 * @since  12th August 15
 * Runs all the shapes class
 */

package Assignment1;
public class InterfaceMain {
	
	/**
	 * @param{Shape} shape
	 * printShape method takes shape type object and prints it's area
	 */
	
	public void printShape(Shape shape) {
		System.out.println(shape.getArea());
	}
	
	/**
	 * @param{String[]} args
	 * main method starts the program execution
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
