package oopsday4.staticTest;

public class TestStaticDemo2 {
	static int a;
	public static void main(String[] args) {
		
		StaticDemo2 d1 = new StaticDemo2();
		d1.method();
		
		StaticDemo2.method();	
	}

}
