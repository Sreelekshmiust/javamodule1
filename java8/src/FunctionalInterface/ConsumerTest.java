package FunctionalInterface;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> strings = 
				Arrays.asList("Andhra Pradesh",
						"Tamil Nadu",
						"Telangana",
						"Kerala",
						"Karnataka");
		
		Consumer<String> consumer = (str) -> {
												System.out.println(str);
												};
		consumer.accept("I am doing great");
		
		for(String str : strings) {
			consumer.accept(str);
		}
		printString(strings, consumer);
	}
		public static void printString(List<String> strings,Consumer<String> consumer) {
			for(String str : strings) {
				consumer.accept(str);
			}
		}


}
