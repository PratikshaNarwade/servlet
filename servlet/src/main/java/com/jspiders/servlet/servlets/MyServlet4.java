package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet4")
public class MyServlet4 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Hello World!</h1>");
		
	}
	
	protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException {
		doPost(req,resp);
	}
}
