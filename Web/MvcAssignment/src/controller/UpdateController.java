
/**
 * @class  UpdateController
 * @author Pulkit
 * @since  16th October 15
 * @extend HttpServlet
 * This class implements the servlet to take all the data from form and update the employee 
 * in the employee cache corresponding to that employee id.
 */

package controller;

import helper.EmployeeCache;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * This is a default constructor.
     */
	
    public UpdateController() {
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
		PrintWriter out =  response.getWriter();
		int employeeId = Integer.parseInt(request.getParameter("id"));
		EmployeeCache cacheObject = EmployeeCache.getEmployeeCacheObject();
		Employee oldEmployee = cacheObject.getEmployeeForId(employeeId);
		String name = request.getParameter("name").toString();
		String email = request.getParameter("email").toString();
		int age =  Integer.parseInt(request.getParameter("age"));
		oldEmployee.setName(name);
		oldEmployee.setEmail(email);
		oldEmployee.setAge(age);
		cacheObject.addEmployee(oldEmployee);
		response.sendRedirect("EmployeeList");
	}
}
