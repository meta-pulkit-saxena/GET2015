
/**
 * @class  Developer
 * @author Pulkit
 * @since  21 october 15
 * @implements IEngineer
 */

package com.factory.company;

public class Developer implements IEngineer{

	String name;
	String role;

	/**
	 * This is a constructor of developer.
	 */
	
	protected Developer() {

	}
	
	/**
	 * This function returns the name of the developer.
	 * @return{String} the name
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * This function sets the name of the developer.
	 * @param{String} name
	 */
	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This function returns the role of the developer.
	 * @return{String} role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This function sets the role of the developer.
	 * @param{String} role
	 */
	
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * This function override the toString function.
	 * @override toString()
	 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name -> " + name + "\nRole -> " + role + "\n";
	}

}
