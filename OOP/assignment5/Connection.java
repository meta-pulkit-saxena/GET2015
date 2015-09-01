
/**
 * @class Connection
 * @author Pulkit
 * @since  20 the August 15
 * This class represents an edge between two nodes in a graph.It's object stores the node with which it is connected.
 */

public class Connection {
	public String nodeEmail;

	/**
	 * This function will return the node of connection object.
	 * @return{Node} node
	 */
	
	public String getNodeEmail() {
		return nodeEmail;
	}

	/**
	 * This function will set the node in connection object.
	 * @param{Node} node 
	 */
	
	public void setNodeEmail(String node) {
		this.nodeEmail = node;
	}
	
}
