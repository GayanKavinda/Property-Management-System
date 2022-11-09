package com.contact.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.contact.model.Inquiry;
import com.contact.util.*;
import com.contact.model.Inquiry;
import com.contact.util.CommonConstants;
import com.contact.util.DBConnectionUtil;
import com.contact.util.QueryUtil;
import com.contact.service.*;

public class ContactUslmpl implements IContactUs {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ContactUslmpl.class.getName());

	private static Connection connection;

	private static Statement statement;

//	static {
//		// create table or drop if exist
//		createInquiryTable();
//	}

	private PreparedStatement preparedStatement;

	public static void createInquiryTable() {

		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			// Drop table if already exists and as per SQL query available in
			// IQuery.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_DROP_TABLE));
			// Create new inquiries table as per SQL query available in
			// IQuery.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_TABLE));

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}

	@Override
	public void addInquiry(Inquiry inquiry) {
		// TODO Auto-generated method stub
			String inquiryId = CommonUtil.generateIDs(getInquiryIds());
		
		try {
			connection = DBConnectionUtil.getDBConnection();
			/*
			 * Query is available in InquiryQuery.xml file and use
			 * insert_inquiry key to extract value of it
			 */
			preparedStatement = connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_INQUIRIES));
			connection.setAutoCommit(false);
			
			//Generate inquiry IDs
			inquiry.setId(inquiryId);
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, inquiry.getId());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO,  inquiry.getName());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, inquiry.getEmail());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, inquiry.getCity());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, inquiry.getDescription());
			// Add inquiry
			preparedStatement.execute();
			connection.commit();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}

	}

	@Override
	public Inquiry getInquiryByID(String id) {
		// TODO Auto-generated method stub
		Inquiry inquiry = actionOnInquiry(id).get(0);
		return inquiry;
	}

	@Override
	public ArrayList<Inquiry> getInquiries() {
		// TODO Auto-generated method stub
		return actionOnInquiry(null);
	}

	

	private ArrayList<Inquiry> actionOnInquiry(String inquiryID) {

		ArrayList<Inquiry> inquiryList = new ArrayList<Inquiry>();
		try {
			connection = DBConnectionUtil.getDBConnection();
			/*
			 * Before fetching inquiry it checks whether inquiry ID is
			 * available
			 */
			if (inquiryID != null && !inquiryID.isEmpty()) {
				/*
				 * Get inquiry by ID query will be retrieved from
				 * InquiryQuery.xml
				 */
				preparedStatement = connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_INQUIRY));
				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, inquiryID);
			}
			/*
			 * If inquiry ID is not provided for get inquiry option it display
			 * all inquiries
			 */
			else {
				preparedStatement = connection
						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_ALL_INQUIRIES));
			}
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Inquiry inquiry = new Inquiry();
				inquiry.setId(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				inquiry.setName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				inquiry.setEmail(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				inquiry.setCity(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				inquiry.setDescription(resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE));
				inquiryList.add(inquiry);
			}

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return inquiryList;
	}

	
private ArrayList<String> getInquiryIds(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * List of inquiry IDs will be retrieved from InquiryQuery.xml
		 */
		try {
			connection = DBConnectionUtil.getDBConnection();
			preparedStatement = connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_INQUIRY_IDS));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException
				| ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return arrayList;
	}

public Inquiry updateInquiry(String id , Inquiry inquiry) {

	/*
	 * Before fetching inquiry it checks whether inquiry ID is available
	 */
	if (id != null && !id.isEmpty()) {
		/*
		 * Update inquiry query will be retrieved from InquiryQuery.xml
		 */
		try {
			connection = DBConnectionUtil.getDBConnection();
			preparedStatement = connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_INQUIRY));
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, inquiry.getName());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, inquiry.getEmail());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, inquiry.getCity());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, inquiry.getDescription());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, inquiry.getId());
			preparedStatement.executeUpdate();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException
				| ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
	}
	// Get the updated inquiry
	return getInquiryByID(id);
}

/**
 *
 * @return ArrayList<String> Array of employee id list will be return
 * 
 * @throws SQLException
 *             - Thrown when database access error occurs or this method is
 *             called on a closed connection
 * @throws ClassNotFoundException
 *             - Thrown when an application tries to load in a class through
 *             its string name using
 * @throws SAXException
 *             - Encapsulate a general SAX error or warning
 * @throws IOException
 *             - Exception produced by failed or interrupted I/O operations.
 * @throws ParserConfigurationException
 *             - Indicates a serious configuration error.
 * @throws NullPointerException
 *             - Service is not available
 */

public void removeInquiry(String id) {

	// Before deleting check whether inquiry ID is available
	if (id != null && !id.isEmpty()) {
		/*
		 * Remove inquiry query will be retrieved from IQuery.xml
		 */
		try {
			connection = DBConnectionUtil.getDBConnection();
			preparedStatement = connection
					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_INQUIRY));
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, id);
			preparedStatement.executeUpdate();
		} catch (SQLException | SAXException | IOException | ParserConfigurationException
				| ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
	}
}

/**
 * This performs GET inquiry by ID and Display all inquiry
 * 
 * @param id
 *            ID of the inquiry to remove or select from the list

 * @return ArrayList<Inquiry> Array of inquiry list will be return
 * 
 * @throws SQLException
 *             - Thrown when database access error occurs or this method is
 *             called on a closed connection
 * @throws ClassNotFoundException
 *             - Thrown when an application tries to load in a class through
 *             its string name using
 * @throws SAXException
 *             - Encapsulate a general SAX error or warning
 * @throws IOException
 *             - Exception produced by failed or interrupted I/O operations.
 * @throws ParserConfigurationException
 *             - Indicates a serious configuration error.
 * @throws NullPointerException
 *             - Service is not available
 * 
 * @see #getInquiries()
 * @see #getInquiryByID(String)
 */



}
