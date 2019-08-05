package bellatrix.com.performance.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bellatrix.com.performance.test.dto.ParamDB;
import bellatrix.com.performance.test.util.LogLevel;


/**
 * {@code} this have been implemented using JUnit 4
 * **/
public class JobLoggerTest {
	//virtual_store_bd?useSSL=false
	ParamDB paramDB;
	
	@Before
	public void setUp() {
		paramDB = new ParamDB();
		paramDB.setDriver("org.mariadb.jdbc.Driver");
		paramDB.setDbms("mariadb");
		paramDB.setServeName("localhost");
		paramDB.setPortName("3306");
		paramDB.setDatabase("test_bd");
		paramDB.setUsername("root");
		paramDB.setPassword("aABCD1234$");
	}
	
	//This is a test using console
	@Test
	public void consoleTest() {
		try {
			JobLogger.writeConsole("This is a test for bellatrix", LogLevel.MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//This is a test using file
	@Test
	public void fileTest() {
		try {
			JobLogger.writeFile("This is a test for bellatrix", LogLevel.MESSAGE, "D:\\log\\");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//This is a test using database
	@Test
	public void dataBaseTest() {
		try {
			JobLogger.writeDataBase("This is a test for bellatrix", LogLevel.MESSAGE, paramDB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
