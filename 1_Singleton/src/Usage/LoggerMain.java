package Usage;

public class LoggerMain {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("Application is starting...");
		logger.log("Another important operation is logged");
	}
}
