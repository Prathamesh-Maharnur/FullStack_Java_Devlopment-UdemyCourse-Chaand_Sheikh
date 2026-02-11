package org.maharnur.prathamesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementaticcon class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter();
		response.getWriter().println((request.getParameter("user-name")+"<br/>"));
		response.getWriter().println((request.getParameter("gender-type")+"<br/>"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("languages");
		if(languages!=null) {
			for(String lan: languages) {
				out.println(lan);
				out.println("<br/>");
			}
		}else {
			out.println("<br/>None Selected");
		}
		out.println("<br/>");
		
		out.println(request.getParameter("country"));
		
	}

}
