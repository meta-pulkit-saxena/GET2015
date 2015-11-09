
/**
 * @class  XmlParser
 * @author Pulkit
 * @since  21st September 15
 * This class controls the vehicle xml parser.
 */

package com.metacampus.casestudy.xml;

import java.util.List;
import com.metacampus.casestudy.helper.VehicleDetailPrinter;
import com.metacampus.casestudy.helper.VehicleHelper;
import com.metacampus.casestudy.modal.Vehicle;

public class XmlParser {
	private List<Vehicle> tempList;
	private final String XML_PATH = "../CaseStudyXml/resources/Vehicle.xml";
	
	/**
	 * This is the main function.
	 * @param{String[]} args
	 */
	
	public static void main(String[] args) {
	Parser parserObject = new Parser();
	XmlParser xmlParserObject = new XmlParser();;
	xmlParserObject.tempList = parserObject.readVehicleXml(xmlParserObject.XML_PATH);
	VehicleHelper vehicleHelperobj = new VehicleHelper();
	vehicleHelperobj.insertVehiclesInDatabase(xmlParserObject.tempList);
	VehicleDetailPrinter obj = new VehicleDetailPrinter();
	}
}
