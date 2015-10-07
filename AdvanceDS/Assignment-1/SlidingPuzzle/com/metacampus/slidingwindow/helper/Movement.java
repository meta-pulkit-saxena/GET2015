
/**
 * @class  Movement
 * @author Pulkit
 * @since  5 October,2015
 * This class definesfunctions which defines the movement of the Numbers in the grid of n*n
 **/

package com.metacampus.slidingwindow.helper;
import com.metacampus.slidingPuzzle.State;

public class Movement 
{
	/**
	 * This function moves the number above from the current position
	 * @param{State} state
	 * @return{State}
	 **/
	
	public static State up(State state) 
	{
		if (state.blankIndex > 2) 
		{
			return new State(state, state.blankIndex - 3);
		}
		return null;
	}
	
	/**
	 * This function returns a new state with the blank space swapped with the tile below it.
	 * @param{State} state
	 * @return{State}
	 **/
	
	public static State down(State state)
	{
		if (state.blankIndex < 6)
		{
			return new State(state, state.blankIndex + 3);
		}
		return null;
	}
	
	/**
	 * This function swaps the tile with the tile left to it.
	 * @param{State} state
	 * @return{State}
	 **/
	
	public static State left(State state) 
	{
		if (state.blankIndex % 3 > 0) 
		{
			return new State(state, state.blankIndex - 1);
		}

		return null;
	}
	
	/**
	 * This function swaps the tile with the tile right to it.
	 * @param{State} state
	 * @return{State}
	 **/
	
	public static State right(State state)
	{
		if (state.blankIndex % 3 < 2) 
		{
			return new State(state, state.blankIndex + 1);
		}
		return null;
	}
}