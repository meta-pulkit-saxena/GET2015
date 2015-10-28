
/**
 * @class MetaException
 * @author Pulkit
 * @since  26th October 15
 * @extend Exception
 * This class defines the exception for meta project.
 */

package com.meta.vehicledekho.Exception;

public class MetaException extends Exception {
	
	/**
	 * This function displays the error message.
	 * @param{String} message
	 */
	
	public MetaException(String message)
	{
		super(message);
		System.out.println(message);
		
	}

}
