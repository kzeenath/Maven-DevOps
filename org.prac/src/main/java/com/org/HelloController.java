package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.model.User;

@Controller
@RequestMapping("/hello")
public class HelloController {


	@GetMapping("/greeting")
	public ModelAndView greetUser() {
	ModelAndView modelAndView = new ModelAndView("greeting");
	modelAndView.addObject("message", "Hello user");
	return modelAndView;

	}

	@GetMapping("/addUser")
	public String getUserForm() {
		return "registerUser";
	}

	@PostMapping("/addUser")
	public ModelAndView addUser(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("email", user.getEmail());
		return modelAndView;
	}

}


