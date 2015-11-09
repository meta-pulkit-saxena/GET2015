
/**
 * @class  Parser
 * @author Pulkit
 * @since  21st September 15
 * This class contains functions related to the vehicle xml parsing.
 */

package com.metacampus.casestudy.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import com.metacampus.casestudy.modal.Bike;
import com.metacampus.casestudy.modal.Car;
import com.metacampus.casestudy.modal.Vehicle;


public class Parser {
	private enum tagValues {ID, CAR, BIKE, MAKE, MODEL, engineInCC, fuelCapacity, MILEAGE, PRICE, roadTax, AC, powerSteering,
							accessoryKit, selfStart, helmetPrice };
	
	/**
	 * This function parses the vehicle xml file and creates the list of vehicle objects.
	 * @return{List<Vehicle}
	 */
	
	public List<Vehicle> readVehicleXml(String vehicleXmlPath) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();   
		Vehicle vehicle = null;
		try {
			InputStream in = new FileInputStream(vehicleXmlPath);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			
		
			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					if (startElement.getName().getLocalPart()
							.equalsIgnoreCase(tagValues.CAR.toString())) {
						vehicle = new Car();
					} 
					else if (startElement.getName().getLocalPart()
							.equalsIgnoreCase(tagValues.BIKE.toString())) {
						vehicle =  new Bike();
					}

					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equalsIgnoreCase(tagValues.ID.toString())) {
							event = eventReader.nextEvent();
							vehicle.setVehicleId(Integer.parseInt(event.asCharacters().getData()));
							Date date = new Date();
							Timestamp timeStamp = new Timestamp(date.getTime());
							vehicle.setCreatedBy(System.getProperty("user.name"));
							vehicle.setCreatedTime(timeStamp);
							continue;
						}
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.MAKE.toString())) {
						event = eventReader.nextEvent();
						vehicle.setMake(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.MODEL.toString())) {
						event = eventReader.nextEvent();
						vehicle.setModel(event.asCharacters().getData());
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.engineInCC.toString())) {
						event = eventReader.nextEvent();
						vehicle.setEngineInCC(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.fuelCapacity.toString())) {
						event = eventReader.nextEvent();
						vehicle.setFuelCapacity(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.MILEAGE.toString())) {
						event = eventReader.nextEvent();
						vehicle.setMileage(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.PRICE.toString())) {
						event = eventReader.nextEvent();
						vehicle.setPrice(Float.parseFloat(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.roadTax.toString())) {
						event = eventReader.nextEvent();
						vehicle.setRoadTax(Float.parseFloat(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.helmetPrice.toString())) {
						event = eventReader.nextEvent();
						((Bike)vehicle).setHelmetPrice(Float.parseFloat(event.asCharacters().getData()));
						continue;
					}
					

					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.selfStart.toString())) {
						event = eventReader.nextEvent();
						((Bike)vehicle).setSelfStart(Boolean.valueOf(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.AC.toString())) {
						event = eventReader.nextEvent();
						((Car)vehicle).setAc(Boolean.valueOf(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.powerSteering.toString())) {
						event = eventReader.nextEvent();
						((Car)vehicle).setPowerSteering(Boolean.valueOf(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(tagValues.accessoryKit.toString())) {
						event = eventReader.nextEvent();
						((Car)vehicle).setAccessoryKit(Boolean.valueOf(event.asCharacters().getData()));
						continue;
					}
				}
				if (event.isEndElement()) {
			          EndElement endElement = event.asEndElement();
			          if (endElement.getName().getLocalPart().equalsIgnoreCase(tagValues.CAR.toString()) || endElement.getName().getLocalPart().equalsIgnoreCase(tagValues.BIKE.toString())) {
			           vehicleList.add(vehicle);
			          }
			    }
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
}
