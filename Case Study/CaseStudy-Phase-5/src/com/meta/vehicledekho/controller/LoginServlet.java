
/**
 * @class  LoginServlet
 * @extend HttpServlet
 * @author Pulkit
 * @since  26th October 15
 * This class implements Login servlet.
 */

package com.meta.vehicledekho.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.helper.UserTypeEnum;
import com.meta.vehicledekho.model.User;
import com.meta.vehicledekho.service.VehicleDekhoService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		boolean loginStatus = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(UserTypeEnum.admin);
		VehicleDekhoService userService = new VehicleDekhoService();
		try {
			loginStatus = userService.loginService(user);
		}
		catch(MetaVehicleSystemException e) {
			System.out.println("Failed to login. Something went wrong" + e.getMessage());
		}
		if(loginStatus) {
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(1*60);
			session.setAttribute("admin", username);
			response.sendRedirect("/CaseStudy-Phase-4/view/Home.jsp");
		}
		else {
			response.sendRedirect("/CaseStudy-Phase-4/view/Home.jsp");
		}
	}

}
