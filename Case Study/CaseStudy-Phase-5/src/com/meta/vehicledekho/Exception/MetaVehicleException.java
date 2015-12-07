
/**
 * @class MetaVehicleException
 * @author Pulkit
 * @since  29th October
 * This class defines the top class for application exceptions
 */

package com.meta.vehicledekho.Exception;

public class MetaVehicleException extends Exception {
	
	/**
	 * This function prints the error message.
	 * @param{String} message
	 */
	
	public MetaVehicleException(String message) {
		super(message);
	}
	
	/**
	 * This function prints the error message and exception.
	 * @param{String} message
	 * @param{Throwable} cause
	 */
	
	public MetaVehicleException(String message, Throwable cause) {
		super(message, cause);
	}

}
