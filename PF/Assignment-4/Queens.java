
import java.util.*;

/**
 * Name:Queens
 * @author Pulkit
 * Since:12th August 15
 * Solves the N queen Problem
 **/

public class Queens {
	public int[] position;																	// where the position of queens is stored
	public int array1[][];

	/**
	 * Name:Queens constructor
	 * @param{int} N
	 * Initializes the Array X
	 **/

	public Queens(int N) {
		position = new int[N];
	}

	/**
     * Name:callplaceNqueens
     * @return{[][]int}  2-d array
     * calls the placeNQueens function
     **/

	public int[][] callPlaceNQueens() {
		array1 = placeNQueens(0, position.length);									    	// calling the placeNQueens()
		return array1;
	}


	/**
	 * Name: printQueens
	 * @param{int[]} position
	 * @return{int[][]}
	 **/

	public int[][] printQueens(int[] position) {
		int N = position.length;
		int array[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (position[i] == j) {
					array[i][j] = '1';														// inputing the position of queens as 1
				}
				else {
					array[i][j] = '0';														// inputs other position as 0
				}
			}
		}
		return array;
	}


	/**
     * Name:canPlaceQueen
     * @param{int} row :no of rows
     * @param{int} c :count
     * @return{boolean}  true or false
     * checks for the position if queen can be placed or not
     **/

	public boolean canPlaceQueen(int row, int c) {
		for (int i = 0; i < row; i++) {
			if (position[i] == c || (i - row) == (position[i] - c)|| (i - row) == (c - position[i])) { // checks the position
				return false;
			}
		}
		return true;
	}


	/**
	 * Name:placeNQueens
	 * @param{int} row :which row
	 * @param{int} numberOfQueens
	 * @return{int[][]}
	 * position where queen to be placed
	 **/


	public int[][] placeNQueens(int row, int numberOfQueens) {
			
		for (int c = 0; c < numberOfQueens; c++) {
				if (canPlaceQueen(row, c)) { 													// checks if the queen can be placed 
					position[row] = c;
					if (row == numberOfQueens - 1) {
						array1 = printQueens(position);
						return array1;
					}
					else {
						placeNQueens(row + 1, numberOfQueens);								    // Recursive call to canPlaceQueen().
					}
				}
			}
			return array1;
	}


	public static void main(String[] args) {

		System.out.println("Enter  No Of queens");
		Scanner sc = new Scanner(System.in);
		try {
			int queens = sc.nextInt();
			Queens Q = new Queens(queens);
			int[][] resultArray = Q.callPlaceNQueens();
			for (int row = 0; row < queens; row++) { 											// traversal of row
				for (int column = 0; column < queens; column++) {						        // traversal of  column
					if (Q.position[row] == column) {										    // matches the if value of position  is equal to column
						System.out.print(" 1 ");
					}
					else {
						System.out.print(" 0 ");
					}
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


