package com.example.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("Name", "ContactManager");
		model.addAttribute("role","Manage your contact details!!");
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("FirstName", "David");
		model.addAttribute("LastName","Henry");
		model.addAttribute("ContactNo", "5765428236");
		model.addAttribute("User","ADMIN");
		
		return "register";
	}
}
