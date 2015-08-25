
/**@class  Matrix
 * @author Pulkit
 * @since  12th August 15
 * This class creates a matrix and performs actions on it like transpose and display it.
 */

package Assignment1;
import java.util.Scanner;
public class Matrix {
	
	public int data[][];
	protected int noRows;
	protected int noCol;

	
	/**
	 * Called when the object of Matrix class is made, it initializes the noRow and
	 * noCol of the matrix object.
	 * @param{int} number of rows
	 * @param{int} number of columns 
	 */
	
	public Matrix(int row, int col) {
		
		this.noRows = row;
		this.noCol = col;																			// Constructor, initializes the noRows and noCol.
		data = new int[row][col];
	}
	
	
	/**
	 * Adds element at the specified location of matrix of the object by which it is called.
	 * @param{int} row number
	 * @param{int} column number
	 * @param{int} value to be added
	 */
	
	public void addElements(int row, int col, int val) {
		
		data[row][col] = val; 
	}
	
	
	/**
	 * This function is called to create and return the transpose of the calling object's matrix.
	 * @return{Matrix object}   A Matrix object
	 */
	
	public Matrix matrixTranspose() {
		
		Matrix tempObj = new Matrix(this.noCol,this.noRows);
		for(int rowCount = 0; rowCount < this.noRows; rowCount++)
		{
			for(int colCount = 0; colCount < this.noCol; colCount++)
			{
				tempObj.addElements(colCount, rowCount, this.data[rowCount][colCount]);					// Transpose logic
			}
		}
		return tempObj;	
	}
	
	
	/**
	 * This method displays the matrix elements
	 */
	
	public void show() {
		
		System.out.println("\nThe transpose of the input matrix is:\n" );
		for(int rowCount = 0; rowCount < this.noRows; rowCount++)
		{
			for(int colCount = 0; colCount < this.noCol; colCount++)
			{
				System.out.print(this.data[rowCount][colCount] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	 
	/**
	 * @param{String} args
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the rows and columns of matrix");
		
		int rows = scan.nextInt();
		int cols = scan.nextInt();																	// Input of number of rows and column
		Matrix obj1 = new Matrix(rows,cols);														// closing scanner object		
		System.out.println("Enter the value of 2-d Array");
		try {
			for(int rowCount = 0; rowCount < rows; rowCount++) {
				for(int colCount = 0; colCount < cols; colCount++) {
					obj1.addElements(rowCount, colCount, scan.nextInt());
				}
			}
			scan.close();	
			Matrix obj2;
			obj2 = obj1.matrixTranspose();
			obj2.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
