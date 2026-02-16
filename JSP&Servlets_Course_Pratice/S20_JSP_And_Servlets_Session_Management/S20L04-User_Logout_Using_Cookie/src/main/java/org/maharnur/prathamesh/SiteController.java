package org.maharnur.prathamesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user-name");
		String userPassword = request.getParameter("user-password");
		
		if(userName.equals("Prathamesh") && userPassword.equals("12345")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			Cookie cookie = new Cookie("user-name",userPassword);
			response.addCookie(cookie);
			response.sendRedirect("member.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
