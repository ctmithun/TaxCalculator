package com.sprsec.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprsec.model.Employee;
import com.sprsec.model.User;


@Controller
public class LinkNavigation {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/sec/moderation", method=RequestMethod.GET)
	public ModelAndView moderatorPage() {
		return new ModelAndView("moderation");
	}
	
	@RequestMapping(value="/admin/first", method=RequestMethod.GET)
	public ModelAndView firstAdminPage() {
		Employee emp = new Employee();
		ModelAndView model = new ModelAndView("admin-first");
		model.addObject("employee", emp);
		return model;
	}
	
	@RequestMapping(value="/admin/addEmployee", method=RequestMethod.GET)
	public ModelAndView addEmployeePage() {
		Employee emp = new Employee();
		ModelAndView model = new ModelAndView("add-employee");
		model.addObject("employee", emp);
		return model;
	}
	
	@RequestMapping(value="/changePassword", method=RequestMethod.GET)
	public ModelAndView changePasswordPage() {
		User user = new User();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		ModelAndView model = new ModelAndView("change-password");
		return model;
	}
	
	@RequestMapping(value="/admin/second", method=RequestMethod.GET)
	public ModelAndView secondAdminPage() {
		User user = new User();
		ModelAndView model = new ModelAndView("admin-second");
		model.addObject("newUser", user);
		return model;
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/user-login.html";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
}
