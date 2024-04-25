package Usage;

import java.io.File;

//Kiểm soát việc truy cập vào tài nguyên đặc biệt

public class Logger {
	private static Logger instance;
	private File logFile;
	
	// Phương thức khởi tạo riêng tư để ngăn việc khởi tạo từ bên ngoài
	private Logger() {
		try {
			this.logFile = new File("app.log");
			// Giả sử file đã được mở ở đây cho việc viết gile log
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Phương thức để cấp quyền truy cập đến thực thể duy nhất
	public static synchronized Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	// Phương thức để log tin nhắn
	public void log(String message) {
		System.out.println("Logging: "+message);
		// Lí tưởng nhất là thêm tin nhắn vào tập tin
	}
}
