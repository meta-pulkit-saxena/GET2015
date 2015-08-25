/**
 * @class Question
 * @author Pulkit
 * @since  14th August 15
 * This class provides all the properties of question for the creation of question object.
 */

class Question {
	
	private String Question;
	public String type;
	private String options;
	
	/**
	 * This function returns the question.
	 * @return{String}
	 */
	
	public String getQuestion() {
		return Question;
	}
	
	/**
	 * This function sets the question for the question object.
	 * @param{String} question
	 */
	
	public void setQuestion(String question) {
		Question = question;
	}
	
	/**
	 * This function returns the options.
	 * @return{String}
	 */
	
	public String getOptions() {
		return options;
	}
	
	/**
	 * This funtion will set the available options for the questions.
	 * @param{String} options
	 */
	
	public void setOptions(String options) {
		this.options = options;
	}

	
	/**
	 * This function will return the type of the question.
	 * @return{Type}
	 */
	
	public String getType() {
		return type;
	}
	
	/**
	 * This function will set the type of the question.
	 * @param{Type} type
	 */
	
	public void setType(String type) {
		this.type = type;
	}

}
