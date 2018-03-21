/**
 * 
 */
package com.sprsec.model;

import java.io.Serializable;

/**
 * @author CTM
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8668811038864003798L;

	private String employeeId;
	private Double salary;
	private Double hra;
	private Double transportAllowance;
	private Double specialAllowance;
	private Double lta;
	private Double medicalBills;
	private Double otherAllowance;
	private Taxable taxable;
	private Allowance allowance;

	public Employee(String employeeId, Double salary, Double hra, Double transportAllowance, Double specialAllowance,
			Double lta, Double medicalBills, Double otherAllowance, Taxable taxable, Allowance allowance) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.hra = hra;
		this.transportAllowance = transportAllowance;
		this.specialAllowance = specialAllowance;
		this.lta = lta;
		this.medicalBills = medicalBills;
		this.otherAllowance = otherAllowance;
		this.taxable = taxable;
		this.allowance = allowance;
	}

	public Employee() {
		super();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getHra() {
		return hra;
	}

	public void setHra(Double hra) {
		this.hra = hra;
	}

	public Double getTransportAllowance() {
		return transportAllowance;
	}

	public void setTransportAllowance(Double transportAllowance) {
		this.transportAllowance = transportAllowance;
	}

	public Double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(Double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public Double getLta() {
		return lta;
	}

	public void setLta(Double lta) {
		this.lta = lta;
	}

	public Double getMedicalBills() {
		return medicalBills;
	}

	public void setMedicalBills(Double medicalBills) {
		this.medicalBills = medicalBills;
	}

	public Double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(Double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	public Taxable getTaxable() {
		return taxable;
	}

	public void setTaxable(Taxable taxable) {
		this.taxable = taxable;
	}

	public Allowance getAllowance() {
		return allowance;
	}

	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

}
