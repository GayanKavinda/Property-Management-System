/**
 * 2018 OOP
 * 
 * @author Udara Samaratunge  Department of Software Engineering, SLIIT 
 * 
 * @version 1.0
 * Copyright: SLIIT, All rights reserved
 * 
 */
package com.contact.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.contact.service.ContactUslmpl;

/**
 * This is the common utility class to load all property details at once when it
 * is initializing .
 * 

 */
public class CommonUtil {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ContactUslmpl.class.getName());

	public static final Properties properties = new Properties();

	static {
		try {
			
			// Read the property only once when load the class
			properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
			
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}

	/**
	 * Add new Employee ID
	 * 
	 * @param arrayList
	 * @return
	 */
	public static String generateIDs(ArrayList<String> arrayList) {

		String id;
		int next = arrayList.size();
		next++;
		id = CommonConstants.Inquiry_ID_PREFIX + next;
		if (arrayList.contains(id)) {
			next++;
			id = CommonConstants.Inquiry_ID_PREFIX + next;
		}
		return id;
	}
}
