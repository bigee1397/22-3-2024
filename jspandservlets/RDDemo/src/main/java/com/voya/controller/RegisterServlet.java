package com.voya.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String empName = request.getParameter("employeeName");
		String empCity = request.getParameter("city");
		double salary = Double.parseDouble(request.getParameter("salary"));
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String course = request.getParameter("course");
		String[] hobbies = request.getParameterValues("hobby");
		
		request.setAttribute("employeeName", empName);
		request.setAttribute("employeeCity", empCity);
		request.setAttribute("employeeSalary", salary);
		request.setAttribute("employeeMobile", mobile);
		request.setAttribute("employeeCourse", course);
		request.setAttribute("employeeHobbies", hobbies);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
//		
//		response.sendRedirect("success.jsp");
//		PrintWriter printWriter = response.getWriter();
//		printWriter.print("Employee Name is " + empName + "<br>");
//		printWriter.print("Employee City is " + empCity + "<br>");
//		printWriter.print("Employee Salary is " + salary + "<br>");
//		printWriter.print("Employee Mobile number is " + mobile + "<br>");
//		printWriter.print("Employee Course is " + course+ "<br>");
//		printWriter.print("Hobbies of " + empName + " are: ");
//		
//		for (String hobby : hobbies) {
//			printWriter.print(hobby + " ");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
