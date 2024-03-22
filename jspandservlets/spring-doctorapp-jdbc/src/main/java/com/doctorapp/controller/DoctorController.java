package com.doctorapp.controller;

import com.doctorapp.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctorapp.service.IDoctorService;

@Controller
public class DoctorController {
	
	@Autowired
	IDoctorService doctorService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Doctor> doctors = doctorService.getAll();
		model.addAttribute("doctors",doctors);
		return "home";
	}
	
	@RequestMapping("/addDoctor")
	public String addDoctor(Doctor doctor, Model model) {
		System.out.println(doctor);
		doctorService.addDoctor(doctor);
		model.addAttribute("message", "Doctor added Successfully");
		return "admindashboard";
	}
	
	@RequestMapping("/editDoctor")
	public String editDoctor(@RequestParam("doctorId") int doctorId, Model model) {
		Doctor doctor = doctorService.getDoctorById(doctorId);
		model.addAttribute("doctorObj", doctor);
		return "updateDoctor";
	}
	
	@RequestMapping("/updateDoctor")
	public String updateDoctor(@RequestParam("doctorId") int doctorId, @RequestParam("consultationFees") double consultationFees, Model model) {
		doctorService.updateDoctor(consultationFees, doctorId);
		model.addAttribute("message", "Doctor updated Successfully");
		return "admindashboard";
	}
	
	@RequestMapping("/deleteDoctor")
	public String deleteDoctor(@RequestParam("doctorId") int doctorId, Model model) {
		doctorService.deleteDoctor(doctorId);
		model.addAttribute("message", "Doctor deleted Successfully");
		return "admindashboard";
	}
	
	@RequestMapping("/searchDoctor")
	public String searchDoctor(@RequestParam("speciality") String choice, Model model) {
		List<Doctor> doctorsBySpecs = doctorService.getBySpeciality(choice);
		model.addAttribute("message", doctorsBySpecs);
		return "home";
	}
	
}


