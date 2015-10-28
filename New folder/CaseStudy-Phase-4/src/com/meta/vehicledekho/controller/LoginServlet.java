
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
import com.meta.vehicledekho.db.helper.UserDbHelper;
import com.meta.vehicledekho.helper.UserTypeEnum;
import com.meta.vehicledekho.model.User;

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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDbHelper userDb = new UserDbHelper();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(UserTypeEnum.admin);
		boolean result = userDb.login(user);
		if(result) {
			HttpSession session = request.getSession(true);
			session.setAttribute("admin", username);
			response.sendRedirect("/CaseStudy-Phase-4/view/Home.jsp");
		}
		else {
			response.sendRedirect("/CaseStudy-Phase-4/view/Home.jsp");
		}
	}

}
