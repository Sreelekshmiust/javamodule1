package TestLambdas;

public class Lambdaswitchcase {
	
	public static double calculate(String operator, double x, double y) {
		
		return switch (operator) {
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" -> {
			if(y==0) {
				throw new IllegalArgumentException("Can't divide");
				
			}
			yield x/y;
		}
		default -> throw new IllegalArgumentException(" Unknown Operator");
		
		};
		
	}
	
	public static void main(String[] args) {
		System.out.println(Lambdaswitchcase.calculate("+", 4, 0));
		System.out.println(Lambdaswitchcase.calculate("-", 4, 0));
		System.out.println(Lambdaswitchcase.calculate("*", 4, 0));
		System.out.println(Lambdaswitchcase.calculate("/", 4, 2));
		System.out.println(Lambdaswitchcase.calculate("/", 4, 0));
		
	}

}
