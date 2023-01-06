package com.web.gmail;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username =req.getParameter("txtUsername");
		String password =req.getParameter("txtpassword");
		System.out.println("username"+username +"password="+password);
		RequestDispatcher rd=req.getRequestDispatcher("/Success.jsp");
		rd.forward(req, resp);
		
	}

	
	

}
