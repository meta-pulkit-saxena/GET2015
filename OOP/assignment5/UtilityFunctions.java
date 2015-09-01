import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @class  UtilityFunctions
 * @author Pulkit
 * @since  20th August 15
 */
 	public class UtilityFunctions {
	
	/**
	 * This function will calculate and return the hash code of node.
	 * @param{Graph} graphObj
	 * @param{String} firstName
	 * @return{int}
	 */
	
	public static int  nodeHashCode(String firstEmail,Graph graphObj) {
		Node nodeFirst = new Node();
		nodeFirst = graphObj.nodesInGraph.get(firstEmail);
		return nodeFirst.hashCode();
	}
	
	/**
	 * This function will show all the graph nodes.
	 * @param{HashMap<String,Node>} nodeInGraph
	 */
	
	public static void showGraph(HashMap<String,Node> nodesInGraph) {
		Set setOfKeys = nodesInGraph.keySet();
		Iterator iterateSetOfKeys = setOfKeys.iterator();
		while(iterateSetOfKeys.hasNext()) {																	// Iterating through each node in graph.
			showNodeInGraph(nodesInGraph.get(iterateSetOfKeys.next()));										
		}
	}
	
	/**
	 * This function will show all the details of the node.
	 * @param{Node} nodeInGraph
	 */
	
	public static void showNodeInGraph(Node nodeInGraph) {
		String email,name;
		email = nodeInGraph.entityObject.getEmail();
		name = nodeInGraph.entityObject.getName();
		System.out.println("\nEmail: " + email);															// Displaying the email of the node
		System.out.println("Name: " + name);																// Displaying the name of the node.
		showConnectionsOfNode(nodeInGraph);
	}
	
	/**
	 * This function will show all the connections of a node. 
	 */
	
	public static void showConnectionsOfNode(Node nodeInGraph) {
		HashMap<String,Connection> tempConnectionMap = new HashMap<String,Connection>();
		tempConnectionMap = nodeInGraph.connectedNodes;
		String name = nodeInGraph.entityObject.getName();
		Set tempKeySet = tempConnectionMap.keySet();
		Iterator iterateKeys = tempKeySet.iterator();
		System.out.println("\nConnected With");
		while(iterateKeys.hasNext()) {																		// Iterate over all the connections in the graph.
			System.out.print(name + "---->");
			System.out.println(tempConnectionMap.get(iterateKeys.next()).getNodeEmail());					// connection map of the node.
		}
	}
}
