
/**
 * @class  Car
 * @author Pulkit
 * @since  25th October 15
 * @extends Vehicle
 * This class defines all the properties of car object.
 */

package com.meta.vehicledekho.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Car extends Vehicle {
	private int carId;
	private boolean ac;
	private boolean powerSteering;
	private boolean accessoryKit;
}
