
/**
 * @interface PaymentModeInterface
 * @author Pulkit
 * @since  14th August 15
 * This interface contains the declaration of paymentMode function which can be implemented
 * by any class according to their needs.
 */

package oops;

public interface PaymentModeInterface {

	/**
	 * This is a abstract method of Interface PaymentModeInterface is to be implemented by implementing classes
	 * as per their requirements for payment.
	 * @return 
	 * @return{boolean}
	 */
	
	public void pay(Train finalTrain,Passenger passenger);
}
