
/**
 * @class FilterTrainOnSourceDestinationBasis
 * @author Pulkit
 * @since 14th August 15
 * This class filters trains according to the source and
 * destination station of the train.
 */

package oops;
import java.util.ArrayList;
import java.util.List;

public class Filter {
	private List<Train> filteredTrain;
	
	/**
	 * 
	 * @param{Train} trainObject
	 * @param{List<Train>} inputTrainList
	 * @return{List<Train>} filteredTain
	 */
	
	public List<Train> FilterTrainOnSourceDestinationBasis(Train trainObject,List<Train> inputTrainList) {
		filteredTrain = new ArrayList<Train>();
		String sourceStation = trainObject.getSource();
		String destinationStation = trainObject.getDestination();
		for(Train train: inputTrainList) {
			if(train.getSource().equalsIgnoreCase(sourceStation) && train.getDestination().equalsIgnoreCase(destinationStation)) {
				filteredTrain.add(train);																						//Filtering the trains.
			}
		}
		return filteredTrain;
	}

}
