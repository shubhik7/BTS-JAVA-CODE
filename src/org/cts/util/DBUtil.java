package org.cts.util;
import java.sql.Connection;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con=null;
	private static Properties props=new Properties();
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
		try {
			FileInputStream fis=new FileInputStream("DB.properties");
			props.load(fis);
			
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));
			con=DriverManager.getConnection(props.getProperty("DB_URL"),props.getProperty("DB_USERNAME"),props.getProperty("DB_PASSWORD"));
	    }catch(Exception e) {
	    	e.printStackTrace();
		}
	return con;
	
}
}
	