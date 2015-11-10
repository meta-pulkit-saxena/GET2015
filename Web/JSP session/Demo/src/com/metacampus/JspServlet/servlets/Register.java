
/**
 * @class  Register
 * @author Pulkit
 * @since  14th October 15
 * @extends HttpServlet
 * This class implements the register servlet.
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

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Register() {
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
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("user-name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		User newUser = new User(userName,password, email);
		DatabaseQueries queryObject = new DatabaseQueries();
		boolean status = queryObject.insertUserIntoDatabase(newUser);
		if(status) {
			System.out.println("In");
			//request.getRequestDispatcher("jsp/Login.jsp").forward(request, response);
			response.sendRedirect("jsp/Login.jsp");
		}
		else {
			out.print("Error Occurred in registration ");
		}
	}
}
