
/**
 * @class  LoggerApi
 * @author Pulkit
 * @since  21 October 15
 * This class defines the singleton class for the logger to be used to
 * log all the details of the exceptions caught.
 */

package com.logging.logger;

import org.apache.log4j.Logger;

public class LoggerApi {
	
	private static Logger logger = Logger.getLogger(LoggerApi.class);
	
	private static LoggerApi loggerAPiObject = new LoggerApi();
	
	/**
	 * This is a private constructor.
	 */
	
	private LoggerApi() {
		
	}
	
	/**
	 * This function returns the LoggerApi object.
	 * @return{LoggerApi}
	 */
	
	public static LoggerApi getLoggerApiInstance() {
		return loggerAPiObject;
	}
	
	/**
	 * 
	 * @param error
	 */
	
	public void logError(String error) {
		logger.error(error);
	}
}
