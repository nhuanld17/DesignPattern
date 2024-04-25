package Usage;

//Cung cấp một điểm truy cập toàn cục:

public class GlobalConfigMain {
	public static void main(String[] args) {
		// Lấy thể hiện của GlobalConfig 
		GlobalConfig config = GlobalConfig.getInstance();
		
		// In ra cấu hình ban đầu
		System.out.println("Cấu hình ban đầu:"+config.getConfigData());
		
		// Thay đổi cấu hình
		config.setConfigData("Cấu hình đã được cập nhật");
		
		// Lấy lại thể hiện và kiểm tra cấu hình
		GlobalConfig config2 = GlobalConfig.getInstance();
		System.out.println("Cấu hình sau khi cập nhật: "+config2.getConfigData());
	}
}
