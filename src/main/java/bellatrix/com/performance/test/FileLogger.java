package bellatrix.com.performance.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

/**
 * {@code} use to print message in files
 * **/
public class FileLogger implements ILogger{
	
	FileHandler fh;
	private static Logger logger = Logger.getLogger(FileLogger.class.getName());
	
	public FileLogger(String fileFolder) throws Exception {
		File folder = new File(fileFolder);
		if(!folder.exists()) {
			folder.mkdirs();
		}
		
		File logFile = new File(fileFolder + "/logFile.txt");
		if (!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				throw new Exception("Can't create new file!");
			}
		}
		fh = new FileHandler(fileFolder + "/logFile.txt");
	}

	public void message(String messageText) throws Exception {
		if (!StringUtils.isBlank(messageText)) {
			logger.addHandler(fh);
			logger.log(Level.INFO, messageText);
		}else {
			throw new Exception("Empty value!");
		}
	}

	public void error(String messageText) throws Exception {
		if (!StringUtils.isBlank(messageText)) {
			logger.addHandler(fh);
			logger.log(Level.SEVERE, messageText);
		}else {
			throw new Exception("Empty value!");
		}
	}

	public void warning(String messageText) throws Exception {
		if (!StringUtils.isBlank(messageText)) {
			logger.addHandler(fh);
			logger.log(Level.WARNING, messageText);
		}else {
			throw new Exception("Empty value!");
		}
	}

}
