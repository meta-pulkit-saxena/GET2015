
/**
 * @class  EmployeeDetails
 * @author Pulkit
 * @since  16th October 15
 * @extend HttpServlet
 * This class implements the servlet to fetch the data of the employee to be displayed
 * and it passes it on to the details.jsp view to display the details of the employee. 
 */

package controller;

import helper.EmployeeCache;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * This is a default constructor.
     */
	
    public EmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * This function overrides the doGet function HttpServlet.
	 * @param{HttpServletRequest} request
	 * @param{HttpServletResponse} response
	 * @overrides doGet()
	 * @throws ServletException, IOException
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeCache cacheObject = EmployeeCache.getEmployeeCacheObject();
		Employee employeeDetail = cacheObject.getEmployeeForId(id);
		request.setAttribute("employee", employeeDetail);
		request.getRequestDispatcher("/view/Details.jsp").forward(request, response);
		
		
	}
	
	/**
	 * This function overrides the doPost function HttpServlet.
	 * @param{HttpServletRequest} request
	 * @param{HttpServletResponse} response
	 * @overrides doPost()
	 * @throws ServletException, IOException
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
