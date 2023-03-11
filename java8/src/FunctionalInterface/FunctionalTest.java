package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		List<String> strings = 
				Arrays.asList("Andhra Pradesh",
						"Tamil Nadu",
						"Telangana",
						"Kerala",
						"Karnataka");
		
		Function<String,Integer> f = (str) ->{
												return str.length();
												};
			
		Function<String,String> f1 = (str) ->{
													return str.toUpperCase();
												};
		Function<String,String> f2 = (str) ->{
												return str.toLowerCase();
												};
		Function<String,String> f3 = (str) ->{
												StringBuilder sb = new StringBuilder(str);
												sb.reverse();
												String str1 = sb.toString();
												return str1;
												};
		
		printLength(strings, f);
		printUppercase(strings, f1);
		printLowercase(strings, f2);
		printReverse(strings, f3);
		
	}
	
	public static void printLength(List<String> strings,Function<String,Integer> fref) {
		for(String str : strings) {
			System.out.println(fref.apply(str));
		}
	}
	public static void printUppercase(List<String> strings,Function<String,String> fref1) {
		for(String str : strings) {
			System.out.println(fref1.apply(str));
		}
	}
	public static void printLowercase(List<String> strings,Function<String,String> fref2) {
		for(String str : strings) {
			System.out.println(fref2.apply(str));
		}
	}
	public static void printReverse(List<String> strings,Function<String,String> fref3) {
		for(String str : strings) {
			System.out.println(fref3.apply(str));
		}
	}
	
	
		
	
}
