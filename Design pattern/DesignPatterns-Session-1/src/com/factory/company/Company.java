
/**
 * @class  Company
 * @author Pulkit
 * @since  10 october 15
 * @extends Developer
 * This class extends the developer class and adds company functionality.
 */

package com.factory.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company extends Developer {

	private List<Developer> developerList = new ArrayList<Developer>();
	private static Company company = new Company();
	
	/**
	 * This is a default constructor.
	 */
	
	private Company() {
		super();
	}

	/**
	 * This function to return instance of company.
	 * @return{Company} company
	 */
	
	public static Company getInstance() {
		return company;
	}

	/**
	 * This function adds the developer in the company.
	 * @param{String} name
	 * @param{String} role
	 */
	
	public void addDeveloper(String name, String role) {
		Developer developer = new Developer();
		developer.setName(name);
		developer.setRole(role);
		developerList.add(developer);

	}

	/**
	 * This function displays the 
	 */
	public void showList() {
		Iterator<Developer> iterator = developerList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
