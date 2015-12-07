
/**
 * @class  EditServlet
 * @extend HttpServlet
 * @author Pulkit
 * @since  26th October 15
 * This class implements Edit servlet.
 */

package com.meta.vehicledekho.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meta.vehicledekho.Exception.MetaVehicleException;
import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.db.helper.CarDbHelper;
import com.meta.vehicledekho.db.helper.VehicleDbHelper;
import com.meta.vehicledekho.model.Car;
import com.meta.vehicledekho.model.Vehicle;
import com.meta.vehicledekho.service.VehicleDekhoService;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int vehicleId = Integer.parseInt(request.getParameter("vehicle_id"));
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(vehicleId);
		try {
			VehicleDekhoService vehicleService = new VehicleDekhoService();
			Vehicle car = vehicleService.getVehicleDetailsService(vehicle);
			request.setAttribute("details", car);
		}
		catch(MetaVehicleSystemException e) {
			System.out.println("Failed to load details of the requested vehicle" + e.getMessage());
		}
		request.getRequestDispatcher("/view/Edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int vehicle_id = Integer.parseInt(request.getParameter("vehicle_id"));
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		int engine = Integer.parseInt(request.getParameter("engine"));
		int fuel = Integer.parseInt(request.getParameter("fuel"));
		int milage = Integer.parseInt(request.getParameter("milage"));
		float price = Float.parseFloat(request.getParameter("price"));
		float roadTax = Float.parseFloat(request.getParameter("road-tax")); 
		String ac = request.getParameter("ac");
		String steering = request.getParameter("steering");
		String kit = request.getParameter("kit");
		Vehicle car = new Car();
		car.setVehicleId(vehicle_id);
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
		VehicleDekhoService vehicleService = new VehicleDekhoService();
		try {
			vehicleService.editVehicleService(car);
		} catch (MetaVehicleSystemException e) {
			System.out.println("Failed to edit the requested vehicle" + e.getMessage());
		}
		response.sendRedirect("/CaseStudy-Phase-4/view/Home.jsp");
	}

}