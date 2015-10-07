
/**
 * @class Interface
 * @author Pulkit
 * @since 06 October,2015
 * This Class contains the main function and it controls the whole program.
 **/

package com.metacampus.slidingPuzzle;
import com.metacampus.slidingwindow.helper.InputValidator;

public class PuzzleRunner
{
	
	/**
	 * This is a main function
	 * @param{String[]} args
	 **/
	
	public static void main(String[] args)
	{
		InputValidator validator = new InputValidator();
		char choice;
		// user Choice
		do {
			int input[] = validator.getArrayInput("Enter 8 sliding puzzle : ");
			Puzzle puzzle = new Puzzle(input);
			System.out.println("Given puzzle:\n" + puzzle.state.toString());
			// Check if the puzzle is solvable.
			if (!puzzle.isSolvable())
			{
				System.out.println("Given puzzle:\n\nis NOT solvable!\n"
						+ puzzle.state.toString());
				System.exit(0);
			}
			// Solve the puzzle.
			puzzle.solve();
			choice = validator.getCharacterInput("Do you want to continue press y otherwise n");
		} while (choice == 'y' || choice == 'Y');
	}
}
