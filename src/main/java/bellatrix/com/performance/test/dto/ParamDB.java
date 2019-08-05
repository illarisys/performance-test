package bellatrix.com.performance.test.dto;

import java.io.Serializable;

public class ParamDB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String driver;
	private String dbms;
	private String serveName;
	private String portName;
	private String database;
	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	private String username;
	private String password;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDbms() {
		return dbms;
	}
	
	public void setDbms(String dbms) {
		this.dbms = dbms;
	}
	
	public String getServeName() {
		return serveName;
	}
	
	public void setServeName(String serveName) {
		this.serveName = serveName;
	}
	
	public String getPortName() {
		return portName;
	}
	
	public void setPortName(String portName) {
		this.portName = portName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
