
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
import com.meta.vehicledekho.db.helper.SearchDbHelper;
import com.meta.vehicledekho.db.helper.VehicleDbHelper;
import com.meta.vehicledekho.model.Vehicle;

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
		SearchDbHelper searchDb = new SearchDbHelper();
		List<String> makeArray = searchDb.retreiveDistinctMake();
		request.setAttribute("make", makeArray);
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
		VehicleDbHelper vehicleDb = new VehicleDbHelper();
		List<Vehicle> vehicleList = vehicleDb.getMakeAndModel(vehicle);
		request.setAttribute("vehicleList", vehicleList);
		SearchDbHelper searchDb = new SearchDbHelper();
		List<String> makeArray = searchDb.retreiveDistinctMake();
		request.setAttribute("make", makeArray);
		request.getRequestDispatcher("/view/Search.jsp").forward(request, response);
	}

}
