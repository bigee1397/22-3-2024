package com.doctorapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/deleteDoctor")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDoctorService doctorService = new DoctorServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String docId = request.getParameter("docId");
		Integer doctorId = Integer.parseInt(docId);
		
		try {
			doctorService.deleteDoctor(doctorId);
			RequestDispatcher dispatcher = request.getRequestDispatcher("admindashboard.jsp"); 
			dispatcher.include(request, response);
			writer.print("<center><p style=\"color:red;\">Doctor Deleted Successfully</p></center>");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
