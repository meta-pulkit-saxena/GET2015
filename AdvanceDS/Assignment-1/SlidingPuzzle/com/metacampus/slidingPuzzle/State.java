
/**
 * @class state
 * @author Pulkit
 * @since 6 October,2015
 * This class defines the State where the tile is present
 **/

package com.metacampus.slidingPuzzle;

import java.util.Arrays;

public class State 
{
  // The array representing the puzzle's state. 
  public int[] array = new int[9];
  // The index location of the blank tile in the current state. 
  public int blankIndex;
  // The number of moves since the start. 
  private int totalStartingMove;
  // The number of moves to the goal. 
  private int movesToGoal;
  private State previous;
  // Constructor to intialize the Values
  public State(int[] input)
  {
    this.array = input;
    this.blankIndex = getIndex(input, 0);
    this.previous = null;
    this.totalStartingMove = 0;
    this.movesToGoal = Puzzle.getHeuristic(this.array);
  }
  
  /**
   * This function provides State of the tiles in the block
   * @param{State} previous
   * @param{int} blankIndex
   **/
  
  public State(State previous, int blankIndex) 
  {
    this.array = Arrays.copyOf(previous.array, previous.array.length);
    this.array[previous.blankIndex] = this.array[blankIndex];
    this.array[blankIndex] = 0;
    this.blankIndex = blankIndex;
    this.totalStartingMove = previous.totalStartingMove + 1;
    this.movesToGoal = Puzzle.getHeuristic(this.array);
    this.previous = previous;
  }
  
 /**
  * This function gets the index of the tile
  * @param{int[]} array
  * @param{int} value
  * @return{int} 
  **/
  
  public static int getIndex(int[] array, int value) 
  {
    for (int i = 0; i < array.length; i++)
      if (array[i] == value) return i;
    return -1;
  }
  
  /**
   * This function checks whether the puzzle is solved or not
   * @return{boolean}
   **/
  
  public boolean isSolved() 
  {
    int[] p = this.array;
    for (int i = 1; i < p.length - 1; i++)
      if(p[i-1] > p[i]) return false;

    return (p[0] == 1);
  }
  
  /**
   * This function converts the object to string
   * @override toString
   * @return String
   **/
  
  public String toString() 
  {
    int[] state = this.array;
    String s = "\n\n";
    for(int i = 0; i < state.length; i++)
    {
      if(i % 3 == 0 && i != 0) s += "\n";
      s += (state[i] != 0) ? String.format("%d ", state[i]) : "  ";
    }
    return s;
  }

  /**
   * This function returns the all the steps.
   * @return{String} 
   **/
  
  public String allSteps() 
  {
    StringBuilder sb = new StringBuilder();
    if (this.previous != null) sb.append(previous.allSteps());
    sb.append(this.toString());
    return sb.toString();
  }
  
  /**
   * This function provides the solution message.
   * @return{String}
   **/
  
  public String solutionMessage() 
  {
    StringBuilder sb = new StringBuilder();
    sb.append("Here are the steps to the goal state:");
    sb.append(this.allSteps());
    sb.append("\n\nGiven puzzle is SOLVED!");
    sb.append("\nSolution took " + this.totalStartingMove + " steps.\n");
    return sb.toString();
  }
  
  /**
   * This function returns the number of steps that the current state
   * is at since start.
   * @return{int}
   **/
  
  public int totalStartingMove()
  {
    return this.totalStartingMove;
  }
  
  /**
   * This function returns the number of steps still to go for reaching goal.
   * @return{int}
   **/
  
  public int movesToGoal()
  {
    return this.movesToGoal;
  }
  
  /**
   * This function returns the total number of goals.
   * @return{int}
   **/
  
  public int totalMove()
  {
    return totalStartingMove() + movesToGoal();
  }
 
  /**
   * This function returns the previous state.
   * @return{State}
   */
  
  public State getPrevious() {
    return this.previous;
  }

}
