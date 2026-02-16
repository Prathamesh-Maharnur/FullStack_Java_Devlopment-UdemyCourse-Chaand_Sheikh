package org.maharnur.prathamesh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.maharnur.prathamesh.entity.User;
import org.maharnur.prathamesh.model.UsersModel;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/site")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String path = request.getParameter("page").toLowerCase();
		
		switch(path) {
			case "listusers":
				listusers(request,response);
				break;
			case "adduser":
				addUser(request,response);
				break;
			case "updateuser":
				updateuser(request,response);
				break;
			default:
				request.setAttribute("title","error page");
				request.getRequestDispatcher("error.jsp").forward(request, response);
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String form = request.getParameter("form").toLowerCase();
		switch(form) {
			case "adduseroperation":
				User user = new User(request.getParameter("user_name"), request.getParameter("email_id"));
				new UsersModel().addUser(user);
				listusers(request, response);
				break;
				
			case "updateuseroperation":
				User update_user = new User(Integer.parseInt(request.getParameter("user_id")), request.getParameter("user_name"), request.getParameter("email_id"));
				new UsersModel().updateUser(update_user);
				listusers(request,response);
				break;
		}
	}
	
	protected void listusers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title","List Users");
		List<User> users = new UsersModel().listuser();
		request.setAttribute("listusers",users);
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
	}
	
	protected void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title","Add User");
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
	
	protected void updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("title", "Update user");
		request.getRequestDispatcher("updateuser.jsp").forward(request, response);
	}

}
