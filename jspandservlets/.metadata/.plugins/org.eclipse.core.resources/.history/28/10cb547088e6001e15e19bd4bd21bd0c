package com.doctorapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class SearchServlet
 */
@WebServlet("/searchDoctorSpeciality")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IDoctorService doctorService = new DoctorServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String searchParam = request.getParameter("speciality");
		List<Doctor> listDoctors = null;
		
		System.out.println(searchParam);
		try {
			request.setAttribute("doctors", listDoctors);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
			
			listDoctors = doctorService.getBySpeciality(searchParam);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		writer.println("<table align=\"left\" style=\"margin-top:40px;\" border=\"1\">\r\n" + 
				"					<tr>\r\n" + 
				"						<td><b>Doctor ID</b></td>\r\n" + 
				"						<td><b>Doctor Name</b></td>\r\n" +
				"						<td><b>Doctor Fees</b></td>\r\n" +
				"						<td><b>Doctor Speciality</b></td>\r\n" +
				"						<td><b>Doctor Ratings</b></td>\r\n" +
				"						<td><b>Doctor Experience</b></td>\r\n" + 
				"					</tr>\r\n");
		for(Doctor doctor : listDoctors ) {	
			writer.print("<tr>\r\n" + 
					"<td>" + doctor.getDoctorId() + "</td>\r\n" + 
					"<td>" + doctor.getDoctorName() + "</td>\r\n" + 
					"<td>" + doctor.getConsultationFees() + "</td>\r\n" + 
					"<td>" + doctor.getSpeciality() + "</td>\r\n" + 
					"<td>" + doctor.getRatings() + "</td>\r\n" + 
					"<td>" + doctor.getExperience() + "</td>\r\n" + 
					"</tr>\r\n");				
		}
					writer.print("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
