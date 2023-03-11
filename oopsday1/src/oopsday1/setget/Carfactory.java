package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jag=new Car();
		
		jag.setBrand("benz");
		jag.setColor("red");
		jag.setPrice(300000);
		jag.setModel("classA");
		
		System.out.println(jag.getColor());
		System.out.println(jag.getPrice());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());
		
		
		Car bmw = new Car();
		bmw.setColor("white");
		bmw.setBrand("BMW");
		bmw.setPrice(3000000);
		bmw.setModel("Luxury suv");
	
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
		
		
	}

}
