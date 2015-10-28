
/**
 * @class  Car
 * @author Pulkit
 * @since  25th October 15
 * @extends MetaData
 * This class defines all the properties of vehicle object.
 */

package com.meta.vehicledekho.model;

import java.util.Date;
import lombok.Data;

@Data
public class Vehicle extends MetaData {
	private int vehicleId;
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int mileage;
	private float price;
	private float roadTax;
}
