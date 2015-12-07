
/**
 * @class  SearchServlet
 * @extend HttpServlet
 * @author Pulkit
 * @since  26th October 15
 * This class implements Search servlet.
 */


package com.meta.vehicledekho.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.model.Vehicle;
import com.meta.vehicledekho.service.VehicleDekhoService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VehicleDekhoService vehicleDekhoService = new VehicleDekhoService();
		try {
			List<String> makeArray = vehicleDekhoService.getDistinctMake();
			request.setAttribute("make", makeArray);
		}
		catch(MetaVehicleSystemException e) {
			System.out.println("failed to load the different available make from db" + e.getMessage());
		}
		request.getRequestDispatcher("/view/Search.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String make = request.getParameter("make");
		Vehicle vehicle = new Vehicle();
		vehicle.setMake(make);
		VehicleDekhoService vehicleService = new VehicleDekhoService();
		VehicleDekhoService vehicleDekhoService = new VehicleDekhoService();
		try {
			List<Vehicle> vehicleList = vehicleService.getMakeAndModel(vehicle);
			request.setAttribute("vehicleList", vehicleList);
			List<String> makeArray = vehicleDekhoService.getDistinctMake();
			request.setAttribute("make", makeArray);
		} 
		catch(MetaVehicleSystemException e) {
			System.out.println("Failed to load the details of the make and model" + e.getMessage());
		}
		request.getRequestDispatcher("/view/Search.jsp").forward(request, response);
	}

}
