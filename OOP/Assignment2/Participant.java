
/**
 * @class  Participant 
 * @author Pulkit
 * @since  14th August 15
 * This class contains all the details related to a participant.
 */

import java.util.ArrayList;
import java.util.List;

class Participant {
	private String name;
	private List<String> answers;
	
	/**
	 * This function returns the name of the participant.
	 * @return{String} 
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * This function sets the name of the participant who will answer the questions.
	 * @param{String} name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This function returns the Array list of answers answered by the user for the questions.
	 * @return{List<String>}
	 */
	
	public List<String> getAnswers() {
		return answers;
	}
	
	/**
	 * This function sets the answers given by the user as input for the questions.
	 * @param{List<String>} questionAnswered
	 */
	
	public void setAnswers(List<String> questionAnswered) {
		this.answers = questionAnswered;
	}

}
