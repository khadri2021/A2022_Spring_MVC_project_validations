package com.khadri.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.khadri.spring.mvc.form.LoginForm;

@Controller
public class LoginController {

	@GetMapping("/")
	public String getHomePage(@ModelAttribute("loginForm")LoginForm loginForm) {
 		return "login";
	}

	@PostMapping("/loginApp")
	public String login(@Valid  @ModelAttribute("loginForm")LoginForm loginForm,BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("Your form have errors");
			result.getAllErrors().stream().forEach(System.out::println);
			
			return "login";
		}
		
		return "success";
	}

}
