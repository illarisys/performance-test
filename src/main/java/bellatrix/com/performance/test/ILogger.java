package bellatrix.com.performance.test;

public interface ILogger {

	public void message(String messageText) throws Exception;
	
	public void error(String messageText) throws Exception;
	
	public void warning(String messageText) throws Exception;
	
}
