
/**
 * @class MetaVehicleException
 * @author Pulkit
 * @since  29th October
 * This class defines the top class for application exceptions
 */

package com.meta.vehicledekho.Exception;

public class MetaVehicleSystemException extends MetaVehicleException {


	/**
	 * This function prints the error message.
	 * @param{String} message
	 */
	
	public MetaVehicleSystemException(String message) {
		super(message);
	}
	
	/**
	 * This function prints the error message and exception.
	 * @param{String} message
	 * @param{Throwable} cause
	 */

	public MetaVehicleSystemException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
