
/**
 * @class  EmployeeList
 * @author Pulkit
 * @since  16th October 15
 * @extend HttpServlet
 * This class implements the servlet to fetch id, name and email of all employee to be listed 
 * as list on ListPage.jsp and and passes on the list as an attribute to the LsitPage.jsp. 
 */

package controller;

import helper.EmployeeCache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/EmployeeList")
public class EmployeeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * This is a default constructor.
     */
	
    public EmployeeList() {
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
		EmployeeCache cacheObject = EmployeeCache.getEmployeeCacheObject();
		Collection<Employee> collectionOfValues = cacheObject.getAllEmployee();
		List<Employee> listOfEmployee = new ArrayList(collectionOfValues);
		request.setAttribute("employeeList", listOfEmployee);
		request.getRequestDispatcher("/view/ListPage.jsp").forward(request, response);
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
