
/**
 * @class  CreateServlet
 * @extend HttpServlet
 * @author Pulkit
 * @since  26th October 15
 * This class implements create servlet.
 */

package com.meta.vehicledekho.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.meta.vehicledekho.Exception.MetaException;
import com.meta.vehicledekho.db.helper.CarDbHelper;
import com.meta.vehicledekho.db.helper.VehicleDbHelper;
import com.meta.vehicledekho.model.Car;
import com.meta.vehicledekho.model.Vehicle;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("/CaseStudy-Phase-4/view/Create.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		int engine = Integer.parseInt(request.getParameter("engine"));
		int fuel = Integer.parseInt(request.getParameter("fuel"));
		int milage = Integer.parseInt(request.getParameter("milage"));
		float price = Float.parseFloat(request.getParameter("price"));
		float roadTax = Float.parseFloat(request.getParameter("roadtax"));
		String createdBy = System.getProperty("user.name");
		Date date = new Date(); 
		String ac = request.getParameter("ac");
		String steering = request.getParameter("steering");
		String kit = request.getParameter("kit");
		Vehicle car = new Car();
		car.setCreatedBy(createdBy);
		car.setCreationTime(date);
		car.setMake(make);
		car.setModel(model);
		car.setEngineInCC(engine);
		car.setFuelCapacity(fuel);
		car.setMileage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		((Car)car).setAc(Boolean.valueOf(ac));
		((Car)car).setPowerSteering(Boolean.valueOf(steering));
		((Car)car).setAccessoryKit(Boolean.valueOf(kit));
		VehicleDbHelper vehicleDb = new VehicleDbHelper();
		vehicleDb.insertIntoVehicleTable(car);
		CarDbHelper carDb = new CarDbHelper();
		try {
			carDb.insertIntoCarTable(car);
		} catch (MetaException e) {
			e.printStackTrace();
		}
		response.sendRedirect("/CaseStudy-Phase-4/view/Home.jsp");
	}

}
