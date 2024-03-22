package com.employeeapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * response.setContentType("text/html"); PrintWriter writer
		 */
		
		Employee employee = new Employee();
		
		employee.setEmployeeName(request.getParameter("employeeName"));
		employee.setEmlpoyeeId(Integer.parseInt(request.getParameter("employeeId")));
		employee.setEmployeeCity(request.getParameter("emlpoyeeCity"));
		employee.setEmployeeSalary(Double.parseDouble(request.getParameter("emlpoyeeSalary")));
		employee.setEmployeeCourse(request.getParameter("employeeCourse"));
		
		request.setAttribute("employeeObject", employee);
		
		RequestDispatcher rd = request.getRequestDispatcher("employeeDetails.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
