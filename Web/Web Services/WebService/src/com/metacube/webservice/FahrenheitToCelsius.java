package com.metacube.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FahrenheitToCelsius {
	
	@WebMethod
	public double convert(double fahrenheit) {
		double celsius = (fahrenheit - 32.0) * (5.0/9.0);
		return celsius;
	}
}
