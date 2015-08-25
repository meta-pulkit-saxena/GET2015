
/**
 * @class PrintTrainChart
 * @author Pulkit
 * @since  14th august 15
 * This class prints the train chart.
 */

package oops;

import java.util.List;

public class PrintTrainChart {
	
	/**
	 * This function prints the train chart.
	 */
	
	public void printTrainChart(List<Train> listOfTrain) {
		for(Train train: listOfTrain) {
			System.out.println(train.getTrainNumber() + "\t" + train.getTrainName() + "\t" + train.getTrainType() + "\t" +  train.getSource() + "\t" 
					+ train.getDestination() + "\t" + train.getDuration() + "\t" + train.getAvailableSeatOrWeight());
		}
	}

}
