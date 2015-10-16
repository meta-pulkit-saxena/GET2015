
/**
 * @class  ToEmployeeRegistration
 * @author Pulkit
 * @since  16th October 15
 * @extend HttpServlet
 * This class implements the servlet to call the registration.jsp
 */

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ToEmployeeRegistration")
public class ToEmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * This is a default constructor.
     */
	
    public ToEmployeeRegistration() {
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
		request.getRequestDispatcher("/view/registration.jsp").forward(request, response);
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
		request.getRequestDispatcher("/view/registration.jsp").forward(request, response);
	}

}
