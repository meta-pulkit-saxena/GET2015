package Assignment1;

import java.util.Scanner;


/**
 * 
 * @author Pulkit
 * @since  12th August 15
 * This class performs actions on a matrix
 */

public class Matrix {
	
	public int data[][];
	private int noRows;
	private int noCol;

	
	/**
	 * Matrix
	 * @param{int} number of rows
	 * @param{int} number of columns
	 * Constructor for Matrix class
	 */
	
	public Matrix(int row, int col) {
		
		this.noRows = row;
		this.noCol = col;																			// Constructor
		data = new int[row][col];
	}
	
	
	/**
	 * addElements
	 * @param{int} row number
	 * @param{int} column number
	 * @param{int} value to be added
	 * Adds element at the specified location
	 */
	
	public void addElements(int row, int col, int val) {
		
		data[row][col] = val; 
	}
	
	
	/**
	 * matrixTranspose
	 * @return{Matrix object}  returns a Matrix object
	 */
	
	public Matrix matrixTranspose() {
		
		Matrix tempObj = new Matrix(this.noCol,this.noRows);
		for(int rowCount = 0; rowCount < this.noRows; rowCount++)
		{
			for(int colCount = 0; colCount < this.noCol; colCount++)
			{
				tempObj.addElements(colCount, rowCount, this.data[rowCount][colCount]);					// Transpose
			}
		}
		return tempObj;	
	}
	
	
	/**
	 * show
	 * This method displays the matrix elements
	 */
	
	public void show() {
		
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
