package bellatrix.com.performance.test;

import bellatrix.com.performance.test.dto.ParamDB;
import bellatrix.com.performance.test.util.LogLevel;

/**
 * @author MLUYO
 * @since 04/08/2019 {@code} 1. I have removed static boolean initialized. It
 *        has not used. 2. I have removed messageText.length() == 0, because
 *        can't use when It's null. It's throw error. 2. I have used apache
 *        commons library
 * 
 **/
public class JobLogger {

	public JobLogger() {
		
	}
	
	public static void writeConsole(String message, LogLevel level) throws Exception {
		try {
			switch (level) {
				case ERROR:
					new ConsoleLogger().error(message);
					break;
				case MESSAGE:
					new ConsoleLogger().message(message);
					break;
				case WARNING:
					new ConsoleLogger().warning(message);
					break;
				default:
					break;
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public static void writeFile(String message, LogLevel level, String fileFolder) throws Exception {
		try {
			switch (level) {
				case ERROR:
					new FileLogger(fileFolder).error(message);
					break;
				case MESSAGE:
					new FileLogger(fileFolder).message(message);
					break;
				case WARNING:
					new FileLogger(fileFolder).warning(message);
					break;
				default:
					break;
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	public static void writeDataBase(String message, LogLevel level, ParamDB paramDB) throws Exception {
		try {
			switch (level) {
				case ERROR:
					new DataBaseLogger(paramDB).error(message);
					break;
				case MESSAGE:
					new DataBaseLogger(paramDB).message(message);
					break;
				case WARNING:
					new DataBaseLogger(paramDB).warning(message);
					break;
				default:
					break;
			}
		}catch (Exception e) {
			throw e;
		}
	}

}
