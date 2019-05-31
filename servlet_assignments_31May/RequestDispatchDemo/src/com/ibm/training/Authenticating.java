package com.ibm.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticating extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter write = response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("userName");
		String password = request.getParameter("pass");
		DaoClass dao = new DaoClass();
		boolean result = dao.fetchDetails(user,password);
		
		if(user.trim() == "") {
			write.println("User name can't be empty");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/form.html");
			dispatcher.include(request, response);
		}
		else if(result) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/success");
			dispatcher.include(request, response);
		}
		else {
			write.println("Invalid user name or password");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/form.html");
			dispatcher.include(request, response);
		}
			
		
//		if(user.trim() == "") {
//			write.println("User name can't be empty");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/form.html");
//			dispatcher.include(request, response);
//		}
//		
//		else if(user.equals("Naina@123")) {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/success");
//			dispatcher.include(request, response);
//		}
//		
//		else {
//			write.println("Invalid user name");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/form.html");
//			dispatcher.include(request, response);
//		}
	}

}
