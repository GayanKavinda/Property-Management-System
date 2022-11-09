/*
 * IT18011494 Nasome P.V.R.D.V.
 * 
 */
package service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.Customer;

public interface Customermethods {

	/**
	 * Add  new record for customer_details
	 * @param Customer
	 * @return successful session login or not
	 */
	public int insertCustomer(Customer c);
	
	

	/**
	 * get customer details
	 * @param username
	 * @param pass
	 * @return <ArrayList>
	 */
	public ArrayList getCustomer(String username, String pass);
	
	
	
	/**
	 * check whether the name and password is correct
	 * @param uname
	 * @param password
	 * @return
	 */

	public boolean logCustomer(String uname, String password);
	
	
	
	/**
	 * 
	 * check whether the username is their in the customer_details table
	 * @param uname
	 * @return
	 */
	public String fgtpwd(String uname);
	
	
	/**
	 * check the username and matching email in the customer_details
	 * @param uname
	 * @param email
	 * @return
	 */

	public boolean resetpwd(String uname, String email);
	
	/**
	 * Reset the new password
	 * @param uname
	 * @param password
	 * @return
	 */

	public boolean storenewpwd(String uname, String password);
	/**
	 * delete the whole data row in customer_details
	 * @param uname
	 */

	public void deleteacc(String uname);

}
