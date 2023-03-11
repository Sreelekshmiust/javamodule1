package exceptionhandlingday6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("Program task begins");
		try {
			System.out.println("entered try...");
			int c=10/0;
			System.out.println("from try...");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("from catch...");
		}
		finally {
			System.out.println("from finally.....");
		}
		System.out.println("Program completed task.");

	}

}
