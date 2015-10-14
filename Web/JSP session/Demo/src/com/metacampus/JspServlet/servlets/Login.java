
/**
 * @class  Login
 * @author Pulkit
 * @since  14th October 15
 * @extends HttpServlet
 * This class implements the login servlet.
 */

package com.metacampus.JspServlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.metacampus.JspServlet.database.DatabaseQueries;
import com.metacampus.JspServlet.modal.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("user-name");
		String password = request.getParameter("password");
		User logUser = new User(userName, password);
		DatabaseQueries queryObject = new DatabaseQueries();
		boolean status = queryObject.matchUserInDatabase(logUser);
		if(status) {
			String message="Successful Login";
			request.setAttribute("message", message);
			request.getRequestDispatcher("jsp/PrintMessage.jsp").forward(request, response);	
		}
		else {
			response.sendRedirect("jsp/Login.jsp");
		}
	}

}
