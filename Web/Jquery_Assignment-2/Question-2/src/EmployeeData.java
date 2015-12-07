
/**
 * @class  EmployeeData
 * @author Pulkit
 * @since 30 October,2015
 * This class defines the servlet for serving the employee data to the ajax request.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeData")

public class EmployeeData extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeData()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String empName = request.getParameter("name");
		String detail = "";
		switch(empName)
		{
		case "Pulkit": detail="Name: Pukit Age:46 Dob:21-09-1972  Address:xyz";break;
		case "Nishant": detail="Name: Nishant Age:29 Dob:01-09-1922  Address:yzx";break;
		case "Himanshu": detail="Name: Himanshu Age:22 Dob:15-08-1947  Address:zxy";break;
		}
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(detail);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
