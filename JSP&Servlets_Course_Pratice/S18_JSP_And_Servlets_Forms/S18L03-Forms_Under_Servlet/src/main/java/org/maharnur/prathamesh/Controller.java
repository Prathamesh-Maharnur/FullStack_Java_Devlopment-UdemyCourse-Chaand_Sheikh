package org.maharnur.prathamesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Controller
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("user-name"));
		response.getWriter().println(request.getParameter("gender-type"));
		
		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("languages");
		if(languages!=null) {
			for(int i=0; i<languages.length; i++) {
				out.println(languages[i]);
				out.print("\n");
			}
		}else {
			out.println("None selected");
		}
		
		response.getWriter().println(request.getParameter("country"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().println(request.getParameter("user-name"));
//		response.getWriter().println(request.getParameter("gender-type"));
//		
//		PrintWriter out = response.getWriter();
//		String[] languages = request.getParameterValues("languages");
//		if(languages!=null) {
//			for(int i=0; i<languages.length; i++) {
//				out.println(languages[i]);
//				out.print("\n");
//			}
//		}else {
//			out.println("None selected");
//		}
//		
//		response.getWriter().println(request.getParameter("country"));
//	}

}
