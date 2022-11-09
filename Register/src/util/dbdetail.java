/*
 * IT18011494 Nasome P.V.R.D.V.
 * 
 */
package util;

import java.sql.*;

/**
 * This is the Database connection creation class .
 * @author vnaso
 *
 */
public class dbdetail implements dbdetailimp {
	/**
	 * Create Database connection for the given URL, Username and Password
	 * 
	 * @return Connection this returns SQL connection for MySql Database
	 * 
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name
	 * @throws SQLException
	 *             - An exception that provides information on a database access
	 *             error or other errors
	 */

	private static Connection con = null;

	private dbdetail() {
	}

	public static Connection getCon() {
		/**
		 *  This create new connection objects when connection is closed or it is
		 */
		try {

			if (con == null || con.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(connurl, username, pwd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

}
