package Usage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// Biến static chứa thể hiện duy nhất của lớp
	private static DatabaseConnection instance;
	
	// Khởi tạo kết nối với cơ sở dữ liệu
	private Connection connection;
	
	// Phương thức khởi tạo riêng tư để ngăn việc khởi tạo từ bên ngoài
	private DatabaseConnection() {
		try {
            String url = "jdbc:yourdb://host:port/databaseName";
            String user = "username";
            String password = "password";
            
            this.connection = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Phương thức static để truy cập vào thể hiện duy nhất
	public static DatabaseConnection getInstance() {
		if (instance == null) {
			synchronized (DatabaseConnection.class) {
				if (instance == null) {
					instance = new DatabaseConnection();
				}
			}
		}
		return instance;
	}
	
	// Phương thức để lấy kết nối
	public Connection getConnection() {
		return connection;
	}
}
