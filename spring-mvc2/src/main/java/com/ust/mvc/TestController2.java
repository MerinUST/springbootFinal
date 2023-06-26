package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proffession")
public class TestController2 {
	@GetMapping
	public String respond(Model model) {
		model.addAttribute("myTech","Java Developer");
		model.addAttribute("myLocation","Kerala");
		return "response2"; //views
	}
	

}
