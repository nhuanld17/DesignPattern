package Solution;

public class Main {
	public static void main(String[] args) {
		// Getting the singleton instances
		Clipboard clipboard1 = Clipboard.getInstance();
		Clipboard clipboard2 = Clipboard.getInstance();
		
		clipboard1.copy("Java");
		clipboard2.copy("C++");
		
		/*
		 * Bây giờ, cả clipboard1 và clipboard2 tham chiếu đến cùng 1 thực thể của lớp
		 * Clipboard, đảm bảo sự nhất quán trên toàn chương trình
		 */
		
		System.out.println(clipboard1.paste()); // C++
		System.out.println(clipboard2.paste()); // C++
	
	}
}