
/**
 * @class  LandingPageController
 * @author Pulkit
 * @since  16th October 15
 * @extend HttpServlet
 * This class implements the servlet which is loaded the very first application starts.
 * It passes on the description string to the landingPage.jsp as an attribute.
 */

package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LandingPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * This is a default constructor.
     */
	
    public LandingPageController() {
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
		String Description = "Metacube is a software engineering services company that has "
				+ "deep experience in developing enterprise level products and applications for a "
				+ "wide spectrum of domains including global trade management, supply chain "
				+ "analytics, manufacturing analytics, business continuity planning, CRM, "
				+ "publishing and eCommerce. These applications have been developed on a variety of "
				+ "platforms. The common denominator in all our services has been our total customer "
				+ "focus, ensuring that each engagement is a success and provides the desired value "
				+ "to the customer.";
		RequestDispatcher requestDispatcher;
		request.setAttribute("description",Description );
		requestDispatcher = request.getRequestDispatcher("/view/landingPage.jsp");
		requestDispatcher.forward(request, response);
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
