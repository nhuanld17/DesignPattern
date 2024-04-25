package Problem;

public class Clipboard {
	private String value;
	
	public void copy(String value) {
		this.value = value;
	}
	
	public String paste() {
		return this.value;
	}
	
	public static void main(String[] args) {
		Clipboard clipboard1 = new Clipboard();
		Clipboard clipboard2 = new Clipboard();
		
		clipboard1.copy("java");
		clipboard2.copy("python");
		
		System.out.println(clipboard1.paste()); // java
		System.out.println(clipboard2.paste()); //	python
	}
}
