package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		response.getWriter().println("Your session id is: " +session.getId() + "<br>" );
		
		Object parameter = request.getParameter("param");
		
		session.setAttribute("param", parameter);
				
		response.getWriter().println("Session attribute is: " + parameter);
	}
}
