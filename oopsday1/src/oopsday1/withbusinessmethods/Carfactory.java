package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jag=new Car("yellow", 40000,"toyota","innova");
		
		jag.start();
		jag.changeGear(1);
		jag.stop();
		
		
		Car bmw=new Car("brown",400000,"BMW","sport suv");
		bmw.start();
		bmw.changeGear(3);
		bmw.stop();
		
		

	
		
	}

}
