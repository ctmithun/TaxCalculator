/**
 * 
 */
package com.sprsec.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprsec.model.User;

/**
 * @author CTM
 *
 */
@Controller
public class AddUserController {
	
	@RequestMapping(value="/admin/user/add", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("newUser") User user, Map<String, Object> model) {
		
		
		return null;
	}
}
