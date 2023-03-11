package exceptionhandlingday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Program task begins");
		try {
			int b = Integer.parseInt(args[0]);// command line arguements
			int a = Integer.parseInt(args[1]);
			int c = b / a;
			System.out.println(c);
			String name = args[2];
			//int data[] = { a, b };
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		System.out.println("Program task completed");

	}

}
