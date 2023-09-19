package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class StudentSave extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long contact = Long.parseLong(req.getParameter("contact"));
		String[] courses = req.getParameterValues("course");
		
		writer.println("<h1>Student Information</h1>");
		writer.println("<h1>name : " + name + "</h1>");
		writer.println("<h1>Email : " + email + "</h1>");
		writer.println("<h1>Contact : " + contact + "</h1>");
		writer.println("<h1>Courses : </h1>");
		if(courses != null) {
		for(String course : courses) {
			writer.println("<h2>" + course + "</h2>");
		}
		} else {
			writer.println("Courses Not Available!");
		}
	}

}
