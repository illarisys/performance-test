package bellatrix.com.performance.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import bellatrix.com.performance.test.dto.ParamDB;

public class ConnectionDB {
	
	public static Connection createConnection(ParamDB paramDB) throws Exception{
		
		try {
			Properties connectionProps = new Properties();
			connectionProps.put("user", paramDB.getUsername());
			connectionProps.put("password", paramDB.getPassword());
			Class.forName(paramDB.getDriver());
			return DriverManager.getConnection("jdbc:" + paramDB.getDbms() + "://" + paramDB.getServeName()
			+ ":" + paramDB.getPortName() + "//" + paramDB.getDatabase(), connectionProps);
		} catch (SQLException e) {
			throw new Exception("Can't connect to database. Check your params.") ;
		}
	
	}
	
	
}
