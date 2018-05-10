package com.s2it.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.s2it.auth.utils.AuthUtils;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "redirect:/public/home";
	}

	@RequestMapping("/auth/hello")
	public String hello(Model model) {
		model.addAttribute("loggedUsername", AuthUtils.getUsernameFromLoggedUser());
		return "hello";
	}

	@RequestMapping("/auth/admin")
	public String admin(Model model) {
		model.addAttribute("loggedUsername", AuthUtils.getUsernameFromLoggedUser());
		return "admin";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/public/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/auth/403")
	public String error(Model model) {
		model.addAttribute("loggedUsername", AuthUtils.getUsernameFromLoggedUser());
		return "403";
	}

}
