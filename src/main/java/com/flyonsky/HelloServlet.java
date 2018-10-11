package com.flyonsky;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3951835265443861926L;
	
	private HelloWorld service;
	
	@Inject
	public HelloServlet(HelloWorld helloWorld) {
		service = helloWorld;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=service.sayHello();
		Map<String,String[]> pams = req.getParameterMap();
		if(name==null||name.length()<1)name="Guest";
		resp.getWriter().append(String.format("Hello, %s. %s -> sessionId=%s,hashCode=%d ", name,new Date(),req.getSession().getId(),hashCode()));
	}

}
