package oopsday4.staticTest;

public class StaticDemo2 {
	static int a;
	static void method(){
		
		System.out.println("from method" +a);
		//method2(); is non-static 
	}
	
	public void method2() {
		System.out.println(a);
		method();
	}
}
