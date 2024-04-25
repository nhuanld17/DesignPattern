package Usage;

//Cung cấp một điểm truy cập toàn cục

public class GlobalConfig {
	private static GlobalConfig instance;
	private String configData;
	
	private GlobalConfig() {
		// Giả sử lấy dữ liệu cấu hình từ 1 file hoặc 1 nguồn cố định
		configData = "Cấu hình mặc định";
	}
	
	// Phương thức tĩnh để truy cập thực thể duy nhất của lớp
	public static synchronized GlobalConfig getInstance() {
		if (instance == null) {
			instance = new GlobalConfig();
		}
		
		return instance;
	}
	
	// Phương thức để lấy cấu hình
	public String getConfigData() {
		return configData;
	}
	
	// Phương thức để thay đổi cấu hình
	public void setConfigData(String configData) {
		this.configData = configData;
	}
}
