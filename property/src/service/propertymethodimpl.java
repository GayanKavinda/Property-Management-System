package service;

import property.dbdetail;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.Part;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.property;
import property.Query;
import property.constants;
import property.dbdetail;

public class propertymethodimpl implements propertymethod {

	/*Initialize the logger*/
	public static final Logger log = Logger.getLogger(propertymethodimpl.class.getName());
	
	
	static Connection con;
	static PreparedStatement ps;
	static PreparedStatement ps1;
	static PreparedStatement ps2;
	static PreparedStatement ps3;
	static PreparedStatement ps4;
	static PreparedStatement ps6;
	static PreparedStatement ps7;
	static PreparedStatement ps8;

	static int count = 0;

	@Override
	public void addProperty(property ob) {

		try {

			con = dbdetail.getCon();
			con.setAutoCommit(false);

			/*
			 * add a record to the table
			 */
			// ps = con.prepareStatement("insert into property2 values(?,?,?) ");
			 ps = con.prepareStatement(Query.queryByID(constants.qid_1));
			 ps.setString(1, ob.getPname());
			ps.setBlob(2, ob.getImage());
			ps.setString(3, ob.getDescription());

			ps.execute();
			con.commit();
			con.close();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public byte[] displayProperties(String name) {

		String nname=name;
		Blob image = null;
		byte[] imgData = null;
		InputStream input = null;

		try {
			con = dbdetail.getCon();
			/*
			 * reading the image for given name
			 */
			//ps4 = con.prepareStatement("select image from property2 where pname='" + name + "'");
			ps4 = con.prepareStatement(Query.queryByID(constants.qid_2));
			ps4.setString(1,name);
			
			ResultSet rs4 = ps4.executeQuery();
			while (rs4.next()) {

				image = rs4.getBlob(1);
				imgData = image.getBytes(1, (int) image.length());

			}

			con.close();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}
		return imgData;

	}

	@Override
	public ArrayList displayPropertiesname() {
		ArrayList pname = new ArrayList();

		try {
			con = dbdetail.getCon();
			/*
			 * read names in the table
			 */
			//ps2 = con.prepareStatement("select pname from property2");
			ps2 = con.prepareStatement(Query.queryByID(constants.qid_3));
			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) {

				pname.add(rs2.getString(1));

			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return pname;

	}

	@Override
	public ArrayList displayPropertiesdescription() {
		ArrayList des = new ArrayList();

		try {
			con = dbdetail.getCon();
			/*
			 * read the description in the table
			 */
			//ps3 = con.prepareStatement("select description from property2");
			ps3 = con.prepareStatement(Query.queryByID(constants.qid_4));
			ResultSet rs2 = ps3.executeQuery();
			while (rs2.next()) {

				des.add(rs2.getString(1));

			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return des;

	}

	@Override
	public int count() {
		int i = 0;

		try {
			con = dbdetail.getCon();
			/*
			 * count the no of records
			 */
			//ps2 = con.prepareStatement("select count(*) from property2");
			ps2 = con.prepareStatement(Query.queryByID(constants.qid_5));

			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) {
				i = rs2.getInt(1);

			}
			System.out.print(i);
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
		}

		return i;
	}

	@Override
	public void delete(String name) {

		try {
			con = dbdetail.getCon();
			con.setAutoCommit(false);
			/*
			 * delete a record
			 */
			//ps6 = con.prepareStatement("delete from property2 where pname='" + name + "'");
			ps6 = con.prepareStatement(Query.queryByID(constants.qid_6));
			ps6.setString(1,name);

			ps6.execute();
			con.commit();
			con.close();
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			e.printStackTrace();
		}

	}

	@Override
	public String edit(String name) {
		String i = "null";
		try {
			con = dbdetail.getCon();
			/*
			 * read the description for given pname
			 */
			//ps7 = con.prepareStatement("select description from property2 where pname='" + name + "'");
			ps7 = con.prepareStatement(Query.queryByID(constants.qid_7));
			ps7.setString(1,name);
			
			ResultSet rs7 = ps7.executeQuery();
			while (rs7.next()) {
				i = rs7.getString(1);
			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			e.printStackTrace();
		}
		return i;
	}

	@Override
	public void editproperty(property p) {

		try {
			con = dbdetail.getCon();
			String x = p.getDescription();
			String y = p.getPname();
			/*
			 * Update the data in the table
			 */
			//ps8 = con.prepareStatement("UPDATE property2  SET description ='" + x + "'  WHERE pname='" + y + "'  ");
			ps8 = con.prepareStatement(Query.queryByID(constants.qid_8));
			ps8.setString(1,x);
			ps8.setString(2,y);
		
			ps8.execute();

			con.close();
		} catch (SQLException | SAXException | IOException | ParserConfigurationException e) {

			e.printStackTrace();
		}

	}

}
