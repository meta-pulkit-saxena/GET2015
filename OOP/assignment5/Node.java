
/**
 * @class Node
 * @author Pulkit
 * @since  20th August 15
 * This class will represent the person or organization in the network. This will also include the connections 
 * it has. It can  remove a particular connection ae well as create a connection.
 */

import java.util.HashMap;

public class Node  {
	public Entity entityObject;
	private boolean isEqual;
	public HashMap<String,Connection> connectedNodes = new HashMap<String,Connection>(); 
	
	/**
	 * This function will compare if two nodes are equal or not.It will return true if equal and false if not equal.
	 * @param node
	 * @return{boolean}
	 */

	public boolean equals(Node node) {
		if(node == null || node.getClass() != getClass()) {
			isEqual = false;
		}
		else if(this.entityObject.getEmail().equalsIgnoreCase(node.entityObject.getEmail())) {					// Uniqueness on the basis of the e-mail
			isEqual = true;
		}
		return isEqual;
	}
	
	/**
	 * This function will add the parameter node as a connection in the connection map of the calling node.
	 * @param{String} email
	 * @param{String} node
	 */
	
	public void addConnection(String email,Node node) {
		Connection newIncomingConnection = new Connection();
		newIncomingConnection.setNodeEmail(email);
		connectedNodes.put(email,newIncomingConnection);														// Adding a connection in its connection map
	}
	
	/**
	 * This function will remove the parameter node from the connection map of the calling node.
	 * @param{String} email
	 * @param{String} node
	 */
	
	public void removeConnection(String email,Node node) {
		connectedNodes.remove(email);																			// Removing a connection from map.
	}
	
	/**
	 * This function will return the hash code for the node calling the function.
	 */
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.entityObject.getName().hashCode();												// Calculating hash code one by one.
		hash = 7 * hash + this.entityObject.getEmail().hashCode();
		return hash;
	}
}
