
/**
 * @class  Title
 * @author Pulkit
 * @since  14th September 15
 * This class defines the title entity.
 */

package com.metacube.jdbc.modal;

public class Title {

	private int titleId;
	private String titleName;
	
	/**
	 * This is a parameterized constructor.
	 * @param{int} titleId
	 * @param{String} titleName
	 */
	
	public Title(int titleId, String titleName) {
		super();
		this.titleId = titleId;
		this.titleName = titleName;
	}
	
	/**
	 * This is a default constructor.
	 */
	
	public Title() {
	}
	
	/**
	 * This function returns the title id.
	 * @return{int} titleId
	 */
	
	public int getTitleId() {
		return titleId;
	}
	
	/**
	 * This function sets the title id.
	 * @param{int} titleId 
	 */
	
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	
	/**
	 * This function returns the title name.
	 * @return{String} titleName
	 */
	
	public String getTitleName() {
		return titleName;
	}
	
	/**
	 * This function sets the title name.
	 * @param{String} titleName
	 */
	
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	/**
	 * This function overrides the toString function.
	 */
	
	@Override
	public String toString() {
		return " titleId=" + titleId + ",\ntitleName=" + titleName ;
	}
	
}
