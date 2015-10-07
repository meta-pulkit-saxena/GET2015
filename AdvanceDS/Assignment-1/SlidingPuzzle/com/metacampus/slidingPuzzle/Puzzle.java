
/**
 * @class Puzzle
 * @author Pulkit
 * @since 6 October,2015
 * This class contains the Logic of puzzle.
 **/

package com.metacampus.slidingPuzzle;

import java.util.*;
import com.metacampus.slidingwindow.helper.Movement;

public class Puzzle 
{
	// The initial state of the puzzle.
	public State initialState;
	// The current state of the puzzle. 
	public State state;
	// The initial capacity of the queue. 
	static final int CAPACITY = 100;

	// The priority queue used to solve the puzzle. 
	public final PriorityQueue<State> queue = new PriorityQueue<State>(CAPACITY, new Comparator<State>() 
	{
		@Override
		public int compare(State o1, State o2) 
		{
			return o1.totalMove() - o2.totalMove();
		}
	});

	// A Hash set containing the states that have been visited. 
	public final HashSet<State> visited = new HashSet<State>();
	// Constructor
	public Puzzle(int[] puzzleInput)
	{
		this.initialState = new State(puzzleInput);
		this.state = this.initialState;
	}
	 
	/**
	 * This function checks whether the Puzzle is solvable or not.
	 * @return{boolean}
	 */
	
	public boolean isSolvable() 
	{
		// No of Transformation done
		int inversions = 0;
		int[] p = this.state.array;
		for(int i = 0; i < p.length - 1; i++) 
		{
			for(int j = i + 1; j < p.length; j++)
			{
				if(p[i] > p[j])
				{
					inversions++;
				}
			}
			if(p[i] == 0 && i % 2 == 1)
			{
				inversions++;
			}
		}
		return (inversions % 2 == 0);
	}
	
	/**
	 * This function finds the solution for the above problem
	 * @param{int[]} array
	 * @return{int}
	 **/
	
	public static int getHeuristic(int[] array) 
	{
		int heuristic = 0;
		for(int i = 0; i < array.length; i++) 
		{
			if (array[i] != 0)
			{
				heuristic += getManhattanDistance(i, array[i]);
			}
		}
		
		return heuristic;
	}

	/**
	 * This function returns the distance between current and goal position
	 * @param{int} index
	 * @param{int} number
	 * @return{int}
	 **/
	
	public static int getManhattanDistance(int index, int number) 
	{
		return Math.abs((index / 3) - ((number-1) / 3)) + Math.abs((index % 3) - ((number-1) % 3));
	}
	
	/**
	 * This function adds to the Queue and traverse to next element
	 * @param{State} nextState
	 **/
	
	private void addToQueue(State nextState) 
	{
		if(nextState != null && !this.visited.contains(nextState)) 
		{
			this.queue.add(nextState);
		}
	}
	
	/**
	 * This function solves the problem according to the given specifications 
	 **/
	
	public void solve() 
	{
		// Clear the queue and add the initial state.
		queue.clear();
		queue.add(this.initialState);
		while(!queue.isEmpty()) 
		{
			// Get the best next state.
			this.state = queue.poll();
			// Check if the state is a solution.
			if (this.state.isSolved()) 
			{
				System.out.println(this.state.solutionMessage());
				return;
			}
			// Add this state to the visited HashSet so we don't revisit it.
			visited.add(state);
			// Add valid moves to the queue.
			this.addToQueue(Movement.up(state));
			this.addToQueue(Movement.down(state));
			this.addToQueue(Movement.left(state));
			this.addToQueue(Movement.right(state));
		}
	}
}