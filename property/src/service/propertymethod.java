package service;


import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Properties;

import model.property;

interface propertymethod {
	
	/**
	 * add new record to the table
	 * @param p
	 */
	public void addProperty(property p);
	
	
	/**
	 * display image 
	 * @param name
	 * @return
	 */
	public  byte[] displayProperties(String name);
	
	/**
	 * display name
	 * @return
	 */
	public  ArrayList displayPropertiesname();
	
	/**
	 * display description
	 * @return
	 */
	public  ArrayList displayPropertiesdescription();
	
	/**
	 * count no of records
	 * @return
	 */
	public int count();
	
	/**
	 * delete record
	 * @param name
	 */
	public void delete(String name);
	
	/**
	 * find the name
	 * @param name
	 * @return
	 */
	public String edit(String name);
	
	/**
	 * Update record
	 * @param p
	 */
	public void editproperty(property p);
	
}
