/*
 * IT18011494 Nasome P.V.R.D.V.
 * 
 * 
 */
package server;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import service.Customermethods;
import util.Query;

public class generateId {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(Customermethods.class.getName());

	public static final Properties properties = new Properties();

	static {
		try {

			// Read the property only once when load the class
			properties.load(Query.class.getResourceAsStream("config.properties"));

		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}

	/*
	 * Generate new id
	 */
	public static int generateIDs(int x) {

		x = x + 1;
		return x;
	}

}
