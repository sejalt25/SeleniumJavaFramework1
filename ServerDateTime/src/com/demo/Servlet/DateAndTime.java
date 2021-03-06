package com.demo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateAndTime extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		java.util.Date date=new java.util.Date();
		out.println("Current Date & Time" +date.toString());
		RequestDispatcher rd=forward(request,response);
		out.println("DateTime.jsp");
	}
}
