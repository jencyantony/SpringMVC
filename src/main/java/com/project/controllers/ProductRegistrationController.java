package com.project.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.beans.ProductRegistration;
import com.project.servicedelegates.ProductDelegate;

@Controller
@RequestMapping("/registerProduct")
public class ProductRegistrationController {

	@Autowired
	private ProductDelegate productDelegate;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView doGet(Model model){
		return new ModelAndView("registerProduct", "registerProduct", new ProductRegistration());
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView doPost(@ModelAttribute("registerProduct") @Valid ProductRegistration product, BindingResult result,
	        final RedirectAttributes redirectAttributes){
		
		if(result.hasErrors()){
			return new ModelAndView("registerProduct", "registerProduct", product);
		}
		ProductRegistration registeredProduct = productDelegate.registerProduct(product);
		redirectAttributes.addFlashAttribute("registeredProduct", registeredProduct);
		return new ModelAndView("redirect:registrationSuccess");
	}
}
