package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jag = new Car();
		jag.color="Blue";
		jag.price=5000000;
		jag.brand="benz";
		jag.model="class Z";
		
		System.out.println(jag.color);
		System.out.println(jag.price);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		
	
		
		Car bmw = new Car();
		bmw.color="white";
		bmw.brand="BMW";
		bmw.price=3000000;
		bmw.model="Luxury suv";
		
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);	
		
	}

}
