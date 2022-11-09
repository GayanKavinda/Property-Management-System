package property;
import java.sql.*;

public class dbdetail implements dbdetailimp {
	/** 
	 * This is the Database connection creation class .
	 */
	
	
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
	private static Connection conn=null;
	
	private  dbdetail() {}
	

	public static Connection getCon(){
		try {
			/**
			 * This create new connection objects when connection is closed or it is
			 */
			if (conn == null || conn.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(connurl,username,pwd);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
