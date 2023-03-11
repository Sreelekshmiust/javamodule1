package optionals;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		
		String str = null;
		String str1 ="hello";
		//Optional<String> optional = Optional.of(str);
		
		//System.out.println(optional.get());
		
		Optional<String> optional2 = Optional.ofNullable(str);
		if(optional2.isPresent())
		System.out.println("Value is present  " + optional2.get()); // when str1 given if condition will be executed 
		else
			//System.out.println("is null" + optional2.get() ); //when str is passed else condition will execute and gives no such element exception 
			System.out.println("is null " + optional2.orElse("str not initialized"));
	}

} 

