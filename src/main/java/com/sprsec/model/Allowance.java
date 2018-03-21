/**
 * 
 */
package com.sprsec.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author CTM
 *
 */
public class Allowance {
	public static final double HRA = 180000;
	public static final double TRANSPORT_ALLOWANCE = 19200;
	public static final double LTA = 25000;
	public static final double MEDICAL_BILLS = 15000;
	
	private double medBill;
	private double ltaSubmitted;
	
	public Allowance() {
		super();
	}

	public double getMedBill() {
		return medBill;
	}

	public void setMedBill(double medBill) {
		this.medBill = medBill;
	}

	public double getLtaSubmitted() {
		return ltaSubmitted;
	}

	public void setLtaSubmitted(double ltaSubmitted) {
		this.ltaSubmitted = ltaSubmitted;
	}

	public static void main(String[] args) {
		Set<String> data = new HashSet<>();
		String asd = "asd";
		data.add(asd);
		System.out.println(data.equals("asd"));
		asd = "asd";
		data.add(asd);
		Collection<String> data2 = new ArrayList<>();
		data2.add("asd");
		for ( String key : data) {
		    System.out.println(key);
		}
	}
	
}
