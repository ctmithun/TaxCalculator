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

import com.sprsec.model.Allowance;
import com.sprsec.model.Employee;
import com.sprsec.model.Taxable;

/**
 * @author CTM
 *
 */
@Controller
public class CalculateTaxController {
	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public ModelAndView processRegistration(@ModelAttribute("employee") Employee emp, Map<String, Object> model) {

		// implement your own registration logic here...

		// for testing purpose:
		Taxable taxable = mapTaxableAmount(emp);
		double taxableSum = calculateSum(taxable);
		double taxBracket = taxableSum > 250000 ? taxableSum / 500000 : -1;
		double tax = calculateTax(taxableSum, taxBracket);
		ModelAndView modelView = new ModelAndView("admin-first");
		emp.setTaxable(taxable);
		modelView.addObject("employee", emp);
		modelView.addObject("taxableSalary", taxableSum);
		modelView.addObject("tax", tax);
		return modelView;
	}

	private double calculateTax(double taxableSum, double slab) {
		switch ((int) slab) {
		case -1:
			slab = 0;
			break;
		case 0:
			slab = taxableSum * 0.1;
			break;
		case 1:
			if(taxableSum > 500000) {
				slab = (taxableSum - 500000) * 0.2;
				slab = 25000 + slab;
			} else {
				slab = 25000;
			}
			
			break;
		default:
			if(taxableSum > 1000000) {
				slab = 25000 + 50000;
				slab = ((taxableSum - 1000000) * 0.3) + slab;
			} else {
				slab = 25000 + 50000;
			}
			break;
		}
		return slab;
	}

	private double calculateSum(Taxable taxable) {
		return taxable.getHra() + taxable.getLta() + taxable.getMedicalBills() + taxable.getOtherAllowance()
				+ taxable.getSalary() + taxable.getSpecialAllowance() + taxable.getTransportAllowance();
	}

	private Taxable mapTaxableAmount(Employee emp) {
		Taxable tax = new Taxable();
		Allowance allowance = new Allowance();
		tax.setSalary(emp.getSalary());
		double value = emp.getHra() - Allowance.HRA;
		tax.setHra(value > 0 ? value : 0);
		value = emp.getTransportAllowance() - Allowance.TRANSPORT_ALLOWANCE;
		tax.setTransportAllowance(value > 0 ? value : 0);
		value = emp.getLta() - Allowance.LTA;
		tax.setLta(value > 0 ? value : 0);
		if (emp.getLta() > Allowance.LTA) {
			allowance.setLtaSubmitted(Allowance.LTA);
		} else {
			allowance.setLtaSubmitted(emp.getLta());
		}
		value = emp.getMedicalBills() - Allowance.MEDICAL_BILLS;
		tax.setMedicalBills(value > 0 ? value : 0);
		if (emp.getMedicalBills() > Allowance.MEDICAL_BILLS) {
			allowance.setMedBill(Allowance.MEDICAL_BILLS);
		} else {
			allowance.setMedBill(emp.getMedicalBills());
		}
		tax.setOtherAllowance(emp.getOtherAllowance());
		tax.setSpecialAllowance(emp.getSpecialAllowance());
		emp.setAllowance(allowance);
		return tax;
	}

}
