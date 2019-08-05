package bellatrix.com.performance.test;

import bellatrix.com.performance.test.dao.LogDao;
import bellatrix.com.performance.test.dto.ParamDB;
import bellatrix.com.performance.test.util.LogLevel;

/**
 * {@code} use to send info to database
 * **/
public class DataBaseLogger implements ILogger{

	ParamDB paramDB;
	
	public DataBaseLogger (ParamDB paramDB) {
		this.paramDB = paramDB;
	}
	
	public void message(String messageText) throws Exception {
		new LogDao().insert(messageText, LogLevel.MESSAGE, paramDB);
	}

	public void error(String messageText) throws Exception {
		new LogDao().insert(messageText, LogLevel.ERROR, paramDB);
	}

	public void warning(String messageText) throws Exception {
		new LogDao().insert(messageText, LogLevel.WARNING, paramDB);
	}

}
