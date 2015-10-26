package com.metacube.webservice;

import com.metacube.webservice.FahrenheitToCelsius;
import com.metacube.webservice.FahrenheitToCelsiusServiceLocator;

public class Client {
	public static void main(String[] args) {
        FahrenheitToCelsiusServiceLocator Locator = new FahrenheitToCelsiusServiceLocator();
        Locator.setFahrenheitToCelsiusEndpointAddress("http://localhost:8080/WebService/services/FahrenheitToCelsius");
        
        try {
        	FahrenheitToCelsius webService = Locator.getFahrenheitToCelsius();
            
            System.out.println(webService.convert(67.00));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
