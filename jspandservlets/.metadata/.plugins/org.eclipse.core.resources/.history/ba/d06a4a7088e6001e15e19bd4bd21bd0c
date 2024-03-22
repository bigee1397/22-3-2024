package com.doctorapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddDoctor
 */
@WebServlet("/addDoctor")
public class AddDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IDoctorService doctorService = new DoctorServiceImpl();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDoctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String doctorName = request.getParameter("docName");
		String spec = request.getParameter("speciality");
		String speciality = Specialization.valueOf(spec).getSpeciality();
		double fees = Double.parseDouble(request.getParameter("fees"));
		int experience = Integer.parseInt(request.getParameter("experience"));
		int ratings = Integer.parseInt(request.getParameter("ratings"));
		
		Doctor doctor = new Doctor();
		doctor.setDoctorName(doctorName);
		doctor.setSpeciality(speciality);
		doctor.setConsultationFees(fees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		
		doctorService.addDoctor(doctor);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("admindashboard.jsp"); 
		dispatcher.include(request, response);
		writer.print("<center><p style=\"color:green;\">Doctor Deleted Successfully</p></center>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
