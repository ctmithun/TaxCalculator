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

import com.sprsec.model.Employee;

/**
 * @author CTM
 *
 */
@Controller
public class AddEmployee {

	@RequestMapping(value = "/admin/employee/add", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee emp, Map<String, Object> model) {

		
		return null;
		
	}

}
