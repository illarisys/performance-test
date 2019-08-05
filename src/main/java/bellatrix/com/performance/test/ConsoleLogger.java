package bellatrix.com.performance.test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

/**
 * {@code} use to print message in console
 * **/
public class ConsoleLogger implements ILogger{

	ConsoleHandler ch;
	private static Logger logger = Logger.getLogger(ConsoleLogger.class.getName());
	
	public ConsoleLogger() {
		ch = new ConsoleHandler();
	}

	public void message(String messageText) throws Exception {
		if (!StringUtils.isBlank(messageText)) {
			logger.addHandler(ch);
			logger.log(Level.INFO, messageText);
		}else {
			throw new Exception("Empty value!");
		}
	}

	public void error(String messageText) throws Exception {
		if (!StringUtils.isBlank(messageText)) {
			logger.addHandler(ch);
			logger.log(Level.SEVERE, messageText);
		}else {
			throw new Exception("Empty value!");
		}
	}

	public void warning(String messageText) throws Exception {
		if (!StringUtils.isBlank(messageText)) {
			logger.addHandler(ch);
			logger.log(Level.WARNING, messageText);
		}else {
			throw new Exception("Empty value!");
		}
	}

}
