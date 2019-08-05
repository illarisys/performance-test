package bellatrix.com.performance.test.dao;

import java.sql.Connection;
import java.sql.Statement;

import bellatrix.com.performance.test.dto.ParamDB;
import bellatrix.com.performance.test.util.LogLevel;

public class LogDao {

	Statement stmt;
	Connection connection;
	
	public void insert(String message, LogLevel level, ParamDB paramDB) throws Exception{
		connection = ConnectionDB.createConnection(paramDB);
		stmt = connection.createStatement();
		stmt.executeUpdate("insert into Log_Values('" + message + "', " + level.ordinal() + ")");
		if(!connection.isClosed()) {
			connection.close();
		}
	}
	
}
