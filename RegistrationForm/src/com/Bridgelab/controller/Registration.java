package com.Bridgelab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bridgelab.Repository.UserRepository;
import com.Bridgelab.model.user;
import com.Bridgelab.service.UserService;
import com.Bridgelab.service.Userimp;
import com.Bridgelab.utilituy.util;


public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Registration() {
        super();

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		UserService us = new Userimp();
		String email=request.getParameter("Email");
		String pwd=request.getParameter("pwd");
		String mob=request.getParameter("mob");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
	    util u=new util();
	    if(u.validateEmail(email)) {
		user person=new user(email,pwd,mob,fname,lname);
		if(us.createUser(person)>0)
			out.println("sucsessfull");
	}
	    else 
	    {
	    	out.println("enter valid Email");
	    }
	}

}
