
/**
 * @class  InitializeNetwork
 * @author Pulkit
 * @since  21th August 15
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import oops.Train;

public class InitializeNetwork {
	private HashMap<String,Node> nodesAlreadyInGraph ;
	private String address = "D:/nodes.csv";													// Address of node csv file.
	private String breakPoint = ",";

	/**
	 * This function will read the nodes details from the file and will add them into the network.
	 * @return{HashMap<String,Node>}
	 */
	
	public HashMap<String,Node> readNodesFile() {
		nodesAlreadyInGraph = new HashMap<String,Node>();
		String email;
		BufferedReader read;
		String line = "";
		Node tempNode = null;
		try {
			read = new BufferedReader(new FileReader(address));
			while((line = read.readLine()) != null) {											// Reading line by line from the file 
				String[] tokens = line.split(breakPoint);										// Splitting line into properties
				tempNode = new Node();
				if(tokens.length > 0) {
					if(tokens[0].equalsIgnoreCase("p")) {
						tempNode.entityObject = readPerson(tokens);
					}
					else if(tokens[0].equalsIgnoreCase("o")) {
						tempNode.entityObject = readOrganization(tokens);
					}
					email = tempNode.entityObject.getEmail();
					tempNode.connectedNodes = readConnections(tokens);
					nodesAlreadyInGraph.put(email,tempNode);
				}
			}
			read.close();																		// Releasing the reader.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return nodesAlreadyInGraph;
	}

	/** 
	 * This function will read details of person from file and return a person object corresponding to those details.
	 * @param{String[]} tokens
	 * @return{Person}
	 */
	
	private Person readPerson(String[] tokens) {
		int age = Integer.parseInt(tokens[3].trim());
		Person tempPerson =  new Person();
		tempPerson.setEmail(tokens[1].trim());
		tempPerson.setName(tokens[2].trim());
		tempPerson.setAge(age);
		tempPerson.setHobby(tokens[4].trim());
		return tempPerson;
	}

	/**
	 * This function will read details of a organization from file and return a organization object corresponding to those details.
	 * @param{String[]} tokens
	 * @return{Organization}
	 */
	
	private Organization readOrganization(String[] tokens) {
		int departments,employee;
		Organization tempOrganization = new Organization();
		tempOrganization.setEmail(tokens[1].trim());
		tempOrganization.setName(tokens[2].trim());
		departments = Integer.parseInt(tokens[3].trim());	
		tempOrganization.setNumberOfDepartments(departments);
		employee = Integer.parseInt(tokens[4].trim());
		tempOrganization.setNumberOfEmployee(employee);
		return tempOrganization;
	}
	
	/**
	 * This function will read connections from the file corresponding to the entity and return it as a hash map with key
	 * as email address and value be a connection object.
	 * @param{String[]} tokens
	 * @return{HashMap<String,Connection>}
	 */
	
	private HashMap<String,Connection> readConnections(String[] tokens) {
		Connection connection = null;
		String  email;
		HashMap<String,Connection> connectedNodes = new HashMap<String, Connection>();
		for(int count = 5;count<tokens.length;count++) {
			connection = new Connection();
			email = tokens[count].trim();
			connection.setNodeEmail(email);
			connectedNodes.put(email,connection);														// Adding connections one by one to hash map.
		}
		return connectedNodes;
	}
}
