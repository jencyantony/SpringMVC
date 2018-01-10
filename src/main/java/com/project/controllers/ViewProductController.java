package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.beans.ProductRegistration;
import com.project.servicedelegates.ProductDelegate;

@Controller
@RequestMapping("/viewYourProduct")
public class ViewProductController {

	@Autowired
	private ProductDelegate productDelegate;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doGet(Model model) {
		return new ModelAndView("viewYourProduct", "product", new ProductRegistration());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doPost(@ModelAttribute("product") ProductRegistration product,
			final RedirectAttributes redirectAttributes) {

		ProductRegistration productDetails = productDelegate.getProductDetails(product.getRegistrationId());
		redirectAttributes.addFlashAttribute("product", productDetails);
		return new ModelAndView("redirect:product");
	}
}
