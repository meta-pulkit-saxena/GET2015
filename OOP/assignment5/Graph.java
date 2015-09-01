
/**
 * @class  Graph
 * @author Pulkit
 * @since  20th August 15
 * This class represents the whole network as a one graph. It include number of node having connection between them.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Graph {
	public Map<String,Node> nodesInGraph = new HashMap<String,Node>();
	
	/**
	 * This function will read nodes from the file and initialize the nodes in graph network with the details.
	 */
	
	public void initializeGraph() {
		InitializeNetwork InitializeObj = new InitializeNetwork();
		nodesInGraph = InitializeObj.readNodesFile();
	}
	
	/**
	 * This function displays graph.
	 * @param{HashMap<String, Node>} nodesInGraph
	 */
	
	public void displayGraph(HashMap<String, Node> nodesInGraph) { 
		UtilityFunctions.showGraph(nodesInGraph);
	}
	
	/**
	 * This function will add a node in the graph network. 
	 */
	
	public void addNodeInGraph() {
		Scanner scan  = new Scanner(System.in);
		Node tempNode = new Node();
		System.out.println("Enter p fro person and o for Organization");
		if(scan.nextLine().equalsIgnoreCase("p")) {
			
			tempNode.entityObject = takeInputForPerson(scan);																
		}
		else {
			
			tempNode.entityObject = takeInputForOrganization(scan);
		}
		nodesInGraph.put(tempNode.entityObject.getEmail(),tempNode);
	}
	
	
	/**
	 * This function will take input for a person.
	 * @param{Scanner} scan
	 * @return{Person}
	 */
	
	public Person takeInputForPerson(Scanner scan) {
		Person tempPerson =  new Person();
		System.out.println("Enter Name of person");
		tempPerson.setName(scan.nextLine());																// Taking input for person type entity.
		System.out.println("Enter the e-mail");																			
		tempPerson.setEmail(scan.nextLine());
		System.out.println("Enter the age");
		tempPerson.setAge(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter the hobby of the person");
		tempPerson.setHobby(scan.nextLine());
		return tempPerson;
	}
	
	/**
	 * This function will take input for a organization.
	 * @param{Scanner} scan
	 * @return{Organization}
	 */
	
	public Organization takeInputForOrganization(Scanner scan) {
		int departments,employee;
		Organization tempOrganization = new Organization();
		System.out.println("Enter Name of person");
		tempOrganization.setName(scan.nextLine());
		System.out.println("Enter the e-mail");
		tempOrganization.setEmail(scan.nextLine());															// Taking input for organization type entity.
		System.out.println("Enter the number of departments");
		departments = Integer.parseInt(scan.nextLine());
		tempOrganization.setNumberOfDepartments(departments);
		System.out.println("Enter the number of employee");
		employee = Integer.parseInt(scan.nextLine());
		tempOrganization.setNumberOfEmployee(employee);
		return tempOrganization;
	}
	
	/**
	 * This function will remove a node from the graph network based to the email address.
	 * @param{String} email
	 */
	
	public void removeNodeFromGraph(String email) {
		nodesInGraph.remove(email);																			// Removing a node from graph network.
	}
	
	
	
	/**
	 * This function will add a connection between two nodes identified by their email.It will add each other in 
	 * their connection map.
	 * @param{String} firstEmail
	 * @param{String} secondEmail
	 */
	
	public void addConnectionBetween(String firstEmail,String secondEmail) {
		Node nodeFirst = nodesInGraph.get(firstEmail);
		Node nodeSecond = nodesInGraph.get(secondEmail);
		nodeFirst.addConnection(secondEmail,nodeSecond); 													// Adding second node as a connection in node first.
		nodeSecond.addConnection(firstEmail, nodeFirst);													// Adding first node as a connection in node second.
	}
	
	/**
	 * This function will remove the connection between two nodes identified by their email.It will remove each 
	 * other from their respective connection map.
	 * @param{String} firstEmail
	 * @param{String} secondEmail
	 */
	
	public void removeConnectionBetween(String firstEmail,String secondEmail) {
		Node nodeFirst = nodesInGraph.get(firstEmail);
		Node nodeSecond = nodesInGraph.get(secondEmail);															// This function will remove the connection between 
		nodeFirst.removeConnection(secondEmail, nodeSecond);												// two given nodes.
		nodeSecond.removeConnection(firstEmail, nodeFirst);
	}
	
	/**
	 * This function will search a entity in the graph network.and display the name and email of it.
	 * @param{String} email
	 */
	
	public void searchEntity(String email) {
		if(nodesInGraph.containsKey(email)) {
			Node searchedNode  = nodesInGraph.get(email);
			Entity searchedEntity = searchedNode.entityObject;
			System.out.println("Email: " + email);
			System.out.println("Name: " + searchedEntity.getName());
		}
		else { 
			System.out.println("Entity not found");															// If entity does not exists in the network.
		}
	}
}

