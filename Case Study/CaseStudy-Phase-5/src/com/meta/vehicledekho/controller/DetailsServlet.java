
/**
 * @class  DetailsServlet
 * @extend HttpServlet
 * @author Pulkit
 * @since  26th October 15
 * This class implements details servlet.
 */

package com.meta.vehicledekho.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.db.helper.VehicleDbHelper;
import com.meta.vehicledekho.model.Car;
import com.meta.vehicledekho.model.Vehicle;
import com.meta.vehicledekho.service.VehicleDekhoService;

/**
 * Servlet implementation class DetailsServlet
 */
@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsServlet() {
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
		VehicleDekhoService vehicleService = new VehicleDekhoService();
		try {
			Vehicle car = vehicleService.getVehicleDetailsService(vehicle);
			request.setAttribute("details", car);
		}
		catch(MetaVehicleSystemException e) {
			System.out.println("Failed to load the details of the requested vehicle" + e.getMessage());
		}
		request.getRequestDispatcher("/view/Details.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
