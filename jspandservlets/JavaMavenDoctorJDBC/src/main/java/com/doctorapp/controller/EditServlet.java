package com.doctorapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/editDoctor")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IDoctorService doctorService = new DoctorServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Doctor doctor = null;
		String docId = request.getParameter("docId");
		Integer doctorId = Integer.parseInt(docId);
		try {
			doctor = doctorService.getDoctorById(doctorId);
			request.setAttribute("doctorObj", doctor);
			RequestDispatcher dispatcher = request.getRequestDispatcher("updateDoctor.jsp");
			dispatcher.forward(request, response);
			System.out.println(doctorService.getDoctorById(doctorId));
		} catch (Exception e) {
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
