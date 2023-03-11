package FunctionalInterface;

import java.util.function.Supplier; 

public class SupplierTest {

	public static void main(String[] args) {
		
		
		Supplier <String> supplier = () -> {
													return new String("Hola!");
												};
		
		System.out.println(supplier.get());
	} 
	
}
