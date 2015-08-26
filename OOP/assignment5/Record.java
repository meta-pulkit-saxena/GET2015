
/**
 * @class  Record
 * @author Pulkit
 * @since  20th August 15
 * This function will print the record of the entity.
 */

public class Record {

	public void printRecord(String email,Graph graphObj) {
		if(graphObj.nodesInGraph.containsKey(email)) {
			Node searchedNode  = graphObj.nodesInGraph.get(email);
			Entity searchedEntity = searchedNode.entityObject;	
			System.out.println("Email: " + email);											// Printing the email of the entity.			
			System.out.println("Name: " + searchedEntity.getName());						// Printing the name of the entity.
		}
		else { 
			System.out.println("Entity not found");											// If entity does not exists in the network.
		}
	}
}
