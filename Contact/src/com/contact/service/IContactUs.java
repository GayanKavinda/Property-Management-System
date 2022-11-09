package com.contact.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.contact.model.Inquiry;


public interface IContactUs {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(IContactUs.class.getName());


	/**
	 * Add employees for employee table
	 * @param employee
	 */
	public void addInquiry(Inquiry inquiry);

	/**
	 * Get a particular Employee
	 * 
	 * @param empoyeeID
	 * @return Employee
	 */
	public Inquiry getInquiryByID(String id);
	
	/**
	 * Get all list of employees
	 * 
	 * @return ArrayList<Employee>
	 */
	public ArrayList<Inquiry> getInquiries();
	
	/**
	 * Update existing employee
	 * @param employeeID
	 * @param employee
	 * 
	 * @return
	 */
	public Inquiry updateInquiry(String id , Inquiry inquiry);

	/**
	 * Remove existing employee
	 * 
	 * @param employeeID
	 */
	public void removeInquiry(String id);

}
