package com.Bridgelab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bridgelab.Repository.UserRepository;
import com.Bridgelab.model.user;
import com.Bridgelab.service.UserService;
import com.Bridgelab.service.Userimp;


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public login() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		UserService us = new Userimp();
		String email=request.getParameter("Email");
		String pwd=request.getParameter("pwd");
		UserRepository ur=new UserRepository();
		PrintWriter ot = response.getWriter();
		try {
			ur.login(email, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(ur.login(email, pwd))
			{
			out.print("Welcome"+email);
			HttpSession session = request.getSession();
			session.setAttribute("Email", email);
			request.setAttribute("Email", email);
			response.sendRedirect("welcome.jsp");
		}
			else
			{
				out.print("<html><h1 style='color:white'>Enter valid email & password... </h1></html>");
				rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
