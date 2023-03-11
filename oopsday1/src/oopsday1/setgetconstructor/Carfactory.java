package oopsday1.setgetconstructor;


public class Carfactory {

	public static void main(String[] args) {
		
		//Car car=new Car();
		
		Car jag=new Car("yellow",4000000,"toyota","innova");
		 

		
	//	System.out.println(jag);
		System.out.println(jag.hashCode());
		System.out.println(Integer.toHexString(jag.hashCode()));
		System.out.println(jag);
		
		Car bmw = new Car("brown",400000,"BMW","sport suv");

		
//		System.out.println(bmw);
			System.out.println(bmw.hashCode());
			System.out.println(Integer.toHexString(bmw.hashCode()));
			System.out.println(bmw);
			

//		
		
	}

}
