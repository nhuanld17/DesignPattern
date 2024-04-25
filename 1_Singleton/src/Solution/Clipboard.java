package Solution;

public class Clipboard {
	private String value;
	
	private static Clipboard clipboard = null;
	
	
	/*
	 * Private constructor để ngăn việc khởi tạo từ bên ngoài Constructor của 1 lớp
	 * được đặt là riêng tư để không cho phép các lớp khác tạo đối tượng từ lớp đó,
	 * từ đó kiểm soát việc khởi tạo lớp từ bên ngoài
	 */
	private Clipboard() {
		
	}
	
	/* Phương thức để cung cấp quyền truy cập vào thực thể duy nhất: 
	 * - Điều này nói đến một phương thức trong Singleton mà qua đó ta có thể
	 * lấy được thực thể duy nhất của lớp đó, đảm bảo rằng có có thực thể nào khác
	 * của lớp này được tạo ra trong chương trình
	 */
	
	public static Clipboard getInstance() {
		if (clipboard == null) {
			clipboard = new Clipboard();
		}
		return clipboard;
	}
	
	public void copy(String value) {
		this.value = value;
	}
	
	public String paste() {
		return value;
	}
}
