package com.doctorapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String admin() {
		return "adminlogin";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password) {
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			return "admindashboard";
		}
		return "adminlogin";
	}

	@RequestMapping("/add-doctor-form")
	public String addDoctor() {
		return "addDoctor";
	}
	
	@RequestMapping("/edit-doctor-form")
	public String editDoctor() {
		return "editDoctor";
	}

	@RequestMapping("/delete-doctor-form")
	public String deleteDoctor() {
		return "deleteDoctor";
	}
	
	
}
