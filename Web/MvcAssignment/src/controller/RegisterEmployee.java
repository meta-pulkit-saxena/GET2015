
/**
 * @class  RegisterEmployee
 * @author Pulkit
 * @since  16th October 15
 * @extend HttpServlet
 * This class implements the servlet to fetch data of the employee from register.jsp to be added
 * to the cache.
 */

package controller;

import helper.EmployeeCache;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/RegisterEmployee")
public class RegisterEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * This is a default constructor.
     */
	
    public RegisterEmployee() {
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
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String name = request.getParameter("name").toString();
		String email = request.getParameter("email").toString();
		int age =  Integer.parseInt(request.getParameter("age"));
		int employeeId = Integer.parseInt(request.getParameter("id"));
		String dateOfRegistration = dateFormat.format(date);
		Employee employee = new Employee(name, email, age, employeeId, dateOfRegistration);
		EmployeeCache cacheObject = EmployeeCache.getEmployeeCacheObject();
		cacheObject.addEmployee(employee);
		request.getRequestDispatcher("/MvcAssignment/EmployeeList").forward(request, response);
	}

}
