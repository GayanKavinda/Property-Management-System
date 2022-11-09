
package service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.mysql.cj.Session;

import model.Customer;
import server.generateId;
import util.Query;
import util.constants;
import util.dbdetail;

public class Customermethodimpl implements Customermethods {
	
	/*Initialize the logger */
	public static final Logger log = Logger.getLogger(Customermethodimpl.class.getName());
	
	static Connection con;
	
	static PreparedStatement ps;
	static PreparedStatement ps1;
	static PreparedStatement ps2;
	static PreparedStatement ps3;
	static PreparedStatement ps4;
	static PreparedStatement ps5;
	static PreparedStatement ps7;
	static PreparedStatement ps8;
	static PreparedStatement ps9;
	static PreparedStatement ps10;
	static PreparedStatement ps11;
	static PreparedStatement ps12;
	static PreparedStatement ps13;
	static PreparedStatement ps14;

	@Override
	public int insertCustomer(Customer c) {

		int y = 0;
		try {
			/*open the connection*/
			con = dbdetail.getCon();

			/* If user name existed return 1 */

			ps2 = con.prepareStatement((Query.queryByID(constants.qid_3)));

			ps2.setString(1, c.getName());

			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) {

				return 1;

			}
			
			/*	get the last customer id in the table*/
			ps1 = con.prepareStatement((Query.queryByID(constants.qid_4)));
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				y = Integer.parseInt(rs.getString(1));
			}
			
			/*generate a new id*/
			int id = generateId.generateIDs(y);
			
			/*Store a new record*/
			ps = con.prepareStatement((Query.queryByID(constants.qid_2)));

			con.setAutoCommit(false);

			ps.setLong(1, id);
			ps.setString(2, c.getName());
			ps.setString(3, c.getemail());
			ps.setString(4, c.getPassword());
			ps.execute();
			con.commit();
			con.close();
			/*close the connection */
		} catch (SQLException | SAXException | IOException | ParserConfigurationException | NullPointerException e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return 0;

	}

	@Override
	public ArrayList getCustomer(String username, String pass) {

		ArrayList ci = new ArrayList();

		try {
			/*open the connection*/
			con = dbdetail.getCon();
			
			/*
			 * get the username and password
			 * 
			 */
			
			ps = con.prepareStatement((Query.queryByID(constants.qid_1)));

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ci.add(rs.getString(1));

			}
			con.close();

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}
		return ci;
	}

	@Override
	public boolean logCustomer(String uname, String password) {

		boolean x = false;
		try {
			/*open the connection*/
			con = dbdetail.getCon();
			
			/*
			 * this will check wheather the username and password is matching
			 */
			
			ps2 = con.prepareStatement((Query.queryByID(constants.qid_6)));
			ps2.setString(1, uname);
			ps2.setString(2, password);

			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) {
				x = true;
			}

			con.close();
			/*close the connection*/

		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return x;
	}

	@Override
	public String fgtpwd(String uname) {

		String rs = null;
		int i = 0;

		try {
			/*open the connection*/
			con = dbdetail.getCon();
			
			/*
			 *check wheather the username is in the table 
			 */

			ps5 = con.prepareStatement((Query.queryByID(constants.qid_7)));
			ps5.setString(1, uname);

			ResultSet rs5 = ps5.executeQuery();
			while (rs5.next()) {
				rs = rs5.getString(1);

			}
			con.close();
			/*close the connection*/

		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return rs;

	}

	@Override
	public boolean resetpwd(String uname, String email) {

		try {
			/*open the connection*/
			con = dbdetail.getCon();
			
			/*
			 * check wheather the username and email address is matching
			 */

			ps7 = con.prepareStatement((Query.queryByID(constants.qid_8)));
			ps7.setString(1, uname);
			ps7.setString(2, email);
			ResultSet rs7 = ps7.executeQuery();
			while (rs7.next()) {
				con.close();
				/*close the connection*/
				return true;

			}

		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean storenewpwd(String uname, String password) {

		try {
			/*open the connection*/
			con = dbdetail.getCon();
			/*
			 * Update the record with the new password
			 */

			ps8 = con.prepareStatement((Query.queryByID(constants.qid_9)));
			ps8.setString(1, password);
			ps8.setString(2, uname);

			ps8.execute();

			con.close();
			/*close the connection*/
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	public void deleteacc(String uname) {
		int x = 0;
		try {
			/*open the connection*/
			con = dbdetail.getCon();
			/*
			 * delete the reord in the table
			 */
			ps10 = con.prepareStatement((Query.queryByID(constants.qid_10)));
			ps10.setString(1, uname);
			ResultSet rs10 = ps10.executeQuery();
			while (rs10.next()) {

				x = Integer.parseInt(rs10.getString(1));
			}

			ps9 = con.prepareStatement((Query.queryByID(constants.qid_11)));
			ps9.setLong(1, x);

			ps9.execute();

			con.close();
			
			/*close the connection*/
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

	}

}
