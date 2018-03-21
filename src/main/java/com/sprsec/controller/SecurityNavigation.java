package com.sprsec.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityNavigation {
	
	@RequestMapping(value="/user-login", method=RequestMethod.GET)
	public ModelAndView loginForm() {
		return new ModelAndView("login-form");
	}
	
	@RequestMapping(value="/error-login", method=RequestMethod.GET)
	public ModelAndView invalidLogin() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}
	
	@RequestMapping(value="/success-login", method=RequestMethod.GET)
	public ModelAndView successLogin(HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        request.getSession().setAttribute("username", auth.getName());
	    }
		return new ModelAndView("home");
	}

}
