package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.beans.ProductRegistration;

@Controller
@RequestMapping("/registrationSuccess")
public class ProductRegistrationSuccessController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView doGet(@ModelAttribute("registeredProduct") ProductRegistration registeredProduct){
		
		return new ModelAndView("registrationSuccess", "registeredProduct", registeredProduct);
	}
}
