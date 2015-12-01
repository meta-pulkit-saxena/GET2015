/**
 * @abstract Cricket
 * @author Pulkit
 * @since 22 October 15 
 * This is an abstract class which acts as a template for all the formats of games of cricket.
 */

package assignment3.design.templete;

import lombok.Data;

@Data
public abstract class Cricket {
	
	protected String tossWinner, firstTeam, secondTeam, winner;
	protected int firstTeamRuns, secondTeamRuns, overs;

	public abstract void executePlay();
	public abstract void toss();

	/**
	 * This function initializes the teams.
	 * @param{String firstTeam
	 * @param{String secondTeam
	 */

	public void initialize(String firstTeam, String secondTeam) {
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
	}
	
	/**
	 * This is a final function which actually defines the flow of the game.
	 * @param{String firstTeam
	 * @param{String secondTeam
	 */

	public final void play(String firstTeam, String secondTeam) {
		initialize(firstTeam, secondTeam);
		toss();
		executePlay();
		displayResult();
	}

	/**
	 * This function displays the result of the match.
	 */
	
	public void displayResult() {
		System.out.println("\nToss won by:" + tossWinner
											 + "\n" + firstTeam + ": " + firstTeamRuns
											 + "\n" + secondTeam + ": " + secondTeamRuns
											 + "\nAvailable Overs: " + overs
											 + "\nWinner: " + winner);
	}
}
