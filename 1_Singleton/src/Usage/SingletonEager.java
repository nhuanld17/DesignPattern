package Usage;

//Singleton Bằng Cách Sử Dụng Khởi Tạo Tiên Phong (Eager Initialization)
/*
 * Phương pháp này khởi tạo thể hiện Singleton ngay khi lớp được tải, do đó không cần thêm bất kỳ đồng bộ      	hóa nào để tránh tình trạng đua (race condition) giữa các luồng.
 */

public class SingletonEager {
    // Tạo một thể hiện ngay khi lớp được tải
    private static final SingletonEager INSTANCE = new SingletonEager();

    // Hàm tạo riêng tư để ngăn không cho tạo thể hiện từ bên ngoài
    private SingletonEager() {}

    // Phương thức cung cấp quyền truy cập vào thể hiện duy nhất
    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}

