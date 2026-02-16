package org.prathamesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param = request.getParameter("page");
		if(param.equals("login")) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
		}else if(param.equals("signUp")) {
			getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
		}else if(param.equals("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request,response);
		}else {
			getServletContext().getRequestDispatcher("/default.jsp").forward(request,response);
		}
	}
}
