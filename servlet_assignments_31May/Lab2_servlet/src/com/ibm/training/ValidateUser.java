package com.ibm.training;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/validate")
public class ValidateUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String,String> userDetails = new HashMap<String,String>();
		userDetails.put("Naina","2212");
		userDetails.put("Divya","1804");
		userDetails.put("Selvi","2205");
		
		RequestDispatcher dispatch = request.getRequestDispatcher("index.html");
		
		int flag = 0;
		
		for (Map.Entry user : userDetails.entrySet()) {
			if(request.getParameter("userName").equals(user.getKey())) {
				flag = 1;
				if(request.getParameter("pass").equals(user.getValue())) {
					response.getWriter().println("Success");
					dispatch.include(request, response);
				}
				else {
					response.getWriter().println("Failure");
					dispatch.include(request, response);
				}
			}
			
		}
		
		if(flag == 0) {
			response.getWriter().println("Failure");
			dispatch.include(request, response);
		}

	}
}


