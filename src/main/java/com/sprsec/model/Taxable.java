/**
 * 
 */
package com.sprsec.model;

import java.io.Serializable;

/**
 * @author CTM
 *
 */
public class Taxable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8683401649443319609L;
	private Double salary;
	private Double hra;
	private Double transportAllowance;
	private Double specialAllowance;
	private Double lta;
	private Double medicalBills;
	private Double otherAllowance;
	
	public Taxable() {
		super();
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
	
}
