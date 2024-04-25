

	Singleton là 1 mẫu thiết kế sáng tạo nhằm đảm bảo 1 lớp chỉ có 1 thực thể 
	duy nhất cung cấp 1 điểm truy cập " toàn cầu " đến thực thể đó. Nói 1 cách 
	đơn giản, điều này giống như đảm bảo rằng chỉ có 1 bản sao duy nhất của
	1 đối tượng cụ thể trong chương trình và ta có thể truy cập đối tượng đó
	từ bất cứ đâu trong code của mình.
	
	VD:Hãy lấy một ví dụ đơn giản từ thực tế: bộ nhớ tạm. Hãy tưởng tượng nhiều ứng dụng hoặc quá trình đang chạy trên một máy tính, mỗi ứng dụng cùng cố gắng truy cập vào bộ nhớ tạm một cách đồng thời. Nếu mỗi ứng dụng tạo ra phiên bản bộ nhớ tạm riêng của mình để quản lý các thao tác sao chép và dán, điều đó có thể dẫn đến xung đột dữ liệu. Xem file Clipboard.java
	
	public class Clipboard {

    	private String value;

    	public void copy(String value) {
        	this.value = value;
    	}

    	public String paste() {
        	return value;
    	}
	}
	
		public class Main {
    	public static void main(String[] args) {

        	Clipboard clipboard1 = new Clipboard();
        	Clipboard clipboard2 = new Clipboard();

        	clipboard1.copy("Java");
       	 	clipboard2.copy("Design patterns");

        	System.out.println(clipboard1.paste()); // output: Java
        	System.out.println(clipboard2.paste()); // output: Design patterns
    		}
		}
		
		Rõ ràng, điều này không hợp lí. Chúng ta hy vọng cả hai phiên bản clipboard sẽ hiển thị cùng 1 giá
		trị. Đây chính xác là trường hợp Singleton chứng tỏ giá trị của nó--> package Solution
	
	
	
	