package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		
		Shape s = new Rectangle(10.25,65.75);
		double result =s.area();
		System.out.println(result);
	
		
		 s = new Circle(65.75); 
		  result =s.area(); 
		  System.out.println(result);
		 
		 s = new Square(10.25); result =s.area(); System.out.println(result);
		 
	}

}
