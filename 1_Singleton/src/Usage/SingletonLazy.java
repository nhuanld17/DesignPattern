package Usage;

/*
 * Singleton Bằng Cách Sử Dụng Khởi Tạo Lười Biếng và Đồng Bộ Hóa (Lazy Initialization with Synchronized)
 * Phương pháp này chỉ khởi tạo thể hiện Singleton khi nó thực sự cần thiết, và sử dụng đồng bộ hóa để đảm
 * bảo an toàn khi chạy đa luồng.
 */

public class SingletonLazy {
    private static SingletonLazy instance;

    // Hàm tạo riêng tư
    private SingletonLazy() {}

    // Đồng bộ hóa để đảm bảo chỉ một luồng có thể thực hiện khởi tạo
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

